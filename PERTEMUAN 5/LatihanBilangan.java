/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan pemeriksaan bilangan ganjil genap
 */

public class LatihanBilangan {
    public static void main(String[] args) {
        int angka = 0;
        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: "+angka);
        //Cek genap ganjil jika angka positif
        if (angka>0){
            System.out.println("Jenis: Bilangan positif ");
            String parity = (angka%2 ==0)? "Genap":"Ganjil";
            System.out.println("Tipe: "+parity);
        } 
         //Cek genap ganjil jika angka negatif
        else if (angka<0){
            System.out.println("Jenis: Bilangan negatif");
            String parity = (angka%2 ==0)? "Genap":"Ganjil";
            System.out.println("Tipe: "+parity); 
        }
        //Cek jika angka 0
        else {
            System.out.println("Jenis: Bilangan nol");

        }
    }

    
}
