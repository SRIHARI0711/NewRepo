// BadCode.java
// Intentionally poor-quality Java code for SonarQube testing only.

import java.util.*;
import java.io.*;

public class BadCode {

    public static int GLOBAL = 0;

    public static void main(String[] args) {

        System.out.println("Starting bad code...");

        int x = 10;
        int y = 20;
        int z = 0;

        // Dead code
        if (false) {
            System.out.println("This will never execute");
        }

        // Duplicate logic + poor naming
        if (x > 0) {
            z += x;
        } else {
            z -= x;
        }

        if (y > 0) {
            z += y;
        } else {
            z -= y;
        }

        // Empty catch block
        try {
            int a = 10 / 0;
        } catch (Exception e) {

        }

        // Nested complexity
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {

                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            if (k % 2 == 0) {
                                System.out.println(i + " " + j + " " + k);
                            } else {
                                System.out.println("odd");
                            }
                        }
                    }
                }
            }
        }

        // Unused variables
        int unused1 = 100;
        String unused2 = "Hello";

        // Bad string concatenation in loop
        String s = "";
        for (int i = 0; i < 100; i++) {
            s = s + i;
        }

        // Null pointer risk
        String name = null;

        if (name.equals("test")) {
            System.out.println("Test");
        }

        // Hardcoded password
        String password = "admin123";

        // Resource leak
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            int data = fis.read();
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Long method style
        badMethod(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Finished");
    }

    public static int badMethod(
            int a,
            int b,
            int c,
            int d,
            int e,
            int f,
            int g,
            int h,
            int i,
            int j
    ) {

        int result = 0;

        if (a > 0) {
            result += a;
        } else {
            result -= a;
        }

        if (b > 0) {
            result += b;
        } else {
            result -= b;
        }

        if (c > 0) {
            result += c;
        } else {
            result -= c;
        }

        if (d > 0) {
            result += d;
        } else {
            result -= d;
        }

        if (e > 0) {
            result += e;
        } else {
            result -= e;
        }

        if (f > 0) {
            result += f;
        } else {
            result -= f;
        }

        if (g > 0) {
            result += g;
        } else {
            result -= g;
        }

        if (h > 0) {
            result += h;
        } else {
            result -= h;
        }

        if (i > 0) {
            result += i;
        } else {
            result -= i;
        }

        if (j > 0) {
            result += j;
        } else {
            result -= j;
        }

        return result;
    }
}
