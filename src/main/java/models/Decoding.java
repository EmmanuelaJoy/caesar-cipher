package models;

public class Decoding {

    private String encodedText;
    private int inputtedKey;
    private String decodedText = "";

    public Decoding(String text, int key) {
        this.encodedText = text;
        this.inputtedKey = key;
    }

    public String getInputText() {
        return this.encodedText;
    }

    public int getInputtedKey() {
      return this.inputtedKey;
    }

    public boolean validate() {
        int key = this.inputtedKey;
        return(key>0 && key<26);
    }

    public String decodeMultipleCharacters() {
        String text = this.getInputText();
        int key = this.getInputtedKey();
        String decoded = this.decodedText;

        char[] letters = text.toCharArray();
        for(int i=0; i<letters.length; i++) {
            char individualLetter = letters[i];
            if(Character.isLetter(individualLetter)) {

                if(Character.isUpperCase(individualLetter)){

                    char ch = (char)(individualLetter - key);
                    if(ch < 'A') {
                        decoded += (char)(individualLetter + (26 - key));
                    } else {
                        decoded += ch;
                    }

                } else if(Character.isLowerCase(individualLetter)) {
                    char ch = (char)(individualLetter - key);
                    if(ch < 'a') {
                        decoded += (char) (individualLetter + (26 - key));
                    } else {
                        decoded +=ch;
                    }
                }
            } else {
                decoded += individualLetter;
            }
        }

        return decoded;
    }
}
