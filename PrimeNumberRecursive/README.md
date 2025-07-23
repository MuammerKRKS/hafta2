📌 Proje Adı: Recursive Asal Sayı Kontrolü

📋 Açıklama

Bu program, kullanıcıdan alınan bir tam sayının asal sayı olup olmadığını recursive (özyinelemeli) bir yöntemle kontrol eder. Java programlama dili kullanılarak yazılmıştır.

🚀 Özellikler

Kullanıcıdan giriş alır

Asal sayı kontrolünü recursive fonksiyon ile yapar

Sonucu Türkçe olarak kullanıcıya bildirir

🧠 Kullanılan Yöntem

Asallık kontrolü için isPrime(int number, int divisor) isimli bir metot kullanılır. Bu metot şu şekilde çalışır:

Eğer sayı 2'den küçükse: asal değildir.

Eğer bölen 1'e kadar geldiyse ve hiçbir bölme işlemi 0 kalanı vermediyse: asal sayıdır.

Eğer sayı, herhangi bir divisor ile tam bölünüyorsa: asal değildir.

Aksi halde, fonksiyon kendini divisor - 1 ile yeniden çağırarak işlem devam eder.


Kod Kullanımı

Scanner scanner = new Scanner(System.in);

System.out.print("Bir sayı girin: ");

int number = scanner.nextInt();

if (isPrime(number, number - 1)) {

    System.out.println(number + " bir asal sayıdır.");
    
} else {

    System.out.println(number + " asal bir sayı değildir.");
}

✅ Örnek Çıktı

Bir sayı girin: 17

17 bir asal sayıdır.

Bir sayı girin: 20

20 asal bir sayı değildir.


📚 Gerekli Bilgiler

Java Temelleri

Recursive (özyinelemeli) metotlar

Mod alma işlemi (%)

Scanner sınıfı ile kullanıcı girişi
