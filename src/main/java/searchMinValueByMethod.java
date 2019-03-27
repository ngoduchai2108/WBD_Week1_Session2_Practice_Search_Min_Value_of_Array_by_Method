import java.util.Scanner;

public class searchMinValueByMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do{
            System.out.println("Enter size for array:");
            size = scanner.nextInt();
            if (size < 20){
                System.out.println("size should not exceed 20");
            }
        }while (size < 20);
        // Enter element for array
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter Element "+(i+1)+" is: ");
            array[i] = scanner.nextInt();
        }
        // Show array
        System.out.print("Array is: ");
        for (int element:array){
            System.out.print(element + "\t");
        }
        System.out.println(" ");
        // Use method search min value
        System.out.println("Element has min value is: "+ array[minValue(array)]+" with index is: "+ minValue(array));
    }
    public static int minValue (int [] array){
        int min = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
