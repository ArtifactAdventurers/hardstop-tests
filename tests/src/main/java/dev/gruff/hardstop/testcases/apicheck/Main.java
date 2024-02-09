package dev.gruff.hardstop.testcases.apicheck;

import dev.gruff.hardstop.testcases.apicheck.*;

public class Main {
    public static void main(String[] args) {

        /*
        String rev=args[0];
        System.out.println("tests for "+rev);

        try {
            print(rev,"justaclass=" + JustAClass.checkMe());
        } catch(IncompatibleClassChangeError ce) {
            print(rev,ce.getMessage());
        }

        print(rev,"static final hello="+FieldAccessChecks.helloStaticFinal);
        print(rev,"static hello="+FieldAccessChecks.staticHello);
        print(rev,"static int="+FieldAccessChecks.intStaticFinal);
        MethodChanges m=new MethodChanges();
        try {
            print(rev, "ri=" + m.returnInteger());
        }catch (NoSuchMethodError nsme) {
            nsme.printStackTrace();
            print(rev,"XXX"+nsme.getMessage());
        }
        try {
        print(rev,"rn="+m.returnNumber());
        }catch (NoSuchMethodError nsme) {
            print(rev,"XXX"+nsme.getMessage());
        }

      //  HierarchyCheckChangeOfParent cc=new HierarchyCheckChangeOfParent();
      //  print(rev,""+cc.length("xyz"));

        Parent p=new Parent();
        print(rev,"SP"+p.getName());
        Grandchild c=new Grandchild();
        print(rev,"C="+c.getName());
       // Parent pt=c;
       // print(rev,"P="+pt.getName());
        Grandparent gp=c;
        print(rev,"GP="+gp.getName());

*/
    }

    private static void print(String rev, String s) {
        System.out.println(rev+" :: "+s);
    }
}