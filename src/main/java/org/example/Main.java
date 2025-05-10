package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println("-----");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println("-----");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        char[] digits = Integer.toString(num).toCharArray();
        String reversed = "";

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed += digits[i];
        }

        return reversed.equals(Integer.toString(num));
    }

    public static boolean isPerfectNumber(int num) {
        if ( num < 0 ) {
            return false;
        } else {
            int sum = 0;
            for ( int i = 1; i < num; i++){ // daha iyi performans için (int i = 1; i <= num / 2; i++)
                if (num % i == 0) {
                    sum += i;
                }
            }
            return num == sum;
        }
    }

    public static String numberToWords(int num) {

    if(num < 0) return "Invalid Value";

    char[] digits = String.valueOf(num).toCharArray();
    String numToWord = "";
    for (char digit : digits) {
        switch (digit) {
            case '0':
                numToWord += "Zero ";
                break;
            case '1':
                numToWord += "One ";
                break;
            case '2':
                numToWord += "Two ";
                break;
            case '3':
                numToWord += "Three ";
                break;
            case '4':
                numToWord += "Four ";
                break;
            case '5':
                numToWord += "Five ";
                break;
            case '6':
                numToWord += "Six ";
                break;
            case '7':
                numToWord += "Seven ";
                break;
            case '8':
                numToWord += "Eight ";
                break;
            case '9':
                numToWord += "Nine ";
                break;
            default:
                break;
        }
    }

    return numToWord.trim();

    }

}
