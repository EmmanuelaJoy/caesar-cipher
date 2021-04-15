public class Decoding {

    private String encodedText;
    private int inputtedKey;

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

    public char decodeSingleCharacter() {
        String text = this.getInputText();
        int key = this.getInputtedKey();
        char letter = 'b';
        char[] letters = text.toCharArray();
        for(char l: letters) {
            l -= key;
            letter =l;
            return l;
        }

        return letter;
    }

}
