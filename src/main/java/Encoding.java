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

    public char shiftSingleCharacter(String text, int key) {
        this.input = text;
        this.shiftKey = key;
        char letter = 'a';
        char[] letters = text.toCharArray();
        for(char l: letters) {
            if(l!= ' ') {
                l+=key;
                letter = l;
            }
        }
        return letter;
    }
}
