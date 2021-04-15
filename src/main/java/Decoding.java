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
}
