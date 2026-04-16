package kb.sorting;

import kb.createArray.ArrayUtil;

import java.util.Arrays;

public class SelectionSort {

    public static int[] sort(int[] arr){

        for (int i = 0; i < arr.length - 1 ; i++) {

            int index = i;
            for (int j = i+1; j < arr.length ; j++) {

                if ( arr[j] < arr[index]){
                    index = j;

                }

            }

            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }


        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(ArrayUtil.util())));
    }

}
