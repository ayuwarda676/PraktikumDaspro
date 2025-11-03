package jobsheet7;
import java.util.Scanner;
public class tarifParkir07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisKendaraan, lamaParkir, jumlahKendaraan;
        double biayaParkir = 0, totalBiaya = 0;

        System.out.print("Masukkan jumlah kendaraan yang ingin dihitung: ");
        jumlahKendaraan = sc.nextInt();

        for (int i = 1; i <= jumlahKendaraan; i++) {
            System.out.print("Kendaraan ke- " + i);
            System.out.print(" Jenis Kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenisKendaraan = sc.nextInt();
        
            if (jenisKendaraan == 0) {
                System.out.println("Input dihentikan oleh pengguna.");
                break;
            }

            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Jenis kendaraan tidak valid.");
                i--;
                continue;
            }

            System.out.print("Masukkan lama parkir (dalam jam): ");
            lamaParkir = sc.nextInt();

            if (lamaParkir > 5) {
                biayaParkir = 12500;
            } else {
                if (jenisKendaraan == 1) {
                    biayaParkir = lamaParkir * 3000;
                } else if (jenisKendaraan == 2) {
                    biayaParkir = lamaParkir * 2000;
                }

            }
            System.out.println("Biaya parkir untuk kendaraan ke-" + i + ": Rp" + biayaParkir);
            totalBiaya += biayaParkir;
        }
        
        System.out.println();
        System.out.println("==========TOTAL BIAYA PARKIR==========");
        System.out.println("Total Biaya Parkir: Rp" + totalBiaya);
        System.out.println("======================================");

    }
}

