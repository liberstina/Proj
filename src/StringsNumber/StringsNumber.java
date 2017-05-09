package StringsNumber;

import java.util.Scanner;


/**
 * Пользователь вводит количество строк,
 * потом значения этих строк.
 * Программа считает среднюю длину строк и
 * выводит на экран.
 * <p>
 * Created by Marinka on 23.04.2017.
 */
public class StringsNumber {

    public int stringsQuantity() {
        System.out.println("Enter the strings quantity");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public String[] stringsArray(int quantity) {
        String[] arrStrings = new String[quantity];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + quantity + " strings ");
        System.out.println(" ");
        for (int i = 0; i < quantity; i++) {
            arrStrings[i] = sc.nextLine();
        }

        return arrStrings;
    }

    public void calculateQty(int quantity, String [] array) {
        int lengthStr;
        int[] arrQty = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            lengthStr = array[i].length();
            arrQty[i] = lengthStr;
        }
        int average = 0;
        for (int i = 0; i < quantity; i++) {
            average = average + arrQty[i];
        }
        average = average / arrQty.length;
        System.out.println("The average length of entered strings is " + average);
    }
}