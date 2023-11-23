import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println(DecimalToHex.calculate(firstNumber));

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        System.out.println(DecimalToHex.calculate(secondNumber));

        System.out.println("Первое число: " + DecimalToHex.calculate(firstNumber));
        System.out.println("Второе число: " + DecimalToHex.calculate(secondNumber));

        System.out.println("сумма: " + DecimalToHex.calculate(Sum.sum(firstNumber, secondNumber)));

        System.out.println("разность: " + DecimalToHex.calculate(Difference.difference(firstNumber, secondNumber)));

        System.out.println("произведение: " + DecimalToHex.calculate(Multiplication.multiplication(firstNumber, secondNumber)));

        System.out.println("результат деления: " + DecimalToHex.calculate(Division.division(firstNumber, secondNumber)));

        Negation.neg(firstNumber);

        Negation.neg(secondNumber);

        And.and(firstNumber, secondNumber);

        Or.or(firstNumber, secondNumber);

        XOR.xor(firstNumber, secondNumber);

        Left.left(firstNumber, secondNumber);

        Right.right(firstNumber, secondNumber);

        Decrement.dec(firstNumber);

        Decrement.dec(secondNumber);

        Increment.dec(firstNumber);

        Increment.dec(secondNumber);






    }
}
