import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        DecimalToHex decimalToHex = new DecimalToHex();

        int firstNumber = scanner.nextInt();
        System.out.println(decimalToHex.calculate(firstNumber));

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Первое число: " + firstNumber);
        System.out.println("Второе число: " + secondNumber);
    }
}
