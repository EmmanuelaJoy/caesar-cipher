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


}