package PowerCalculator;

import java.util.Scanner;

public class PowerCalculator {

    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calculatePower(base, exponent - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();

        int result = calculatePower(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);

    }
}
