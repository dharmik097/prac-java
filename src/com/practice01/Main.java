package com.practice01;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        System.out.println("Jay HInd");

        int age = 30;
        int temperature = 25;
        int herAge = age; //use copy
        System.out.println(age);
        System.out.println(temperature);
        System.out.println(herAge);

        // byte -1 [-128 to 127]
        // short -2
        // int -4
        // long -8
        // float - 4 3.14
        // double - 8
        // char - 2 a,b,c,d
        // boolean - 1 true/false
        // all types has certain range we cant store value beyond that.
        // examples
//
//        byte age = 30;
//        int phone = 1234567890;
//        long phone2 = 12345678900L;
//        float pi = 3.14F;
//        char letter = '@';
//        boolean isAdult = true;


        //non-primitive types
        //strings
        String name = "Dharam";
        System.out.println(name.length());
        System.out.println(name);
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));
        // replace

        String name2 = "Dharam";
        String name3 = name2.replace('D', 'K');
        System.out.println(name3);

        // substring
        System.out.println(name3.substring(2,5));

        // Arrays

        int math = 30;
        int physics = 97;
        int chem = 98;
        int eng = 95;

        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // length
        System.out.println(marks.length);

        // sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // 2d array
        int[] marks2 = {97,98,95};

        int[][] finaMarks = {{97,98,95},{99,99,99}};
        System.out.println(finaMarks[0][0]);
        System.out.println(finaMarks[1][0]);
        System.out.println(finaMarks[0][1]);
        System.out.println(finaMarks[1][1]);

        // casting
        double price = 100.00;
        double finalPrice = price + 18;
        System.out.println(finalPrice);

        int p = 100;
        int fp = p + (int)18.99; //if rmv (int) it will show error,because decimal values are nit compitable to int
        System.out.print(fp);

        // constants

        int Age = 30; // its variable
        // but what about constant ??

        float pi = 3.14F; // still it coluld be change
        final float PI = 3.14F; //now its final it remain constant it tradition to use upper case.


        // operators
        // + - * / %

        int a = 1;
        int b = 2;

        int add = a + b;
        System.out.println(add);
        int sub = a - b;
        System.out.println(sub);
        double mult = a * b;
        System.out.println(mult);
        double div = a / b;
        System.out.println(div);
        double mod = a % b;
        System.out.println(mod);













    }
}

