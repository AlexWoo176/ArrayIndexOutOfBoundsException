package codegym;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static int[] createArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = createArray();

        System.out.print("Enter the Index of the Array: ");
        try
        {
            System.out.println("The corresponding element value is " + array[scanner.nextInt()]);
        }
        catch (java.lang.ArrayIndexOutOfBoundsException ex)
        {
            ex.printStackTrace();
            System.out.println("Out of Bounds.");
        }
    }
}
