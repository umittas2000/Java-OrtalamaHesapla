import java.util.Scanner;

public class OrtalamaHesapla {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik,ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu girin:");
        matematik = input.nextInt();

        System.out.print("Fizik notunu girin:");
        fizik = input.nextInt();

        System.out.print("Kimya notunu girin:");
        kimya = input.nextInt();

        System.out.print("Turkce notunu girin:");
        turkce = input.nextInt();

        System.out.print("Tarih notunu girin:");
        tarih = input.nextInt();

        System.out.print("Muzik notunu girin:");
        muzik = input.nextInt();

        ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.print(ortalama>=60 ? "ortalama : "+ortalama + " Sinifi gecti!" : "ortalama : "+ortalama +" Sinifta Kaldi...");
    }

}

