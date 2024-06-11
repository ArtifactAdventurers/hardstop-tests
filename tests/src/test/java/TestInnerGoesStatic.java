import dev.gruff.hardstop.testcases.apicheck.InnerClassGoesStatic;
import dev.gruff.hardstop.testcases.apicheck.Version;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestInnerGoesStatic {


    @Test
    public void testInnerGoesStatic() {

        if(Version.isV1()) {
            InnerClassGoesStatic i = new InnerClassGoesStatic();
            InnerClassGoesStatic.Inner i1 = i.new Inner();
            i1.callme();
        } else {
            InnerClassGoesStatic i = new InnerClassGoesStatic();
            try {
                InnerClassGoesStatic.Inner i1 = i.new Inner();
                fail("exception expected");
            } catch(NoSuchMethodError e) {
                assertEquals("'void dev.gruff.hardstop.testcases.apicheck.InnerClassGoesStatic$Inner.<init>(dev.gruff.hardstop.testcases.apicheck.InnerClassGoesStatic)'",e.getMessage());

            }

        }
    }
}
