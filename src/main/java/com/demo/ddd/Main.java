package com.demo.ddd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 23, 53, 243, 2523, 5};
        Arrays.sort(arr,Collections.reverseOrder());
        for (Integer a : arr) {
            System.out.print(a+">");
        }
        System.out.println("---------------");
        chooseSort(arr);
    }


        private static void chooseSort ( Integer[] arr){
            for (int i = 0; i < arr.length - 1; i++) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i] < arr[k]) {
                        int b = arr[i];
                        arr[i] = arr[k];
                        arr[k] = b;
                    }
                }

            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

