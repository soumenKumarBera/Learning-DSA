package kb.searching;

import kb.createArray.ArrayUtil;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class LinearSearching {

    public static int linear(int[] arr, int target){

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] == target){
                return i;
            }

        }




        return  -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target value: " );
        int target = sc.nextInt();

        int result = linear(ArrayUtil.util(),target );

        if (result == -1){
            System.out.println("Target value not faund.");
        }else {
            System.out.println("Searching index: "+ result);
        }
    }
}
