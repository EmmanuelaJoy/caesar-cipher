import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {
    @Test
    public void decode_Instantiates_True() {
        Decoding decoding = new Decoding();
        assertTrue(decoding instanceof  Decoding);
    }

    @Test
    public void decode_getInputText_String() {
        Decoding decoding = new Decoding();
        assertEquals("a", decoding.getInputText("a"));
    }
}