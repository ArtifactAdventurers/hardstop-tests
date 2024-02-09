import dev.gruff.hardstop.testcases.apicheck.EnumLosesValue;
import dev.gruff.hardstop.testcases.apicheck.Version;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestLostEnum {

    @Test
    public void testEnumSize() {
        if(Version.isV1()) {
            assertEquals(6, EnumLosesValue.values().length);
        }
        else {
            assertEquals(5,EnumLosesValue.values().length);
            }
    }
@Test
    public void testLostEnum() {
        if(Version.isV1()) {
            assertEquals("c",EnumLosesValue.c.name());
        }
        else {
            try {
                assertEquals("c", EnumLosesValue.c.name());
                fail("error expected");
            } catch(NoSuchFieldError e) {
                assertEquals("c",e.getMessage());
            }
        }
    }
}
