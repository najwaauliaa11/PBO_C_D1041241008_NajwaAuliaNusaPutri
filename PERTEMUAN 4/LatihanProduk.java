/*
Nim  : D1041241008
Nama : Najwa Aulia Nusa Putri
Program penggunaan operator aritmatika dasar
 */

public class LatihanProduk {

    public static final double pajak = 0.11;
    public static void main(String[] args) {
        String produk = "Laptop Asus";
        int harga = 7000000;
        int jumlah_stok = 15;
        boolean status = true;

        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: "+produk);
        System.out.println("Harga Satuan: Rp "+harga);
        System.out.println("Jumlah Stok: "+jumlah_stok);
        System.out.println("Status Tersedia: "+true);
        System.out.println("---");

        int total_stok = harga*jumlah_stok;
        long total_pajak = (long) (total_stok*pajak);
        System.err.println("Total nilai Stok: Rp "+total_stok);
        System.out.println("Pajak (11%): Rp "+total_pajak);

    }
    
}
