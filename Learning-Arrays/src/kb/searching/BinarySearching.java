package kb.searching;

import kb.createArray.ArrayUtil;

import java.util.Scanner;

public class BinarySearching {

    public static int binarysearching(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }

        return -1;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("find number: " );
        int find = sc.nextInt();


        int result = binarysearching(ArrayUtil.util(),find);
        System.out.println("index: "+ result);


    }
}
