import java.util.Scanner;

public class ArraySort {
    // public array sort()
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements of array separated by comma ','\n>> ");
        String u_input = scanner.nextLine();

        // Declaration with initialization
        String[] input_array = u_input.split(",");

        // Declaration with allocation
        int size = input_array.length;
        int elements[] = new int[size];

//        Converting the numbers into integer
        for (int i = 0; i < input_array.length; i++) {
            elements[i] = Integer.parseInt(input_array[i]);
        }

        // sorting 😇
        for (int i = 0; i < elements.length; i++) {
            for (int j = i; j < elements.length; j++) {
                if (elements[i] > elements[j]) {
                    int temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }

//        Show sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]);
            if (i < elements.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }

}
