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
}