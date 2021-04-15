import models.Encoding;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {

    @Test
    public void encode_instantiates_True() {
        Encoding encoding = new Encoding("a", 1);
        assertTrue(encoding instanceof  Encoding);
    }

    @Test
    public void getInput_readString_String() {
        Encoding encoding = new Encoding("a", 1);
        assertEquals("a", encoding.getInput());
    }

    @Test
    public void getKey_readKey_int() {
        Encoding encoding = new Encoding("a", 1);
        assertEquals(1, encoding.getShiftKey());
    }

    @Test
    public void validate_isStringEmpty_String() {
        Encoding encoding = new Encoding("", 1);
        assertEquals("", encoding.getInput());
    }

    @Test
    public void validate_isKeyValid_Boolean() {
        Encoding encoding = new Encoding("", 1);
        boolean valid = true;
        assertEquals(valid, encoding.validate());
    }

    @Test
    public void encode_singleStringCharacter_String() {
        Encoding encoding = new Encoding("a", 1);
        assertEquals("b", encoding.encodeText());

    }

    @Test
    public void encode_multipleStringCharacters_String() {
        Encoding encoding = new Encoding("abc", 1);
        assertEquals("bcd", encoding.encodeText());
    }

    @Test
    public void encode_upperCaseLetters_String() {
        Encoding encoding = new Encoding("HI", 2);
        assertEquals("JK", encoding.encodeText());
    }

    @Test
    public void encode_lowerAndUpperCaseLetters_String() {
        Encoding encoding = new Encoding("Hello", 1);
        assertEquals("Ifmmp", encoding.encodeText());
    }

    @Test
    public void encode_lettersWithNumber_String() {
        Encoding encoding = new Encoding("i am 15", 1);
        assertEquals("j bn 15", encoding.encodeText());
    }

    @Test
    public void encode_ignoreWhiteSpace_String() {
        Encoding encoding = new Encoding("the quick", 1);
        assertEquals("uif rvjdl", encoding.encodeText());
    }

    @Test
    public void encode_ignoreSymbols_String() {
        Encoding encoding = new Encoding("@the q$uic#k", 1);
        assertEquals("@uif r$vjd#l", encoding.encodeText());
    }

    @Test
    public void encode_theQuickBrownFox_String() {
        Encoding encoding = new Encoding("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23);
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", encoding.encodeText());
    }
}