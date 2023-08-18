package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10Permutations {

    public static void makePermutation(int[] numbers, int startIndex, List<int[]> res){
        if (startIndex == numbers.length - 1){
            res.add(numbers);
            return;
        }

        for (int i=startIndex; i<numbers.length; i++){
            int[] newArray = Arrays.copyOf(numbers, numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[startIndex];
            numbers[startIndex] = temp;
            makePermutation(newArray, startIndex+1, res);
        }

    }

    public static int[][] permutations(int[] numbers) {
        /*
         * Возвращает массив со всеми перестановками массива numbers (массив n чисел от 1 до n, 1 <= n <= 10)
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        List<int[]> list = new ArrayList<>();
        makePermutation(numbers, 0, list);

        int[][] res = new int[list.size()][];

        for (int i=0;i<res.length;i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public static void selfCheck() {
        int[] input = {1, 2, 3};
        int[][] output = {
                {1, 2, 3},
                {1, 3, 2},
                {2, 1, 3},
                {2, 3, 1},
                {3, 1, 2},
                {3, 2, 1}
        };

        assert Arrays.deepEquals(output, permutations(input));
    }

    public static void main(String[] args) {
        selfCheck();
///        permutations(new int[]{1, 2, 3});
    }
}
