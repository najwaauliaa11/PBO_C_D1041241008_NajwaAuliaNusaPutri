/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan Switch Statement: Multiple Selection
 */

public class LatihanRestoran {
    public static void main(String[] args) {
        //Deklarasi variabel
        int menuCode = 1;
        int quantity = 2;
        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: "+menuCode);
        System.out.println("Jumlah: "+quantity);
        System.out.println();
        System.out.println("Pesanan Anda:");

        int totalPrice=0;
        String menuName;
        int price=0;

        //Buat swicth untuk kode menu
        switch (menuCode) {
            case 1:
                menuName= "Nasi Goreng";
                price =15000;
                totalPrice = quantity*price;
                System.out.println("Nama Menu: "+ menuName);
                System.out.println("Harga Satuan: Rp "+price);
                System.out.println("Jumlah: "+quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp "+totalPrice);
                break;
            case 2:
                menuName= "Mie Ayam";
                price =12000;
                totalPrice = quantity*price;
                System.out.println("Nama Menu: "+ menuName);
                System.out.println("Harga Satuan: Rp "+price);
                System.out.println("Jumlah: "+quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp "+totalPrice);
                break;
            case 3:
                menuName= "Bakso";
                price =10000;
                totalPrice = quantity*price;
                System.out.println("Nama Menu: "+ menuName);
                System.out.println("Harga Satuan: Rp "+price);
                System.out.println("Jumlah: "+quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp "+totalPrice);
                break;
            case 4:
                menuName= "Soto Ayam";
                price =13000;
                totalPrice = quantity*price;
                System.out.println("Nama Menu: "+ menuName);
                System.out.println("Harga Satuan: Rp "+price);
                System.out.println("Jumlah: "+quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp "+totalPrice);
                break;
            case 5:
                menuName= "Es Teh";
                price =3000;
                totalPrice = quantity*price;
                System.out.println("Nama Menu: "+ menuName);
                System.out.println("Harga Satuan: Rp "+price);
                System.out.println("Jumlah: "+quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp "+totalPrice);
                break;
        }

    System.out.println();
    }
}
