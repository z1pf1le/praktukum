public class Increment{
    public static int dec(int firstNumber) {
        int neg = 0;

        System.out.println("инкремент в префиксной форме: " + Integer.toHexString(++firstNumber));
        System.out.println("инкремент в постфикстной форме: " + Integer.toHexString(firstNumber++));

        return neg;
    }
}