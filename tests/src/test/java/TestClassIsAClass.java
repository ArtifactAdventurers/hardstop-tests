import dev.gruff.hardstop.testcases.apicheck.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClassIsAClass {

    @Test
    public void testme() {

        if(Version.isV1()) {
            assertFalse(JustAClass.class.isInterface());
        } else {
            assertTrue(JustAClass.class.isInterface());
        }


    }
}
