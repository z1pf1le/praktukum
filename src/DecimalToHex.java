public class DecimalToHex {

    public String calculate(int arg) {
        int decimalNumber = arg;
        String hexadecimalNumber = Integer.toHexString(decimalNumber);
        System.out.println("Шестнадцатеричное представление: " + hexadecimalNumber);
        return hexadecimalNumber;
    }
}
