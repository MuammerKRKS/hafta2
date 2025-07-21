package numberRounding;

import java.util.Scanner;

public class numberRounding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ondalıklı Bir Sayı Giriniz: ");
        double number = scanner.nextDouble();

        int roundDown = (int) Math.floor(number);
        int roundUp = (int) Math.ceil(number);
        int closestNumber = (int) Math.round(number);
        System.out.println("Aşağı Yuvarlama: " + roundDown);
        System.out.println("Yukarı Yuvarlama: " + roundUp);
        System.out.println("En Yakın Tam Sayı: " + closestNumber);
    }

}
