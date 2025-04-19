import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringUtil {
    // esto recibe un string y simplemente le aplica el algoritmo sha256, y devuelve la firma generada como string
    public static String applySha256(String input)  {
        try {

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        // aplica sha256 al input
        byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
