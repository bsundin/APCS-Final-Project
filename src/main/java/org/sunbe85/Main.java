package org.sunbe85;

import org.sunbe85.interfaces.Test1;

import static java.lang.System.*;

public class Main implements Test1 {
    public static void main(String[] args) {
        out.println("Hello World!");
        Main test = new Main();
        test.printTest("test1");
    }

    @Override
    public void printTest(String prtTst) {
        out.println(prtTst);
    }
}