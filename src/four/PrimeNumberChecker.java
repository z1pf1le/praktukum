package four;

public class PrimeNumberChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            System.out.println(" - не является простым числом");

        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {

            }
        }
        System.out.println( " - простое число");

        return false;
    }


}
