import dev.gruff.hardstop.testcases.apicheck.FieldAccessChecks;
import dev.gruff.hardstop.testcases.apicheck.Version;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStaticFieldValue {

    @Test
    public void testStaticFinal() {
        // V2 has different value from V1 but
        // should not show up as value is copied at compile time
        if(Version.isV1()) {
            assertEquals("helloV1SF", FieldAccessChecks.helloStaticFinal);
        } else {
            assertEquals("helloV1SF", FieldAccessChecks.helloStaticFinal);
        }

    }

    @Test
    public void testStatic() {
        // V2 has different value from V1
        if(Version.isV1()) {
            assertEquals("helloV1S", FieldAccessChecks.staticHello);
        } else {
            assertEquals("helloV2S", FieldAccessChecks.staticHello);
        }

    }
}
