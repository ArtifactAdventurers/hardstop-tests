package hardstop.tests;

import dev.gruff.hardstop.api.*;
import dev.gruff.hardstop.core.builder.HSStoreBuilder;
import dev.gruff.hardstop.core.reader.APIComparision;
import org.junit.jupiter.api.Test;

import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLog4JVersions {


    @Test

    public void test1() {

       HSStore store= HSStoreBuilder.config()
               .build();

       HSComponentSet L1_1_3 = store.components("log4j","log4j","1.1.3");
        HSComponentSet L1_2_11 = store.components("log4j","log4j","1.2.11");

        assertEquals(1,L1_1_3.size());
        assertEquals(1,L1_2_11.size());

       HSClass c1= L1_1_3.only().classByName("org.apache.log4j.BasicConfigurator").only();
       HSClass c2=L1_2_11.only().classByName("org.apache.log4j.BasicConfigurator").only();


        HSapiResults results= HSapiComparitorBuilder().config()
                .addClass(c1)
                .addClass(c2)
                .publicOnly()
                .build()
                .compare();


    }

}
