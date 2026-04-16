package kb.createArray;

import java.util.Scanner;

public class ArrayUtil {

    public static  int[] util(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Element");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        return arr;

    }



}
