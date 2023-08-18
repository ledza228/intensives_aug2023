// Extra task https://leetcode.com/problems/find-the-value-of-the-partition/

package ru.yandex.tasks;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Arrays;

public class Task3InsertionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой вставками!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        for (int i=0;i<numbers.size();i++){

            int current = numbers.get(i);

            boolean isFounded = false;

            for (int j=0; j<i; j++){
                //found place
                if (current < numbers.get(j)){
                    isFounded = true;
                    int temp = numbers.get(j);
                    numbers.set(j, current);
                    for (int k=j+1;k<=i; k++){
                        int temp2 = numbers.get(k);
                        numbers.set(k, temp);
                        temp = temp2;
                    }
                    break;
                }
            }
        }


        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
