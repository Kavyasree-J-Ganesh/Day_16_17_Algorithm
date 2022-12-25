package com.bridgelabz;

public class BubbleSort {
    static void sortIntegers(int[] arr){
        for(int i=0; i<arr.length-1; i++){               // i=> number of iteration required
            for(int j=0; j<arr.length-i-1; j++){         // j=> for comparing elemnts
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        System.out.println(" Sorted Array is ");
        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {3,8,1,5,2,7,6};
        sortIntegers(arr1);
    }
}
