/*
NIM : D1041241008
Nama : Najwa Aulia Nusa Putri
Program untuk latihan operator increment
 */
public class LatihanCounter {
    public static void main(String[] args) {
        int counter=10;
        System.out.println("=== COUNTER ===");
        System.out.println("Nilai Awal: "+counter);
        counter++;
        counter++;
        System.out.println("Setelah ++ (2x): "+counter);
        counter--;
        System.out.println("Setelah --: "+ counter);
        System.out.println("Setelah += 5: "+(counter+=5));
        System.out.println("Setelah -= 3: "+(counter-=3));
         System.out.println("Setelah *= 2: "+(counter*=2));
        
        
    }
    
}
