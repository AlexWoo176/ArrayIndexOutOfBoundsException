package codegym;

import java.util.Random;

public class CreateRandom {
    private Integer[] array;

    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");

        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i]+ " ");
        }
        return array;
    }
}
