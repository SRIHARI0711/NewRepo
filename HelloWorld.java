// BadCode.java
// Intentionally bad Java code for SonarQube analysis

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class BadCode {

    public static String PASSWORD = "admin123"; // Hardcoded credential

    static int global = 0;

    public static void main(String[] args) {

        System.out.println("Program Started");

        String name = null;

        // Possible NullPointerException
        if (name.equals("admin")) {
            System.out.println("Hello");
        }

        // Dead code
        if (false) {
            System.out.println("Never executes");
        }

        // Empty catch block
        try {
            int x = 10 / 0;
        } catch (Exception e) {

        }

        // Resource leak
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            System.out.println(fis.read());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Duplicate logic
        int a = process(10);
        int b = process(20);

        // Infinite loop risk
        int i = 0;
        while (i < 10) {
            System.out.println(i);
        }

        // Unused variables
        int unused = 100;
        String temp = "unused";

        // Inefficient string concatenation
        String s = "";
        for (int j = 0; j < 100; j++) {
            s = s + j;
        }

        // Raw type usage
        List list = new ArrayList();
        list.add("hello");

        // Nested complexity
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                for (int z = 0; z < 5; z++) {

                    if (x > 1) {
                        if (y > 1) {
                            if (z > 1) {
                                System.out.println(x + y + z);
                            }
                        }
                    }

                }
            }
        }

        System.out.println("Done");
    }

    public static int process(int value) {

        int result = 0;

        // Duplicate conditions
        if (value > 0) {
            result += value;
        } else {
            result -= value;
        }

        if (value > 0) {
            result += value;
        } else {
            result -= value;
        }

        return result;
    }
}
