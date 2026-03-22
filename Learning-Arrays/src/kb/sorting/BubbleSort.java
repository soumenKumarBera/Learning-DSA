package kb.sorting;

import kb.createArray.ArrayUtil;

import java.util.Arrays;

public class BubbleSort {

    public static int[] sort(int[] arr){

        int n = arr.length - 2;
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;

                }
            }

        }




        return  arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(ArrayUtil.util())));
    }
}
