Bu Java programı, kullanıcıdan alınan bir şifrenin aşağıdaki kurallara göre geçerli olup olmadığını kontrol eder ve sonucu ekrana yazdırır.


✅ Şifre Geçerlilik Kuralları

1️⃣ En az 8 karakter uzunluğunda olmalı

2️⃣ Boşluk karakteri içermemeli

3️⃣ İlk karakter büyük harf olmalı

4️⃣ Son karakter ? olmalı


💻 Kod
import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Şifreyi giriniz: ");
        String sifre = scanner.nextLine();

        if (sifre.length() >= 8 &&
            !sifre.contains(" ") &&
            Character.isUpperCase(sifre.charAt(0)) &&
            sifre.charAt(sifre.length() - 1) == '?') {
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }
    }
}


🛠️ Nasıl Çalışır?

1️⃣ Kullanıcıdan şifre alınır

2️⃣ if bloğunda:

Uzunluğu kontrol edilir

Boşluk içerip içermediği kontrol edilir

İlk harfin büyük olup olmadığı kontrol edilir

Son karakterin ? olup olmadığı kontrol edilir

3️⃣ Şartlar sağlanıyorsa "Geçerli Şifre" yazdırılır

4️⃣ Sağlanmıyorsa "Geçersiz Şifre" yazdırılır

