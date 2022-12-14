package hw;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class hw3 {

    // public static void main(String[] args) {
        // Реализовать алгоритм сортировки слиянием
        // int[] arr = { 70, 50, 30, 10, 20, 40, 60 , 123};
        // int[] merged = mergeSort(arr, 0, arr.length - 1);
        // for (int val : merged) {
        //     System.out.print(val + " ");
        // }
    // }
    // public static int[] mergeTwoArrays(int[] one, int[] two) {
    //     int[] sorted = new int[one.length + two.length];
    //     int i = 0;
    //     int j = 0;
    //     int k = 0;
    //     while (i < one.length && j < two.length) {
    //         if (one[i] < two[j]) {
    //             sorted[k] = one[i];
    //             k++;
    //             i++;
    //         } else {
    //             sorted[k] = two[j];
    //             k++;
    //             j++;
    //         }
    //     }
    //     if (i == one.length) {
    //         while (j < two.length) {
    //             sorted[k] = two[j];
    //             k++;
    //             j++;
    //         }
    //     }
    //     if (j == two.length) {
    //         while (i < one.length) {
    //             sorted[k] = one[i];
    //             k++;
    //             i++;
    //         }
    //     }
    //     return sorted;
    // }
    // public static int[] mergeSort(int[] arr, int lo, int hi) {
    //     if (lo == hi) {
    //         int[] br = new int[1];
    //         br[0] = arr[lo];
    //         return br;
    //     }
    //     int mid = (lo + hi) / 2;
    //     int[] fh = mergeSort(arr, lo, mid);
    //     int[] sh = mergeSort(arr, mid + 1, hi);
    //     int[] merged = mergeTwoArrays(fh, sh);
    //     return merged;
    // }

        public static void main(String[] args) {
            // Пусть дан произвольный список целых чисел, удалить из него четные числа
            // ArrayList <Integer> array= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
            // for (int i = 0; i < array.size(); i++) {
            //     if(array.get(i)%2==0) array.remove(i);
            // }
            // array.forEach(System.out::println);

            // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
            ArrayList <Integer> array= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int midl=0;
            for (Integer num : array) {
                if(num>max) max=num;
                if(num<min) min=num;
                midl+=num;
            }
            System.out.println("минимальное = "+ min + ",максимальное = "+max+", среднее = "+midl/array.size());

        }

}