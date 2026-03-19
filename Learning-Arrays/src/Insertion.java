import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {45,42,12,32,96,15};
        int index = 3;
        int element = 80;

        int[] newArr= new int[arr.length + 1];

        for (int i = 0; i < index; i++) {

            newArr[i] = arr[i];

        }

        newArr[index] = element;

        for (int i = index; i < arr.length; i++) {
            newArr[i +1] = arr[i];

        }

        for (int a: newArr){
            System.out.print(a + " ");
        }
    }
}
