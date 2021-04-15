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
}
