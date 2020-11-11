package Recursion.p3_119_Pascal_Triangle_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Pascal's triangle are a series of numbers arranged in the shape of triangle.
 * In Pascal's triangle, the leftmost and the rightmost numbers of each row are
 * always 1. For the rest, each number is the sum of the two numbers directly
 * above it in the previous row.
 * 
 * i = row & j = column
 * 
 * Base case f(i,j) = 1 when j = 1 or j = i
 */
public class p3_119_Pascal_Triangle_II {
    public static void main(String[] args) {
        System.out.println(getRow(4));
    }

    // public static List<Integer> getRow(int rowIndex) {
    // int maxLength = rowIndex + 1;
    // List<Integer> numArr = new ArrayList<>();
    // int[][] dpArr = new int[rowIndex + 1][rowIndex + 1];
    // for (int i = 0; i < dpArr.length; i++) {
    // Arrays.fill(dpArr[i], -1);
    // }
    // for (int j = 0; j < maxLength; j++) {
    // int existedValue = getValue(rowIndex, j, dpArr);
    // numArr.add(existedValue);
    // }
    // return numArr;
    // }

    // public static Integer getValue(int i, int j, int[][] dpArr) {
    // if (dpArr[i][j] != -1) {
    // return dpArr[i][j];
    // }
    // if (j == i || j == 0) {
    // return 1;
    // }
    // dpArr[i][j] = getValue(i - 1, j - 1, dpArr) + getValue(i - 1, j, dpArr);
    // return dpArr[i][j];
    // }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> preRow = new ArrayList<>();
        preRow.add(1);
        if (rowIndex == 0) {
            return preRow;
        }
        preRow.add(1);
        if (rowIndex == 1) {
            return preRow;
        }
        for (int i = 2; i < rowIndex + 1; i++) {
            List<Integer> currentRow = new ArrayList<>();
            // First
            currentRow.add(1);
            for (int j = 1; j < preRow.size(); j++) {
                currentRow.add(preRow.get(j) + preRow.get(j - 1));
            }
            // Last
            currentRow.add(1);
            preRow = currentRow;
        }
        return preRow;
    }
}
