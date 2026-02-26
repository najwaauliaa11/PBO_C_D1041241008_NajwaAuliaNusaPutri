/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan break
*/
public class LatihanCariKelipatan {
    public static void main(String[] args) {
        System.out.println("=== CARI KELIPATAN 7 ===");
        // Perulangan dari angka 1 sampai 50
        for (int i = 1; i<=50; i++){
            // Menampilkan angka yang sedang diperiksa
            System.out.println("Cek: "+ i);
             // Mengecek apakah angka merupakan kelipatan 7
            if (i % 7 ==0){
                System.out.println("Kelipatan 7 pertama: "+i);
                // Menghentikan perulangan setelah ditemukan
                break;
            }
        }
        System.out.println("Pencarian selesai.");
    }
}
