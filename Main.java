public class Main {
    public static void main(String args[]) throws Exception{
        AES_ENCRYPTION sm = AES_ENCRYPTION.getInstanceAesEncryption();
        String input = "baeldung";
        String algorithm = "AES/CBC/PKCS5Padding";
        String cipherText = AES_ENCRYPTION.encrypt(input);
        String plainText = AES_ENCRYPTION.decrypt("TkatwZOa3HjoyDYMZdKGSg==");
        System.out.println("plainText = " + plainText);
        System.out.println("cipherText = " + cipherText);


    }
}
