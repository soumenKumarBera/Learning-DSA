package kb.recurtion;

import kb.createArray.ArrayUtil;

import java.util.Scanner;

public class LinearSearching {
    static int solution(int[] arr,int target, int index, int n){

        if(index == n){
            return -1;
        };

        if (arr[index] == target){
            return index;
        };

        return solution(arr, target, index + 1, n);
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] arr = ArrayUtil.util();
        System.out.println(solution(arr, target,0,arr.length));
    }
}
