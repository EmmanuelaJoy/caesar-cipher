import models.Encoding;
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
    public void encode_singleStringCharacter_String() {
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
    public void encode_lowerAndUpperCaseLetters_String() {
        Encoding encoding = new Encoding();
        assertEquals("Ifmmp", encoding.encodeText("Hello", 1));
    }

    @Test
    public void encode_lettersWithNumber_String() {
        Encoding encoding = new Encoding();
        assertEquals("j bn 15", encoding.encodeText("i am 15", 1));
    }

    @Test
    public void encode_ignoreWhiteSpace_String() {
        Encoding encoding = new Encoding();
        assertEquals("uif rvjdl", encoding.encodeText("the quick", 1));
        assertEquals("IJ DPEF", encoding.encodeText("HI CODE", 1));
    }

    @Test
    public void encode_ignoreSymbols_String() {
        Encoding encoding = new Encoding();
        assertEquals("@uif r$vjd#l", encoding.encodeText("@the q$uic#k", 1));
        assertEquals("I*J D^PEF", encoding.encodeText("H*I C^ODE", 1));
    }

    @Test
    public void encode_theQuickBrownFox_String() {
        Encoding encoding = new Encoding();
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", encoding.encodeText("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23));
    }
}