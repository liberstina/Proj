package StringsNumber;

import java.util.Scanner;


/**
 * //Пользователь вводит количество строк,
 * потом значения этих строк.
 * Программа считает среднюю длину строк и
 * выводит на экран.
 * <p>
 * Created by Marinka on 23.04.2017.
 */
public class StringsNumber {
    private int stringsQty;
    private String[] arrStrings;

    public int stringsQuantity() {
        System.out.println("Enter the strings quantity");
        Scanner sc = new Scanner(System.in);
        stringsQty = sc.nextInt();
        return stringsQty;
    }

    public String[] stringsArray() {
        arrStrings = new String[stringsQty];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + stringsQty + " strings ");
        System.out.println(" ");
        for (int i = 0; i < stringsQty; i++) {
            arrStrings[i] = sc.nextLine();
        }

        return arrStrings;
    }

    public void calculateQty() {
        int lengthStr;
        int[] arrQty = new int[stringsQty];
        for (int i = 0; i < stringsQty; i++) {
            lengthStr = arrStrings[i].length();
            arrQty[i] = lengthStr;
        }
        int average = 0;
        for (int i = 0; i < stringsQty; i++) {
            average = average + arrQty[i];
        }
        average = average / arrQty.length;
        System.out.println("The average length of entered strings is " + average);
    }

}