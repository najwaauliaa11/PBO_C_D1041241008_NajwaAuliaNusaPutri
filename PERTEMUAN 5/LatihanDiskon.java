/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan menghitung diskon
 */

public class LatihanDiskon {
    public static void main(String[] args) {
        double totalBelanja=750000;
        double diskon;
        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp "+totalBelanja);
        //Cek jika total belanja lebih dari 1 jt maka akan mendapat diskon 15%
        if (totalBelanja>=1000000){
            diskon = totalBelanja * 0.15;
            System.out.println("Diskon (15%): Rp "+diskon);
        }
        //Cek jika total belanja lebih dari 500 rb dan kurang dari 1 jt maka akan mendapat diskon 10% 
        else if (totalBelanja >= 500000 && totalBelanja<1000000){
            diskon = totalBelanja * 0.10;
            System.out.println("Diskon (10%): Rp "+diskon);
        }
        //Cek jika total belanja lebih dari 100 rb dan kurang dari 500 rb maka akan mendapat diskon 5% 
        else if (totalBelanja >=100000 && totalBelanja <500000){
            diskon = totalBelanja * 0.05;
            System.out.println("Diskon (5%): Rp "+diskon);
        }
        //Cek jika total belanja kurang dari 100 rb maka tidak akan mendapat diskon
        else{
            diskon = totalBelanja*0;
            System.out.println("Disok (0%): Rp "+diskon);
        }
        //Deklarasi akhir
        System.out.println("Harga Akhir: Rp "+(totalBelanja-diskon));
        System.out.println("Anda hemat: Rp "+diskon);

    }
}
