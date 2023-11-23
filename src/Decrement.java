public class Decrement{

    public static int dec(int firstNumber) {
        int neg = 0;

        System.out.println("декремент в префиксной форме: " + Integer.toHexString(--firstNumber));
        System.out.println("декремент в постфикстной форме: " + Integer.toHexString(firstNumber--));

        return neg;
    }
}