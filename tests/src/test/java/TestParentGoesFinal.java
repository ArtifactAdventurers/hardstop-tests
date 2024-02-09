import dev.gruff.hardstop.testcases.apicheck.ParentGoesFinal;
import dev.gruff.hardstop.testcases.apicheck.Version;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestParentGoesFinal {

    @Test
    public void test() {

        if(Version.isV1()) {
            ParentGoesFinal p=new ParentGoesFinal(){};
        }
         else {
             try {
                 ParentGoesFinal p = new ParentGoesFinal() {};
                 fail("exception expected");

             } catch(IncompatibleClassChangeError icce) {
                 assertEquals("class TestParentGoesFinal$2 cannot inherit from final class dev.gruff.hardstop.testcases.apicheck.ParentGoesFinal",icce.getMessage());
             }
        }
    }
}
