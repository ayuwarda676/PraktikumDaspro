package jobsheet5;
import java.util.Scanner;
public class implementasiFlowchart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- IZIN MASUK PERPUSTAKAAN DAN AKSES WIFI KAMPUS ---");
        System.out.println("1. Cek izin masuk perpustakaan");
        System.out.println("2. Cek akses WiFi kampus");
        System.out.print("Pilih menu (1/2): ");
        int menu = input.nextInt();
        input.nextLine();

        switch (menu) {
            case 1:
                // ------- SISTEM IZIN MASUK PERPUSTAKAAN -------
                System.out.println("\n--- Sistem Izin Masuk Perpustakaan ---");

                System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
                boolean bawaKartu = input.nextBoolean();

                System.out.print("Apakah sudah registrasi online? (true/false): ");
                boolean registrasiOnline = input.nextBoolean();

                if (bawaKartu || registrasiOnline) {
                    System.out.println("Izin masuk diberikan ");
                } else {
                    System.out.println("Izin masuk ditolak ");
                }
                break;

            case 2:
                // ------- SISTEM AKSES WIFI -------
                System.out.println("\n--- Sistem Akses WiFi Kampus ---");

                System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lainnya): ");
                String jenis = input.nextLine().toLowerCase();

                if (jenis.equals("dosen")) {
                    System.out.println("Akses WiFi diberikan ");
                } else if (jenis.equals("mahasiswa")) {
                    System.out.print("Masukkan jumlah SKS yang diambil: ");
                    int sks = input.nextInt();

                    if (sks >= 12) {
                        System.out.println("Akses WiFi diberikan ");
                    } else {
                        System.out.println("Akses ditolak, SKS kurang dari 12 ");
                    }
                } else {
                    System.out.println("Akses ditolak ");
                }
                break;

            default:
                System.out.println("Pilihan menu tidak valid.");
                break;
        }

        input.close();
    }
    
}
