package four;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayGenerator {
    public static void main(String[] args) {
        final int K = 50; // установка значения K
        final int ARRAY_SIZE = 100; // размер массива

        int[] randomArray = new int[ARRAY_SIZE];
        Random random = new Random();

        // Заполнение массива случайными числами от 0 до K
        for (int i = 0; i < ARRAY_SIZE; i++) {
            randomArray[i] = random.nextInt(K + 1);
        }

        // Вывод сгенерированного массива
//        System.out.println(randomArray);
        int count = 0;
        int count2 = 0;
        System.out.println("Сгенерированный массив из " + ARRAY_SIZE + " чисел на интервале [0:" + K + "]:");
        for (int num : randomArray) {

            System.out.print(num + " ");
            count = count + PrimeNumberChecker.isPrime(num);

            if (num / 3 == 0){
                count2++;
            }
        }

        System.out.println("\nпростых чисел:");
        System.out.println(count);
        System.out.println("\nчисел кратных 3:");
        System.out.println(count2);
        Arrays.sort(randomArray);

        for (int num: randomArray){
            System.out.print(num + " ");
        }
    }

}
