public class DecimalToHex {

    public static String calculate(int arg) {
        int decimalNumber = arg;
        String hexadecimalNumber = Integer.toHexString(decimalNumber);
//        System.out.println("Шестнадцатеричное представление: " + hexadecimalNumber);
        return hexadecimalNumber;
    }
}
