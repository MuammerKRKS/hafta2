package Password_Check_Code;

import java.util.Scanner;

public class password_code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Şifrenizi Giriniz: ");
        String password = scanner.nextLine();

        if (password.length() >=8 &&
            !password.contains(" ") &&
                Character.isUpperCase(password.charAt(0)) &&
                password.charAt(password.length() - 1) == '?') {
            System.out.println("Geçerli Şifre. ");
        } else {
            System.out.println("Geçersiz Şifre. ");
        }
        scanner.close();
    }
}
