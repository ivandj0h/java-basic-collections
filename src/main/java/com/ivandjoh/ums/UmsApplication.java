package com.ivandjoh.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import static com.ivandjoh.ums.Greetings.sayHello;
import static com.ivandjoh.ums.Greetings.sayMyName;

@SpringBootApplication
public class UmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UmsApplication.class, args);

        String name = "Dave";

        System.out.println(sayHello());
        Greetings.dataTypes();
        System.out.println(sayMyName(name));

        // Show Lists
        List<String> hobbies = Greetings.showMyHobbies();
        System.out.println("My hobbies are: " + hobbies);

        // Static Method Person Object
        List<Person> persons = Greetings.showPersons();
        for (Person person : persons) {
            System.out.println(person.getName());
        }

        // If Else
        int number = -10;
        Greetings.ifElseStatement(number);

        // Switch Case
        int day = 12;
        Greetings.switchCase(day);

        // For Loop
        Greetings.forLoop(1, 7);

        // Array ( Lists )
        int[] numbers = {1, 2, 3, 4};
        Greetings.arrayLoop(numbers);

        // Mixed Array Lists
        // Membuat ArrayList yang bisa menyimpan berbagai jenis data
        ArrayList<Object> mixedList = new ArrayList<>();

        // Menambahkan berbagai jenis data ke dalam ArrayList
        mixedList.add("juna");
        mixedList.add(8);
        mixedList.add(false);

        Greetings.printMixedList(mixedList);

        // Try Catch Block
        try {
            int result = Greetings.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Multiple Catch Block
        int[] listNumbers = {1, 2, 3};
        Greetings.multipleCatchBlock(listNumbers);

        // Try Catch Finally by reading txt file
        Greetings.tryCatchFinally();
    }
}
