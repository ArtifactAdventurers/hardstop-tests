import dev.gruff.hardstop.testcases.apicheck.AbstractClassToInterface;
import dev.gruff.hardstop.testcases.apicheck.Version;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class TestAbstractClassToInterface {


    @Test
    public void test() {

        if(Version.isV1()) {
            AbstractClassToInterface a = new AbstractClassToInterface() {
                @Override
                public void callme() {

                }
            };

            a.callme();
        }
        else {
            try {
                AbstractClassToInterface a = new AbstractClassToInterface() {
                    @Override
                    public void callme() {

                    }
                };

                a.callme();
                fail("should throw error");

            } catch( IncompatibleClassChangeError icce) {
               ;
            }
        }

    }
}
