/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan while, do-while, dan for loop.
 */

public class LatihanRefleksi {
    public static void main(String[] args) {

        System.out.println("=== MENGGUNAKAN WHILE ====");
         int angka =1;
        while (angka <=5){
            System.out.print(angka+" ");
            angka++;
        }
        System.out.println();
        System.out.println();

        System.out.println("=== MENGGUNAKAN DO-WHILE ====");
        int number = 1;
        do {
            System.out.print(number+" ");
            number++;
        }while (number<=5);
        System.out.println();
        System.out.println();

        System.out.println("=== MENGGUNAKAN FOR ====");
        for (int i=1; i<=5;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
    }
}
/*Menurut saya jenis loop yang paling mudah 
dipahami yaitu jenis for loop karena inisialisasi,
kondisi dan increment ditulis dalam satu baris. 
Jadinya perulangan menjadi lebih jelas dan mudah dipahami terutama untuk kasus ini yang dimana jumlahnya sudah diketahui*/  
