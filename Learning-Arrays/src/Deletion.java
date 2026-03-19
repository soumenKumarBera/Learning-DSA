public class Deletion {
    public static void main(String[] args) {
        int[] arr = {45,12,86,96,32,41,58,32};
        int index = 2;

        int[] newArray = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if(i == index){
                continue;
            }
            newArray[j] = arr[i];
            j++;

        }

        for(int a: newArray){
            System.out.print(a +" ");
        }
    }
}
