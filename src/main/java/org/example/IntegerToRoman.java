/*
@author User
@project lab3Quality
@class IntegerToRoman
@version 1.0.0
@since 03.04.2025 - 22.26
*/
package org.example;
import java.util.Scanner;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            return null;
        }

        String[] romanSymbols = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] values = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(romanSymbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число для конвертації в римську цифру:");


        try {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 1 || num > 3999) {
                System.out.println("Число повинно бути між 1 і 3999.");
            } else {
                System.out.println("Римська цифра: " + intToRoman(num));
            }
        } catch (NumberFormatException e) {
            System.out.println("Введіть коректне ціле число.");
        }

        scanner.close();
    }
}


