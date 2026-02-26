/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan while loop
 */

public class LatihanDeretGanjil {
    public static void main(String[] args) {
    System.out.println("=== BILANGAN GANJIL 1-15 ===");
    //Deklarasi variabel awal
    int angka =1;
    //Perulangan akan berjalan selama angka <= 15
    while (angka <= 15){
        //Mengecek apakah ganjil
        if (angka %2 !=0){
            //Jika ganjil tampilkan akan
            System.out.print(angka+" ");   
         } 
        // Menambah nilai angka setiap perulangan
        angka++;
      }
    }
}
