package jobsheet9;
import java.util.Scanner;
public class kafe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program Pemesanan Kafe ===");

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println();
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }
        System.out.println();
        System.out.println("=== Daftar Pesanan Anda ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " = Rp " + hargaPesanan[i]);
        }

        System.out.println("-----------------------------");
        System.out.println("Total biaya: Rp " + totalBiaya);


        if (totalBiaya > 100000) {
            System.out.println("Selamat! Anda mendapatkan diskon atau bonus minuman gratis!");
        } else {
            System.out.println("Terima kasih sudah memesan di kafe kami!");
        }

        sc.close();
    }

    }
    

