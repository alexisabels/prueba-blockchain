Proyecto simple que implementa una blockchain básica en Java. Práctica para entender cómo funcionan los bloques, el hashing y la minería.

Estructura del Proyecto
Block.java: Define la estructura de un bloque, incluyendo su hash, hash previo, datos y lógica de minería.
StringUtil.java: Contiene utilidades para aplicar el algoritmo SHA-256.
Main.java: Contiene el punto de entrada del programa y la lógica para crear y validar la cadena de bloques.

### Ejemplo de output

```plaintext
Trying to Mine block 1... 
Block mined: 000008a03da8ea7f7fca59e4f588ce21bf9c282a201bde37d1134046aa54e138
Trying to Mine block 2... 
Block mined: 000009be8f8370016c858fcc5b876879b4fa06fd30a56bd6117ccd643cb5ecf6
Trying to Mine block 3... 
Block mined: 00000f10ea237026d2ecb83fbd9ceb0a7d5a048f6800c02f85a3b724429706e3
Blockchain is valid?: true

The block chain: 
[
  {
    "hash": "000008a03da8ea7f7fca59e4f588ce21bf9c282a201bde37d1134046aa54e138",
    "previousHash": "0",
    "data": "Hola, soy el primer bloque.",
    "timeStamp": 1745067131027,
    "nonce": 922920
  },
  {
    "hash": "000009be8f8370016c858fcc5b876879b4fa06fd30a56bd6117ccd643cb5ecf6",
    "previousHash": "000008a03da8ea7f7fca59e4f588ce21bf9c282a201bde37d1134046aa54e138",
    "data": "Hola, soy el segundo bloque.",
    "timeStamp": 1745067132738,
    "nonce": 1052982
  },
  {
    "hash": "00000f10ea237026d2ecb83fbd9ceb0a7d5a048f6800c02f85a3b724429706e3",
    "previousHash": "000009be8f8370016c858fcc5b876879b4fa06fd30a56bd6117ccd643cb5ecf6",
    "data": "Hola, soy el tercer bloque.",
    "timeStamp": 1745067134190,
    "nonce": 85758
  }
]

Process finished with exit code 0
