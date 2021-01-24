package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(100);
//        System.out.println(reverse(100));
//        System.out.println(getDigitCount(1021));

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid number");
        }
        String value = "";
        int reversedNumber = reverse(number);
        for (int i =0; i < getDigitCount(number); i++){
            int remainder = reversedNumber % 10;
            switch (remainder) {
                case 0:
                    value += "Zero ";
                    break;
                case 1:
                    value += "One ";
                    break;
                case 2:
                    value += "Two ";
                    break;
                case 3:
                    value += "Three ";
                    break;
                case 4:
                    value += "Four ";
                    break;
                case 5:
                    value += "Five ";
                    break;
                case 6:
                    value += "Six ";
                    break;
                case 7:
                    value += "Seven ";
                    break;
                case 8:
                    value += "Eight ";
                    break;
                case 9:
                    value += "Nine ";
                    break;
            }
            reversedNumber /= 10;
        }
        System.out.println(value);





        }



    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 1;
        while (number > 9) {
            number = number / 10;
            count++;

        }
        return count;
    }
}
