import dev.gruff.hardstop.testcases.apicheck.RecordGainsField;
import dev.gruff.hardstop.testcases.apicheck.Version;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.fail;

public class TestRecordGainsField {


    @Test
    public void test() {

        if(Version.isV1()) {
                RecordGainsField r=new RecordGainsField("a",1);
             }
        else {
            try {
                RecordGainsField r=new RecordGainsField("a",1);
               fail("should throw error");

            } catch( NoSuchMethodError nme) {
               ; // expected
            }
        }

    }
}
