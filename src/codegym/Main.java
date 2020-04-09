package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CreateRandom arrRandom = new CreateRandom();
        Integer[] array = arrRandom.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Vui Long nhap chi so cua mot phan tu bat ky: ");
        int x = scanner.nextInt();

        try {
            System.out.println("Gia tri cua phan tu co chi so 5" + x + " la " + array[x]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Chi so vuot qua gio han cua mang");
        }
    }
}
