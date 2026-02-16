/*
Nim  : D1041241008
Nama : Najwa Aulia Nusa Putri
Program penggunaan operator aritmatika dasar
 */

public class LatihanKalkukator {
    public static void main(String[] args) {
    int angka1 =25;
    int angka2=4;

    System.out.println("===KALKULATOR===");
    System.out.println("Angka 1: 25");
    System.out.println("Angka 2: 4");
    System.out.println("---");
    System.out.println("Penjumlahan: "+ (angka1+angka2));
    System.out.println("Pengurangan: "+ (angka1-angka2));
    System.out.println("Perkalian: "+(angka1*angka2));
    System.out.println("Pembagian: "+(angka1/angka2));
    System.out.println("Sisa Bagi: "+(angka1%angka2));
    double bagidesimal = (double) angka1/angka2;
    System.out.println("Pembagian desimal: "+bagidesimal);
    }
}
