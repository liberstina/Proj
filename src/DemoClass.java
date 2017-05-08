import PositiveArray.PositiveArray;
import StringsNumber.StringsNumber;
import MathOperations.MathOperations;
/**
 * Created by Marinka on 22.04.2017.
 */
public class DemoClass {
    public static void main(String[] args) {
       //Заполнить массив данными (рандомными). Распечатать. Все негативные значения заменить на 0. Распечатать.

        System.out.println("Task01");
        System.out.println("Here is the array, filled with random data");

        PositiveArray fillArray = new PositiveArray(10);
        for (int i : fillArray.randomArray()) {
            System.out.println(i);
        }

        System.out.println("All negative numbers become 0");

        for (int i : fillArray.doPositiveArray()) {
            System.out.println(i);
        }

        //Пользователь вводит количество строк, потом значения этих строк. Программа считает среднюю длину строк и выводит на экран.
       System.out.println("Task02");
        StringsNumber stringsNum = new StringsNumber();
        stringsNum.stringsQuantity(); //вводим кол-во строк
        stringsNum.stringsArray(); //вводим сами строки
        stringsNum.calculateQty(); //считаем кол-во символов в каждой строке и среднее кол-во



        //Пользователь вводит значения двух переменных. Программа реализует базовые математические операции над этими переменными (+ - * /).
        System.out.println("Task03");
        MathOperations mathOperations = new MathOperations();
        mathOperations.calculations();
    }
}
