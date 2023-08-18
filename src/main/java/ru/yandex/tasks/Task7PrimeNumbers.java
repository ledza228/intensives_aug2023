// Extra task https://leetcode.com/problems/prime-in-diagonal/

package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7PrimeNumbers {
    public static int[] findPrimes (int N) {
        /*
         * 2 <= N <= 10^6
         * Выход: отсортированный массив всех простых чисел от 2 до N
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        boolean[] resheto = new boolean[N+1];

        for (int i=2;i<Math.sqrt(resheto.length);i++){
            for (int j=0;j<N+1; j++){
                int perem = i*(i + j);
                if (perem > N+1){
                    break;
                }
                resheto[perem] = true;
//                if (j % i == 0){
//                resheto[j] = true;
//            }
        }
        }

        List<Integer> res = new ArrayList<>();

        for (int i=2;i<resheto.length;i++){
            if (!resheto[i]){
                res.add(i);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void selfCheck() {
        int[] output = {2, 3, 5};

        assert (Arrays.equals(output, findPrimes(5)));
    }
}
