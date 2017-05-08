package MathOperations;

import java.util.Scanner;

/**
 * Created by Marinka on 23.04.2017.
 */
public class MathOperations {

    public MathOperations() {

    }
    //static mathOperations mathOperations = new mathOperations();
    public void calculations(){
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The sum of numbers is " + (a+b));
        System.out.println("The deduction of numbers is " + (a-b));
        System.out.println("The multiplication result of numbers is " + (a*b));
        System.out.println("The division result of numbers is " +(a/b));
    }
/*
    public static void main(String[] args) {
        mathOperations.calculations();
    }
    */
}
