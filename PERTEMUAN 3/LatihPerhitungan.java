/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan aritmatika dasar
 */

public class LatihPerhitungan {
    public static void main(String[] args) {
        int saldo = 1000000;
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal          : "+saldo);
        int setoran = 500000;
        System.out.println("Setoran             : "+setoran);
        saldo +=setoran;
        System.out.println("Saldo Setelah Setor : "+saldo);
        int penarikan = 250000;
        System.out.println("Penarikan           : "+penarikan);
        saldo-=penarikan;
        System.out.println("Saldo Akhir         : "+ saldo);
    }
}

