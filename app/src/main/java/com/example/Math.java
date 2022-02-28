package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Math {
    public String add(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num1 < 0 || num2 < 0) {
            return "A negative number has occurred ";
        }
        return String.valueOf(num1 + num2);
    }

    public String subtract(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());

        return String.valueOf(num1 - num2);

    }

    public String divide(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());

        return String.valueOf(num1 / num2);
    }

    public String multiply(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 * num2);

    }

    public String dividedByZero(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num1 < 0 || num2 < 0) {
            return "Num 1 can't divide by zero";

        }
        return "can't divide by zero";


    }


    public String areSymbolsIncluded(String a, String b) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m1 = p.matcher(a);
        boolean c = m1.find();


        if (c) {
            return "Error encountered special characters";

        }
        return String.valueOf(a+b);



    }


}
