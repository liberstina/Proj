package PositiveArray;

import java.util.Random;

/**
 * Created by Marinka on 21.04.2017.
 */
public class PositiveArray {
    private int[] array;
    private Random random = new Random();

    public PositiveArray(int n) {
        array = new int[n];
    }

    public int[] randomArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % 100;
        }
        return array;
    }

    public int[] doPositiveArray() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                array[i] = 0;
        }
        return array;
    }

}



