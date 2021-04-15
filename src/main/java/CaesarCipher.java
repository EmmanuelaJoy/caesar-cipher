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
            String input = myConsole.readLine();
            System.out.println("Now enter a key of any number between 1 and 25");
            int key = Integer.parseInt(myConsole.readLine());
            Encoding encoding = new Encoding(input, key);
            System.out.println("All set now, here is the result: ");
            System.out.println("Your input: " + input);
            System.out.println("Encrypted input: " );

        }
    }
}