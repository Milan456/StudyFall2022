package Leetcode.SortPeople;

import java.util.Arrays;

public class Driver {

    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (heights[i] < heights[j]) {
                    // Swapping the height:
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;

                    // Swapping the names:
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        return names;
    }

    public static void main(String[] args) {
        int[] heights = { 155,185,150};
        String[] names = {"Alice","Bob","Bob"};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
        int[] heights2 = { 180,165,170};
        String[] names2 = {"Mary","John","Emma"};
        System.out.println(Arrays.toString(sortPeople(names2, heights2)));
    }
}
