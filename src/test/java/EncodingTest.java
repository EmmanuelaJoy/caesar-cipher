import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {

    @Test
    public void encode_instantiates_True() {
        Encoding encoding = new Encoding();
        assertTrue(encoding instanceof  Encoding);
    }

    @Test
    public void getInput_readStringAndKey_String() {
        Encoding encoding = new Encoding();
        assertEquals("a", encoding.getInput("a", 1));
    }

    @Test
    public void validate_isStringEmpty_String() {
        Encoding encoding = new Encoding();
        assertEquals("", encoding.getInput("", 1));
    }

    @Test
    public void validate_isKeyValid_Boolean() {
        Encoding encoding = new Encoding();
        boolean valid = true;
        assertEquals(valid, encoding.validate(1));
    }

    @Test
    public void encode_singleStringCharacter_Character() {
        Encoding encoding = new Encoding();
        assertEquals("b", encoding.encodeText("a", 1));

    }

    @Test
    public void encode_multipleStringCharacters_String() {
        Encoding encoding = new Encoding();
        assertEquals("bcd", encoding.encodeText("abc", 1));
    }

    @Test
    public void encode_upperCaseLetters_String() {
        Encoding encoding = new Encoding();
        assertEquals("JK", encoding.encodeText("HI", 2));
    }

    @Test
    public void encode_ignoreWhiteSpace() {
        Encoding encoding = new Encoding();
        assertEquals("uif rvjdl", encoding.encodeText("the quick", 1));
        assertEquals("IJ DPEF", encoding.encodeText("HI CODE", 1));
    }
}