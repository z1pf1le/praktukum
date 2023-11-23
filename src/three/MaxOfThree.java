package three;

public class MaxOfThree {
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Максимальное число: " + max);
        return max;
    }
}
