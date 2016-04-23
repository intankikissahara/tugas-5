import java.util.Scanner;
public class MainPerhitungan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Perhitungan baru = new Perhitungan();
        System.out.print("Masukkan bilangan pertama : ");
        double a = in.nextDouble();
        System.out.print("Masukkan bilangan kedua : ");
        double b = in.nextDouble();
        double Penjumlahan = Perhitungan.Penjumlahan(a,b);
        System.out.println("Hasil penjumlahan bilangan pertama dan bilangan kedua adalah "+Penjumlahan);
        double Pengurangan = Perhitungan.Pengurangan(a,b);
        System.out.println("Hasil pengurangan bilangan pertama dan bilangan kedua adalah "+Pengurangan);
        System.out.println("Hasil perkalian bilangan pertama dan bilangan kedua adalah "+baru.Perkalian(a,b));
        System.out.println("Hasil pembagian bilangan pertama dan bilangan kedua adalah "+baru.Pembagian(a,b));
        System.out.println("Jika bilangan pertama adalah pembilang dan bilangan kedua adalah penyebut, ");
        System.out.print("maka hasil penyrderhanaan adalah ");
        baru.Sederhana(a,b);
    }
}
