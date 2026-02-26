/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan break Fall through yang disengaja
 */

public class LatihanHariBulan {
    public static void main(String[] args) {
        int month = 4;

        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        //Buat switch untuk 12 bulan 
        switch (month) {
            case 1:
                System.out.println("Bulan: Januari (bulan ke-1)");
                break;
            case 2:
                System.out.println("Bulan: Februari (bulan ke-2)");
                break;
            case 3:
                System.out.println("Bulan: Maret (bulan ke-3)");
                break;
            case 4:
                System.out.println("Bulan: April (bulan ke-4)");
                break;
            case 5:
                System.out.println("Bulan: Mei (bulan ke-5)");
                break;
            case 6:
                System.out.println("Bulan: Juni (bulan ke-6)");
                break;
            case 7:
                System.out.println("Bulan: Juli (bulan ke-7)");
                break;
            case 8:
                System.out.println("Bulan: Agustus (bulan ke-8)");
                break;
            case 9:
                System.out.println("Bulan: September (bulan ke-9)");
                break;
            case 10:
                System.out.println("Bulan: Oktober (bulan ke-10)");
                break;
            case 11:
                System.out.println("Bulan: November (bulan ke-11)");
                break;
            case 12:
                System.out.println("Bulan: Desember (bulan ke-12)");
                break;
            default:
                 //Default case digunakan jika tidak ada case yang cocok dengan nilai expression
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                break;
        }
    //Fall through untuk hari dalam bulan
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            //Intention fall through untuk 31 hari
            System.out.println("Jumlah hari: 31 hari");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            //Intention fall through untuk 30 hari
            System.out.println("Jumlah hari: 30 hari");
            break;
        case 2:
            //Intention fall through untuk 28 hari
            System.out.println("Jumlah hari: 28 hari");
            break; 
        default:
            System.out.println("Error: Bulan tidak valid");  
            break;
        }
    }
}
