import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {
    @Test
    public void decode_Instantiates_True() {
        Decoding decoding = new Decoding("a", 1);
        assertTrue(decoding instanceof  Decoding);
    }

    @Test
    public void decode_getInputText_String() {
        Decoding decoding = new Decoding("a", 1);
        assertEquals("a", decoding.getInputText());
    }

    @Test
    public void decode_emptyString_String() {
        Decoding decoding = new Decoding("", 1);
        assertEquals("", decoding.getInputText());
    }

    @Test
    public void decode_getInputtedKey_int() {
        Decoding decoding = new Decoding("a", 1);
        assertEquals(1, decoding.getInputtedKey());
    }

    @Test
    public void decode_singleCharacter_Character() {
        Decoding decoding = new Decoding("b", 1);
        assertEquals("a", decoding.decodeMultipleCharacters());
    }

    @Test
    public void decode_multipleCharacters_String() {
        Decoding decoding = new Decoding("bcd", 1);
        assertEquals("abc", decoding.decodeMultipleCharacters());
    }

    @Test
    public void decode_upperCaseLetters_String() {
        Decoding decoding = new Decoding("JK", 2);
        assertEquals("HI", decoding.decodeMultipleCharacters());
    }

    @Test
    public void decode_ignoreWhiteSpace_String() {
        Decoding decoding = new Decoding("uif rvjdl", 1);
        assertEquals("the quick", decoding.decodeMultipleCharacters());
    }

    @Test
    public void decode_ignoreSymbols_String() {
        Decoding decoding = new Decoding("@uif r$vjd#l", 1);
        assertEquals("@the q$uic#k", decoding.decodeMultipleCharacters());
    }
}