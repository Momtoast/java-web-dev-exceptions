package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        System.out.println(Divide(4,2));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        System.out.println(CheckFileExtension(studentFiles.get("Carl")));
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));

        // Test out your CheckFileExtension() function!
    }

    public static int Divide(int x, int y)
    {
        if (y == 0) {
            try {
                throw new ArithmeticException("You cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }

        return x/y;

    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName == null || fileName.equals("")) {
            try {
                throw new FileNameException("You have failed me.");
            } catch (FileNameException e) {
                e.printStackTrace();
            }
            return -1;
        } else if (fileName.contains(".java")) {
            return 1;
        } else {
            return 0;
        }
    }

}
