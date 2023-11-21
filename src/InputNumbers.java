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
        System.out.println(decimalToHex.calculate(secondNumber));

        System.out.println("Первое число: " + decimalToHex.calculate(firstNumber));
        System.out.println("Второе число: " + decimalToHex.calculate(secondNumber));

//        Sum sum = new Sum();
        Sum.sum(firstNumber, secondNumber);
        System.out.println("сумма " + decimalToHex.calculate(Sum.sum(firstNumber, secondNumber)));
    }
}
