import models.Encoding;

import java.io.Console;

public class CaesarCipher{
    public static void main(String[] args) {

        Console myConsole = System.console();
        System.out.println("Welcome to Caesar-Cipher App. Follow the steps below to encrypt and decrypt any letters or words of your choice");
        System.out.println("What action do you want to perform? Enter one of the following options: Encrypt or Decrypt");
        String choice = myConsole.readLine();
        if(choice.equals("Encrypt")) {
            System.out.println("Enter any word or letter and i will encrypt it for you");
            String inputtedText = myConsole.readLine();
            System.out.println("Now enter a key of any number in the range of 1-25");
            int key = Integer.parseInt(myConsole.readLine());
            Encoding encoding = new Encoding(inputtedText, key);
            boolean valid = encoding.validate();

            if(valid == true){
                String encryptedText = encoding.encodeText();
                System.out.println("All set now, here is the result: ");
                System.out.println("Encrypted input: " + encryptedText);
            } else if (valid == false) {
                System.out.println("Enter a valid key");
            }

        }
    }
}