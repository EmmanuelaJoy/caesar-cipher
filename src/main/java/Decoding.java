public class Decoding {

    private String encodedText;
    private int inputtedKey;


    public String getInputText(String text) {
        this.encodedText = text;
        return text;
    }

    public int getInputtedKey(int key) {
        this.inputtedKey = key;
        return key;
    }
}
