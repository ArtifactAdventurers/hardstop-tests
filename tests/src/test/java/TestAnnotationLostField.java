import dev.gruff.hardstop.testcases.apicheck.RuntimeAnnotation;
import dev.gruff.hardstop.testcases.apicheck.Version;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

import static org.junit.jupiter.api.Assertions.*;

public class TestAnnotationLostField {

   @Test
    public void test1() {

       if(Version.isV1()) {
          RuntimeAnnotation ra= AnnotatedClass.class.getAnnotation(RuntimeAnnotation.class);
          assertNotNull(ra);
          assertEquals("title",ra.title());
          assertEquals(String.class,ra.action1());
          assertEquals(1,ra.action2());
          assertEquals(2,ra.action3());
          assertEquals("id",ra.id());

       } else {

          RuntimeAnnotation ra= AnnotatedClass.class.getAnnotation(RuntimeAnnotation.class);
          assertNotNull(ra);
          assertEquals("title",ra.title());
          assertEquals(String.class,ra.action1());
          try {
             assertEquals(1, ra.action2());
             fail("error expected");
          }
          catch(NoSuchMethodError e) {
            assertEquals("'int dev.gruff.hardstop.testcases.apicheck.RuntimeAnnotation.action2()'",e.getMessage());
          }
          assertEquals(2,ra.action3());
          assertEquals("id",ra.id());
       }
   }
}


@RuntimeAnnotation(title="title" ,action1 = String.class,action2 = 1,action3 = 2, id="id")
class AnnotatedClass {

}
