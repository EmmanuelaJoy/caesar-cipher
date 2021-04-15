package models;

public class Encoding {

    private String input;
    private int shiftKey;
    private String encodedText = "";

    public Encoding(String input, int key) {
        this.input = input;
        this.shiftKey = key;
    }

    public String getInput() {
       return this.input;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }

    public String getEncodedText() {
        return encodedText;
    }

    public boolean validate() {
        int key = this.shiftKey;
        return(key>0 && key<26);
    }

    public String encodeText() {
        String text = this.input;
        int key = this.shiftKey;

        char[] letters = text.toCharArray();
        for(int i=0; i<letters.length; i++) {
            char individualLetter = letters[i];
            if(Character.isLetter(individualLetter)) {

                if(Character.isUpperCase(individualLetter)){

                    char ch = (char)(individualLetter + key);
                    if(ch > 'Z') {
                        encodedText += (char)(individualLetter - (26 - key));
                    } else {
                        encodedText += ch;
                    }

                } else if(Character.isLowerCase(individualLetter)) {
                    char ch = (char)(individualLetter + key);
                    if(ch > 'z') {
                        encodedText += (char) (individualLetter - (26-key));
                    } else {
                        encodedText +=ch;
                    }
                }
            } else {
                encodedText += individualLetter;
            }
        }

        return encodedText;
    }

}
