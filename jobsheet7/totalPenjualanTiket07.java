package jobsheet7;
import java.util.Scanner;
public class totalPenjualanTiket07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int jumlahTransaksi;
        int totalTiket = 0;
        double totalPenjualan = 0;

        System.out.print("Masukkan jumlah transaksi: ");
        jumlahTransaksi = sc.nextInt();
        for (int i = 1; i <= jumlahTransaksi; i++) {
            System.out.println("Transaksi Ke-" +i);
            System.err.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid total tiket tidak boleh negatif");
                i--;
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 4) {
                diskon = 0.1 * totalHarga;
            }else if (jumlahTiket > 10) {
                diskon = 0.15 * totalHarga;
            }

            double totalBayar = totalHarga - diskon;
            System.out.println("Diskon: Rp" +diskon);
            System.out.println("Total Bayar" +totalBayar);

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;
        }

        System.out.println();
        System.out.println("==========TOTAL PENJUALAN TIKET==========");
        System.out.println("Total tiket penjualan: " +totalTiket);
        System.out.println("Total Penjualan: " +totalPenjualan);
    }

    }

