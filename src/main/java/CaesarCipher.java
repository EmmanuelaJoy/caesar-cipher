import models.Decoding;
import models.Encoding;

import java.io.Console;

public class CaesarCipher{
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Welcome to Caesar-Cipher App. Follow the steps below to encrypt and decrypt any letters or words of your choice");
        boolean programRunning = true;

        while(programRunning) {
            System.out.println("What action do you want to perform? Enter one of the following options: Encrypt or Decrypt or Exit");
            String choice = myConsole.readLine();

            if (choice.equals("Encrypt")) {
                System.out.println("Enter any word or letter and i will encrypt it for you");
                String inputtedText = myConsole.readLine();

                System.out.println("Now enter a key of any number in the range of 1-25");
                int encryptingKey = Integer.parseInt(myConsole.readLine());
                Encoding encoding = new Encoding(inputtedText, encryptingKey);
                boolean valid = encoding.validate();

                if (valid == true) {
                    String encryptedText = encoding.encodeText();
                    System.out.println("All set now, here is the result: ");
                    System.out.println("Encrypted input: " + encryptedText);
                } else if (valid == false) {
                    System.out.println("Key invalid. Enter a number in the range of 1-25 next time");
                }

            } else if (choice.equals("Decrypt")) {
                System.out.println("Enter any encrypted word or letter and i will decrypt it for you");
                String encryptedWord = myConsole.readLine();
                System.out.println("Now enter a key of any number in the range of 1-25");
                int decryptingKey = Integer.parseInt(myConsole.readLine());
                Decoding decoding = new Decoding(encryptedWord, decryptingKey);
                boolean valid = decoding.validate();

                if (valid == true) {
                    String decryptedText = decoding.decodeMultipleCharacters();
                    System.out.println("All set now, here is the result: ");
                    System.out.println("Decrypted input: " + decryptedText);
                } else if (valid == false) {
                    System.out.println("Key invalid. Enter a number in the range of 1-25 next time");
                }

            } else if (choice.equals("Exit")) {
                System.out.println("Goodbye");
                programRunning = false;
            } else {
                System.out.println("I'm sorry but we do not recognize your input. Try again.");
            }
        }
    }
}