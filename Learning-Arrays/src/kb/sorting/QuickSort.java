package kb.sorting;

import kb.createArray.ArrayUtil;

public class QuickSort {
   static int position(int[] arr, int start, int end){

        int pos = start;

        for (int i = start; i <= end; i++) {

            if (arr[i] <= arr[end]){
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;

                pos++;

            }

        }


        return pos - 1;
    }


    public static void quickSort(int[] arr, int start, int end){
       if(start >= end){
           return;
       }



        int pivot = position(arr, start, end);

        quickSort(arr, start,pivot - 1); //LEFT SIDE
        quickSort(arr, pivot + 1, end); //RIGHT SIDE




    }

    public static void main(String[] args) {
        int[] arr = ArrayUtil.util();
        int n = arr.length - 1;

         quickSort(arr, 0, n);

         for(int val: arr){
             System.out.print(val + " ");

         }
    }

}
