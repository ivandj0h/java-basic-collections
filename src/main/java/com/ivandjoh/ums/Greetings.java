package com.ivandjoh.ums;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greetings {

    // Method without Params
    public static String sayHello() {
        return "Welcome to Backend";
    }

    public static void dataTypes() {

        // Tipe data primitif
        byte aByte = 100;
        short aShort = 10000;
        int anInt = 100000;
        long aLong = 100000L;
        float aFloat = 10.5f;
        double aDouble = 10.5d;
        char aChar = 'A';
        boolean aBoolean = true;

        // Tipe data referensi
        String aString = "Hello, World!";
        int[] anArray = {1, 2, 3, 4, 5};

        System.out.println("byte: " + aByte);
        System.out.println("short: " + aShort);
        System.out.println("int: " + anInt);
        System.out.println("long: " + aLong);
        System.out.println("float: " + aFloat);
        System.out.println("double: " + aDouble);
        System.out.println("char: " + aChar);
        System.out.println("boolean: " + aBoolean);
        System.out.println("String: " + aString);
        System.out.print("Array: ");
        for (int num : anArray) {
            System.out.print(num + " ");
        }
    }

    // Method with Params
    public static String sayMyName(String name) {
        return "\n\nHi, Nama saya adalah " + name;
    }

    // Method with List
    public static List<String> showMyHobbies() {
        return Arrays.asList("Reading", "Coding", "Hiking");
    }

    // Method with Object
    public static List<Person> showPersons() {
        return Arrays.asList(
                new Person(1, "John Doe", "john.doe@example.com", "123-456-7890"),
                new Person(2, "Jane Smith", "jane.smith@example.com", "987-654-3210"),
                new Person(3, "Emily Johnson", "emily.johnson@example.com", "555-666-7777")
        );
    }

    // If Else
    public static void ifElseStatement(int number) {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
    }

    // Switch Case
    public static void switchCase(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day " + day + " is " + dayName);
    }

    // For loop
    public static void forLoop(int start, int limit) {
        for (int i = start; i < limit; i++) {
            System.out.println("Iteration: " + i);
        }
    }

    // Array lopp
    public static void arrayLoop(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Mixed Array Lists
    public static void printMixedList(ArrayList<Object> list) {
        StringBuilder result = new StringBuilder();
        result.append("[");

        for (int i = 0; i < list.size(); i++) {
            Object element = list.get(i);
            if (element instanceof String) {
                result.append("\"").append(element).append("\"");
            } else {
                result.append(element);
            }
            if (i < list.size() - 1) {
                result.append(", ");
            }
        }

        result.append("]");
        System.out.println(result.toString());
    }

    // Try Catch Block
    public static int divide(int a, int b) {
        return a / b;
    }

    // multiple Catch Block
    public static void multipleCatchBlock(int[] listNumbers) {
        try {
            System.out.println(listNumbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        }
    }

    // Try Catch Finally by reading txt file
    public static void tryCatchFinally() {
        BufferedReader reader = null;
        try {
            InputStream inputStream = Greetings.class.getResourceAsStream("/static/file-static.txt");
            assert inputStream != null;
            reader = new BufferedReader(new InputStreamReader(inputStream));

            // Membaca semua baris ke dalam daftar
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            // Mencetak semua baris
            for (String allLines : lines) {
                System.out.println(allLines);
            }

            // Membaca baris pertama saja
            if (!lines.isEmpty()) {
                System.out.println("First line of the file: " + lines.getFirst());
            }

            // Membaca baris ketiga saja
            if (lines.size() >= 3) {
                System.out.println("Third line of the file: " + lines.get(2));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error: Unable to close the file.");
            }
        }
    }
}
