package models;

public class Encoding {

    private String input;
    private int shiftKey;
    public String getInput(String text, int key) {
        this.input=text;
        return text;
    }

    public boolean validate(int key) {
        this.shiftKey= key;
        return(key>0 && key<26);
    }

    public String encodeText(String text, int key) {
        String encodedText = "";
        this.input = text;
        this.shiftKey = key;
//        if(key>26) {
//            key = key % 26;
//        }else if(key < 0) {
//            key = (key %26) + 26;
//        }

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
