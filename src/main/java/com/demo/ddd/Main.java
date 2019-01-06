package com.demo.ddd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 23, 53, 243, 2523, 5,99};
//        Arrays.sort(arr, Collections.reverseOrder());
//        for (Integer a : arr) {
//            System.out.print(a + ">");
//        }
//        System.out.println("---------------");
        chooseSort(arr);
        bubbleSort(arr);
    }


    private static void chooseSort(Integer[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] > arr[k]) {
                    int b = arr[i];
                    arr[i] = arr[k];
                    arr[k] = b;
                }
                count++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("循环次数：" + count);
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    private static void bubbleSort(Integer[] arr) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("冒泡循环次数：" + count);
    }

}

