// Extra task https://leetcode.com/problems/validate-binary-tree-nodes/

package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4DFS {
    public static void runSearch(int[][] tree, int root, List<Integer> res) {

        if (tree[root][0] == -1 && tree[root][1] == -1){
            res.add(root);
            return;
        }
        else {
            if (tree[root][0] != -1){
                runSearch(tree, tree[root][0], res);
            }
            if (tree[root][1] != -1){
                runSearch(tree, tree[root][1], res);
            }
        }
        res.add(root);
        /*
         * Реализация dfs
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
    }

    public static int[] getDFSOrder(int[][] tree, int root) {
        /*
         * Функция возвращает массив с порядковыми номерами вершин в обходе
         * Сначала левое поддерево, затем правое, затем корень.
         * Дано дерево из n (<= 10^5) вершин (пронумерованных от 0 до n-1)
         * tree - двумерный массив, tree[i][0] - номер левого сына, tree[i][1] - номер правого сына (если нет левого / правого сына, соотв. элемент -1)
         * root - корень, откуда нужно начинать обход
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        List<Integer> res = new ArrayList<>();
        runSearch(tree, root, res);

        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void selfCheck() {
        int[][] tree =
                {
                        {1, 6},
                        {2, 3},
                        {-1, -1},
                        {4, -1},
                        {-1, -1},
                        {-1, -1},
                        {-1, 8},
                        {-1, -1},
                        {-1, -1}
                };

        int[] ans1 = {2, 4, 3, 1, 8, 6, 0};
        int[] ans2 = {4, 3};
        int[] ans3 = {2};
        int[] ans4 = {8, 6};

        assert (Arrays.equals(getDFSOrder(tree, 0), ans1));
        assert (Arrays.equals(getDFSOrder(tree, 3), ans2));
        assert (Arrays.equals(getDFSOrder(tree, 2), ans3));
        assert (Arrays.equals(getDFSOrder(tree, 6), ans4));
    }
}
