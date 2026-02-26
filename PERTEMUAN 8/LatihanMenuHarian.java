/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan Nested Loop – Menu Harian
*/

public class LatihanMenuHarian {
    public static void main(String[] args) {
        String menu="";
        String waktuMakan="";
        System.out.println("=== MENU MAKAN 3 HARI ===");
        for (int hari =1; hari<=3; hari++){
            System.out.println("Hari "+ hari+":");
            for (int waktu = 1; waktu <=2; waktu++){
                 // Tentukan keterangan waktu
                switch (waktu){
                    case 1:
                        waktuMakan="Pagi";
                        break;
                    case 2:
                        waktuMakan ="Siang";
                        break;
                    default:
                        waktuMakan="";
                }
                // Tentukan menu berdasarkan hari dan waktu
                switch (hari) {
                    case 1:
                        if (waktu == 1) {
                            menu = "Nasi Goreng";
                        } else {
                            menu = "Soto Ayam";
                        }
                        break;

                    case 2:
                        if (waktu == 1) {
                            menu = "Bubur Ayam";
                        } else {
                            menu = "Mie Goreng";
                        }
                        break;

                    case 3:
                        if (waktu == 1) {
                            menu = "Roti Bakar";
                        } else {
                            menu = "Nasi Uduk";
                        }
                        break;
                }
                // Tampilkan hasil
                System.out.println("  "+ waktuMakan + ": " + menu);
               
            }System.out.println();
        }
    }
}
