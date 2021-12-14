package day26_CustomMethodsPractice;


import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = merge(arr1, arr2);

        System.out.println(Arrays.toString(arr3));

    }


    // merge the given two arrays and returns the new array
   public static int[] merge(int[] arr1, int[] arr2){
       int[] result = {};

       for (int each : arr1) {
           result = ArraysUtility.addElement(result, each);
       }

       for (int each : arr2) {
           result = ArraysUtility.addElement(result, each);
       }

       return result;
   }

    // merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }








}
