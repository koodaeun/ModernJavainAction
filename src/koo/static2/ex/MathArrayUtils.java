package koo.static2.ex;

import java.util.Arrays;

public class MathArrayUtils {
    public static int sumVal;
    public static double val2;
    public static int sum(int[] values){
        int total = 0;
        for(int i : values){
            total += i;
        }
        return total;
    }

    public static double average(int[] values){
        double result = 0;
        result = (double) sum(values) / values.length;
        return result;
    }

    public static int min(int[] values){
        int minVal = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < minVal) {
                minVal = values[i];
            }
        }
        return minVal;
    }

    public static int max(int[] values){
        int maxVal = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxVal) {
                maxVal = values[i];
            }
        }
        return maxVal;
    }
}
