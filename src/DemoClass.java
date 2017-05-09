import MathOperations.MathOperations;
import PositiveArray.PositiveArray;
import StringsNumber.StringsNumber;

/**
 * @author Marinka on 22.04.2017.
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
        int quantity = stringsNum.stringsQuantity(); //вводим кол-во строк
        String[] array = stringsNum.stringsArray(quantity); //вводим сами строки
        stringsNum.calculateQty(quantity, array); //считаем кол-во символов в каждой строке и среднее кол-во
        stringsNum.calculateQty(6, new String[]{"iuyt", "kjhgfhjgf", "fghjghj", "y", "uuuu", "iuytr"}); //считаем кол-во символов в каждой строке и среднее кол-во

        //Пользователь вводит значения двух переменных. Программа реализует базовые математические операции над этими переменными (+ - * /).
        System.out.println("Task03");
        MathOperations mathOperations = new MathOperations();
        mathOperations.calculations();
    }
}
