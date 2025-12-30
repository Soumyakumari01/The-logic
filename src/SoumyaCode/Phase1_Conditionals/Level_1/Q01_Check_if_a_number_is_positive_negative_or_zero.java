package SoumyaCode.Phase1_Conditionals.Level_1;

import java.util.Scanner;

public class Q01_Check_if_a_number_is_positive_negative_or_zero {
    // =========================================================================
    // QUESTION 1: Check if a number is positive, negative, or zero
    // =========================================================================
    /*
     * LOGIC EXPLANATION:
     * - If number > 0, it's positive
     * - If number < 0, it's negative
     * - If number == 0, it's zero_
     *
     * KEY CONCEPT: Comparison operators (>, <, ==)
     */
    static Scanner sc = new Scanner(System.in);

    public static void question1() {
        System.out.println("Enter your number ");
        int num=sc.nextInt();

        if (num>0){
            System.out.println("its positive number");
        } else if (num<0) {
            System.out.println("its negative number");

        }
        else {
            System.out.println("its zero");
        }
    }
    public static void main(String[] args) {
        question1();
    }

}
