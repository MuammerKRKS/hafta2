# Recursive Üs Hesaplama (Java)

Bu, Java dilinde yazılmış basit bir **özyinelemeli (recursive)** üs hesaplama uygulamasıdır.

## 🔧 Nasıl Çalışır?

Program kullanıcıdan iki giriş alır:

- `taban`: Üssü alınacak sayı
- `üs`: Sayının kaçıncı kuvveti alınacak

Bu değerleri aldıktan sonra, sonucu **recursive (özyinelemeli)** bir metot ile hesaplar.

### Recursive Mantık

```java
if (exponent == 0)
    return 1;
else
    return base * calculatePower(base, exponent - 1);

Eğer üs değeri 0 ise sonuç 1 döner (base case).

Değilse, taban değeri kendisiyle çarpılarak fonksiyon tekrar çağrılır (üs - 1).

Örnek Kullanım

Taban değerini giriniz: 3
Üs değerini giriniz: 4
3^4 = 81
