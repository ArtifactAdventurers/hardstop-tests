import dev.gruff.hardstop.testcases.apicheck.DroppedRuntimeAnnotation;
import dev.gruff.hardstop.testcases.apicheck.Version;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDroppedAnnotation {

    @Test
    public void testDroppedAnnotation() {

        if(Version.isV1()) {
            DroppedRuntimeAnnotation dr = AnnotatedClassWithDroppedAnnotation.class.getAnnotation(DroppedRuntimeAnnotation.class);
            assertNotNull(dr);
        } else {
            try {
                DroppedRuntimeAnnotation dr = AnnotatedClassWithDroppedAnnotation.class.getAnnotation(DroppedRuntimeAnnotation.class);
                fail("exception expected");
            } catch(NoClassDefFoundError e) {
                assertEquals("dev/gruff/hardstop/testcases/apicheck/DroppedRuntimeAnnotation",e.getMessage());
            }
        }
    }
}

@DroppedRuntimeAnnotation
class AnnotatedClassWithDroppedAnnotation {

}
