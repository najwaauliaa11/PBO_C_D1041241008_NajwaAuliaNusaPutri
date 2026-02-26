/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan Switch Statement 
 */

public class LatihanBulan {
    public static void main(String[] args) {
        int angkaBulan = 13; // Variabel untuk menyimpan angka bulan
        String namaBulan;  // Variabel untuk menyimpan hasil nama bulan

        System.out.println("=== KONVERSI BULAN ====");
        System.out.println("Angka Bulan: "+angkaBulan);
        //Buat switch untuk 12 bulan
        switch (angkaBulan) {
            case 1:
                namaBulan ="Januari";
                break;
            case 2:
                namaBulan="Februari";
                break;
            case 3:
                namaBulan="Maret";
                break;
            case 4:
                namaBulan="April";
                break;
            case 5:
                namaBulan="Mei";
                break;
            case 6:
                namaBulan="Juni";
                break;
            case 7:
                namaBulan="Juli";
                break;
            case 8:
                namaBulan="Agustus";
                break;
            case 9:
                namaBulan="September";
                break;
            case 10:
                namaBulan="Oktober";
                break;
            case 11:
                namaBulan="November";
                break;
            case 12:
                namaBulan="Desember";
                break;
            default:
                //Default case digunakan jika tidak ada case yang cocok dengan nilai expression
                namaBulan = "Angka bulan tidak valid (1-12)";
                System.out.println("Error: "+ namaBulan);
                break;
        }
        //Jika angka tidak melebihi range 1-12
        if (angkaBulan >=1&& angkaBulan<=12)
        //Menampilkan hasil konversi
        System.out.println("Nama Bulan: "+namaBulan);
    }}

   

