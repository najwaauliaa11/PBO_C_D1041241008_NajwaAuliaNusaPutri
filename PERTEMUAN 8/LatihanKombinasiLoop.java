/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan Kombinasi Nested Loop dan Break
*/
public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        //Variabel boolean sebagai penanda jika koordinat sudah ditemukan
        boolean isTrue = true;
        //Melakukan Outer loop: baris 1-3
        for (int baris = 1; baris <=3;baris++){
            //Melakukan Inner loop: kolom 1-5
            for (int kolom =1; kolom<=5;kolom++){
                //Menampilkan koordinat yang diperiksa
                System.out.println("Cek: ["+baris+","+kolom+"]");
                 // Mengecek apakah koordinat dengan yang dicari
                if (baris == 2 && kolom == 3){
                 // Mengubah nilai boolean menjadi false sebagai tanda sudah ditemukan  
                isTrue= false;
                //Menghentikan inner loop
                break;
                }
            }
            //Menghentikan outer loop jika sudah ditemukan
            if (isTrue == false){
                break;
            }   
        }
        System.out.println("Koordinat ditemukan!");
        System.out.println("Pencarian selesai.");
        System.out.println();
    }
    
}
