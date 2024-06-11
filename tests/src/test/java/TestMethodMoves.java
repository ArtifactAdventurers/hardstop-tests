import dev.gruff.hardstop.testcases.apicheck.MethodMoves;
import dev.gruff.hardstop.testcases.apicheck.Version;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethodMoves {


    @Test
    public void testMovesParentToChild() {

        if(Version.isV1()) {
            MethodMoves.Child c=new MethodMoves.Child();
            c.callme();
        } else {
            MethodMoves.Child c=new MethodMoves.Child();
            c.callme();
        }
    }
}
