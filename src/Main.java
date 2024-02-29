import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,17,21};
       // System.out.println(Arrays.toString(array));
       // System.out.println(Arrays.toString(reverse(array)));
        reverse(array);
       // System.out.println(Arrays.toString(reverseCopy(array)));

        int[] reversedCopy = reverseCopy(array);

      //  System.out.println(Arrays.toString(reversedCopy));
       // System.out.println(Arrays.toString(reverse(array)));
       // System.out.println(Arrays.toString(array));
    }

    private static int[] reverse3(int[] array){
        int[] reversedArray = new int[array.length];
            for(int i=array.length-1, j =0; i>=0; i--, j++){
                    reversedArray[j] = array[i];
            }

        return reversedArray;
    }
//1.   You only need to loop through half of the array as you swap the elements.
//
//
//
//2.  In the loop, you want to:
//
//         1.  temporarily store the first element of the array in a variable.
//
//        2.  assign the the last element to the first element.
//
//        3.  now assign the first element that was stored in the variable to the last element.
//
//        4.  move to the next element and repeat the process.
//The best way to understand this algorithm is to visualize it.
//
//
//
//|  1  |  2  |  3  |  4  |  5  |  6  |
//
//
//
//        1. temp = 1
//
//            2.  |  6 |  2  |  3  |  4  |  5  |  6  |
//
//            3.  |  6 |  2  |  3  |  4  |  5  |  temp = 1  |
//
//
//
//            1. temp = 2
//
//            2.  |  6 |  5  |  3  |  4  |  5  |  1  |
//
//            3.  |  6 |  5  |  3  |  4  |  temp = 2  |  1  |
//
//
//
//            1. temp = 3
//
//            2.  |  6 |  5  |  4  |  4  |  2  |  1  |
//
//            3.  |  6 |  5  |  4  |  temp = 3  |  2  |  1  |
//
//
//
//            |  6 |  5  |  4  |  3  |  2  |  1  |
//

    private static void reverse2(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];                    // 1
            array[i] = array[maxIndex - i];         // 2
            array[maxIndex - i] = temp;             // 3
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
    private static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length-1;
        for(int element: array){
            reversedArray[maxIndex--] = element;
        }
        return reversedArray;
    }
    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list of integers, separated by comas: ");
        String input = scanner.nextLine();
        String[] splitString = input.split(","); //separate numbers and put into diferent index on String array
        int[] array = new int[splitString.length]; //new array
        for(int i=0; i< splitString.length; i++){
            array[i] = Integer.parseInt(splitString[i].trim()); //convert to int and delete tabulators, spaces
        }
        return array;
    }

    public static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
//        for(int i =0; i<array.length; i++){
//            if(array[i] <= min) min = array[i];
//        }
        for(int el: array){
            if(el<min) min = el;
        }

        return min;
    }

    private static void reverse(int[] array){
        int[] reversedArray = new int[array.length];
        for(int i=array.length-1, j =0; i>=0; i--, j++){
            reversedArray[j] = array[i];
        }
        System.out.println("Array = "+ Arrays.toString(array));
        System.out.println("Reversed array = "+ Arrays.toString(reversedArray));
    }
}