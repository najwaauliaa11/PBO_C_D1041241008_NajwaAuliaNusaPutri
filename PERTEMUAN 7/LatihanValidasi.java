/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan validasi input dengan Do-While
*/

public class LatihanValidasi {
    public static void main(String[] args) {
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        int nilai = 0;
        int percobaan = 1;
        System.out.println();
        //Perulangan do-while akan tetap dijalankan minimal 1 kali
        do {
            // Menggunakan switch-case untuk simulasi input berdasarkan percobaan
            switch (percobaan) {
                case 1:
                    nilai =-10;
                    break;
                case 2:
                    nilai = 150;
                    break;
                case 3:
                    nilai = 85;
                    break;

            }
            System.out.println("Percobaan input: " + nilai);
             // Validasi nilai apakah di luar rentang 0–100
            if (nilai <0||nilai>100){
                System.out.println("Error: Nilai harus antara 0-100!");
            } else {
                System.out.println("Nilai valid: " + nilai);
            }
            System.out.println(); // spasi antar percobaan
            // Menambah nilai percobaan
            percobaan++;
        }
        // Perulangan akan terus berjalan selama nilai tidak valid
         while (nilai < 0 || nilai > 100);
    }
}
