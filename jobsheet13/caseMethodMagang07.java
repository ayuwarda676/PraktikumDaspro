package jobsheet13;
import java.util.Scanner; // Import Scanner untuk input
public class caseMethodMagang07 {
    // Array 2D untuk menyimpan maksimal 100 data magang, dan tiap data memiliki 6 kolom
    static String[][] data = new String[100][6];

    static int jumlahData = 0; // Menyimpan jumlah data yang sudah diinput

    // Scanner global supaya bisa digunakan di semua method
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan; // Variabel untuk menyimpan menu pilihan

        // Loop menu utama
        do {
            System.out.println("=== Sistem Pendaftaran Magang Mahasiswa ===");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            pilihan = Integer.parseInt(sc.nextLine());// Membaca input pilihan user

            // Menjalankan fitur sesuai pilihan user
            switch (pilihan) {
                case 1:
                    tambahData(); // Memanggil method tambahData
                    break;
                case 2:
                    tampilkanSemua(); // Memanggil method tampilkanSemua
                    break;
                case 3:
                    cariProdi(); // Memanggil method cariProdi
                    break;
                case 4:
                    hitungStatus(); // Memanggil method hitungStatus
                    break;
                case 5:
                    System.out.println("Program selesai."); // Keluar dari program
                    break;
                default:
                    System.out.println("Pilihan tidak valid!"); // Pesan error untuk pilihan tidak valid
            }
            System.out.println();

        } while (pilihan != 5); // Ulangi sampai user memilih untuk keluar
    }

    // =============================
    // 1) Fungsi tambah data magang
    // =============================
    public static void tambahData() {

        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine(); // Input nama mahasiswa

        System.out.print("NIM: ");
        String nim = sc.nextLine(); // Input NIM mahasiswa

        System.out.print("Program Studi: ");
        String prodi = sc.nextLine(); // Input program studi mahasiswa

        System.out.print("Perusahaan Tujuan Magang: ");
        String perusahaan = sc.nextLine(); // Input perusahaan magang mahasiswa

        // VALIDASI SEMESTER (hanya 6 atau 7)
        int semester;
        while (true) {
            System.out.print("Semester pengambilan magang (6 atau 7): ");
            semester = Integer.parseInt(sc.nextLine()); // Input semester

            if (semester == 6 || semester == 7) // Validasi semester
                break; // Keluar dari loop jika valid
            System.out.println("Semester tidak valid! Hanya boleh 6 atau 7.");
        }

        // VALIDASI STATUS MAGANG
        String status;
        while (true) {
            System.out.print("Status magang (Diterima/Menunggu/Ditolak): ");
            status = sc.nextLine(); // Input status magang

            // Validasi teks status
            if (status.equalsIgnoreCase("Diterima") || status.equalsIgnoreCase("Menunggu") || status.equalsIgnoreCase("Ditolak"))
                break; // Keluar dari loop jika status valid

            System.out.println("Status tidak valid!");
        }

        // SIMPAN KE ARRAY 2D
        data[jumlahData][0] = nama;
        data[jumlahData][1] = nim;
        data[jumlahData][2] = prodi;
        data[jumlahData][3] = perusahaan;
        data[jumlahData][4] = String.valueOf(semester); // Konversi int -> String
        data[jumlahData][5] = status;

        jumlahData++; // Tambah jumlah data setelah disimpan

        System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar: " + jumlahData);
    }

    // =================================
    // 2) Fungsi menampilkan semua data
    // =================================
    public static void tampilkanSemua() {

        if (jumlahData == 0) {
        System.out.println("Belum ada pendaftar.");
        return; // Keluar dari method jika tidak ada data
    }

    // Header tabel
    System.out.printf("\n%-4s %-20s %-12s %-15s %-15s %-10s %-10s\n",
            "No", "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");

    System.out.println("-------------------------------------------------------------------------------------------");

    // Menampilkan data
    for (int i = 0; i < jumlahData; i++) {
        System.out.printf("%-4d %-20s %-12s %-15s %-15s %-10s %-10s\n",
                (i + 1),      // Nomor urut
                data[i][0],   // Nama
                data[i][1],   // NIM
                data[i][2],   // Prodi
                data[i][3],   // Perusahaan
                data[i][4],   // Semester
                data[i][5]);  // Status
    }
}

    // =========================================
    // 3) Fungsi cari berdasarkan program studi
    // =========================================

    public static void cariProdi() {

    System.out.print("Masukkan Program Studi: ");
    String cari = sc.nextLine();

    boolean ditemukan = false;

    System.out.printf("\n%-4s %-20s %-12s %-15s %-15s %-10s %-10s\n",
            "No", "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");

    System.out.println("-------------------------------------------------------------------------------------------");

    for (int i = 0; i < jumlahData; i++) {
        if (data[i][2].equalsIgnoreCase(cari)) {

            ditemukan = true;

            System.out.printf("%-4d %-20s %-12s %-15s %-15s %-10s %-10s\n",
                    (i + 1),
                    data[i][0],   // Nama
                    data[i][1],   // NIM
                    data[i][2],   // Prodi
                    data[i][3],   // Perusahaan
                    data[i][4],   // Semester
                    data[i][5]);  // Status
        }
    }

    if (!ditemukan) {
        System.out.println("Tidak ada pendaftar dari program studi tersebut.");
    }
}

    // =========================================================
    // 4) Fungsi menghitung jumlah pendaftar berdasarkan status
    // =========================================================
    public static void hitungStatus() {

        // Inisialisasi counter untuk setiap status
        int diterima = 0;
        int menunggu = 0;
        int ditolak = 0;

        // Loop untuk menghitung banyak data per status
        for (int i = 0; i < jumlahData; i++) { // Loop untuk setiap data
            switch (data[i][5].toLowerCase()) { // Cek status pada kolom ke-5
                case "diterima": // Jika status "diterima"
                    diterima++; // Tambah counter diterima
                    break; // Keluar dari loop jika status valid
                case "menunggu": // Jika status "menunggu"
                    menunggu++; // Tambah counter menunggu
                    break; // Keluar dari loop jika status valid
                case "ditolak": // Jika status "ditolak"
                    ditolak++; // Tambah counter ditolak
                    break; // Keluar dari loop jika status valid
            }
        }

        // Tampilkan hasil perhitungan
        System.out.println("Diterima : " + diterima);
        System.out.println("Menunggu : " + menunggu);
        System.out.println("Ditolak  : " + ditolak);
        System.out.println("Total pendaftar: " + jumlahData);
    }

}