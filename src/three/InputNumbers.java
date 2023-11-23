package three;

import java.util.Scanner;

public class InputNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();


        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Введите третее число: ");
        int thirdNumber = scanner.nextInt();

        System.out.println(Integer.toString(firstNumber) + " " + Integer.toString(secondNumber));

        Proc.ave(firstNumber, secondNumber, thirdNumber);

        MaxOfThree.findMax(firstNumber, secondNumber, thirdNumber);

    }
}
