import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,17,21};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverse(array)));
        System.out.println(Arrays.toString(reverseCopy(array)));

        int[] reversedCopy = reverseCopy(array);

        System.out.println(Arrays.toString(reversedCopy));
        System.out.println(Arrays.toString(reverse(array)));
        System.out.println(Arrays.toString(array));
    }

    private static int[] reverse(int[] array){
        int[] reversedArray = new int[array.length];
            for(int i=array.length-1, j =0; i>=0; i--, j++){
                    reversedArray[j] = array[i];
            }

        return reversedArray;
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
}