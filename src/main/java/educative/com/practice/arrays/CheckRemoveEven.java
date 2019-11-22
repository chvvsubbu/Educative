package main.java.arrays;

public class CheckRemoveEven {

    public static int[] removeEven (int[] arr) {
        int counter =0;

        for (int arrayElement : arr ) {
            if(arrayElement %2 ==1 )   counter++;
        }
        System.out.println("New array length is: "+counter);

        int[] removeEvenArray = new int[counter];
        counter =0;
        for (int arrayElement : arr ) {
            if(arrayElement %2 == 1 )   removeEvenArray[counter++] = arrayElement;
        }
        return  removeEvenArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 4, 5, 10, 6, 3};

        int [] newarry = removeEven(arr);

        for (int val:newarry ) {
            System.out.print(val + " ");
        }


    }
}
