import dev.gruff.hardstop.testcases.apicheck.MethodChanges;
import dev.gruff.hardstop.testcases.apicheck.Version;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethodChange {

    @Test
    public void testMethodSignatureChange() {
        MethodChanges m=new MethodChanges();
        if(Version.isV1()) {
            Integer i = m.returnInteger();
            assertNotNull(i);
        } else {
            try {
                Integer i = m.returnInteger();
                fail("expected error");
            } catch(NoSuchMethodError nsme) {
                assertEquals("'java.lang.Integer dev.gruff.hardstop.testcases.apicheck.MethodChanges.returnInteger()'",nsme.getMessage());
            }
        }


    }
}
