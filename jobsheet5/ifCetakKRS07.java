package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi.");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Pembayaran UKT ditolak.");
            System.out.println("Silakan lunasi UKT terlebih dahulu.");
        }

        // Ternary operator
        String pesan = uktLunas ? "Pembayaran UKT terverifikasi. Silakan cetak KRS dan minta tanda tangan DPA" : "Pembayaran UKT belum terverifikasi. Silakan lunasi UKT terlebih dahulu.";
        System.out.println(pesan);
        
    }
    
}
