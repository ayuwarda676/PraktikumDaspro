package jobsheet6;
import java.util.Scanner;
public class caseMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mataKuliah1 = "Algoritma dan Pemrograman";
        String mataKuliah2 =  "Struktur Data";

        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Masukkan Nama:");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        System.out.println("---- Mata Kuliah 1: Algoritma dan Pemrograman---- ");
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaiTugas1 = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int nilaiUTS1 = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int nilaiUAS1 = sc.nextInt();

        System.out.println("---- Mata Kuliah 2: Struktur Data---- ");
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaiTugas2 = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int nilaiUTS2 = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int nilaiUAS2 = sc.nextInt();

        double nilaiAkhir1 = (nilaiTugas1 * 0.3) + (nilaiUTS1 * 0.4) + (nilaiUAS1 * 0.3);
        double nilaiAkhir2 = (nilaiTugas2 * 0.3) + (nilaiUTS2 * 0.4) + (nilaiUAS2 * 0.3);
        double rataRataNilaiAkhir = (nilaiAkhir1 + nilaiAkhir2) / 2;


        String nilaiHuruf1 = "";
        if (nilaiAkhir1 >= 80 && nilaiAkhir1 <= 100) {
            nilaiHuruf1 = "A";
        } else if (nilaiAkhir1 > 73 && nilaiAkhir1 <= 80) {
            nilaiHuruf1 = "B+";
        } else if (nilaiAkhir1 > 65 && nilaiAkhir1 <= 73) {
            nilaiHuruf1 = "B";
        } else if (nilaiAkhir1 > 60 && nilaiAkhir1 <= 65) {
            nilaiHuruf1 = "C+";
        } else if (nilaiAkhir1 > 50 && nilaiAkhir1 <= 60) {
            nilaiHuruf1 = "C";
        } else if (nilaiAkhir1 > 39 && nilaiAkhir1 <= 50) {
            nilaiHuruf1 = "D";
        } else if (nilaiAkhir1 <= 39) {
            nilaiHuruf1 = "E";
        } else {
            System.out.println("Nilai Huruf Tidak Valid");
        }
        

        String nilaiHuruf2 = "";
        if (nilaiAkhir2 >= 80 && nilaiAkhir2 <= 100) {
            nilaiHuruf2 = "A";
        } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) {
            nilaiHuruf2 = "B+";
        } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) {
            nilaiHuruf2 = "B";
        } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) {
            nilaiHuruf2 = "C+";
        } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) {
            nilaiHuruf2 = "C";
        } else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) {
            nilaiHuruf2 = "D";
        } else if (nilaiAkhir2 <= 39) {
            nilaiHuruf2 = "E";
        } else {
            System.out.println("Nilai Huruf Tidak Valid");
        }

    
        String STATUS;
        if (nilaiAkhir1 >= 60 && nilaiAkhir2 >= 60) {
            STATUS = "Lulus";
        } else if (nilaiAkhir1 < 60 && nilaiAkhir2 < 60) {
            STATUS = "Tidak Lulus";
        } else {
            STATUS = "Status Tidak Diketahui";
        }


        String statusSemester;
        if (STATUS.equals("Lulus")) {
            if (rataRataNilaiAkhir >= 70) {
                statusSemester = "LULUS";
            } else if (rataRataNilaiAkhir < 70) {
                statusSemester = "TIDAK LULUS";
            } else {
                statusSemester = "TIDAK LULUS";
            }
        } else {
            statusSemester = "TIDAK LULUS";
        }


        System.out.println();
        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println();

        System.out.println(mataKuliah1);
        System.out.println("Nilai Tugas: " + nilaiTugas1);
        System.out.println("Nilai UTS: " + nilaiUTS1);
        System.out.println("Nilai UAS: " + nilaiUAS1);
        System.out.println();

        System.out.println(mataKuliah2);
        System.out.println("Nilai Tugas: " + nilaiTugas2);
        System.out.println("Nilai UTS: " + nilaiUTS2);
        System.out.println("Nilai UAS: " + nilaiUAS2);

        System.out.println();
        System.out.println("========= HASIL PENILAIAN AKADEMIK =========");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println();
        System.out.println("Mata Kuliah                 UTS   UAS       Tugas     Nilai Akhir     Nilai Huruf     Status");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(mataKuliah1 + "   " + nilaiUTS1 + "    " + nilaiUAS1 + "        " + nilaiTugas1 + "          " + nilaiAkhir1 + "              " + nilaiHuruf1 + "            " + STATUS);
        System.out.println(mataKuliah2 + "               " + nilaiUTS2 + "    " + nilaiUAS2 + "        " + nilaiTugas2 + "          " + nilaiAkhir2 + "              " + nilaiHuruf2 + "            " + STATUS);
        System.out.println();
        System.out.println("Rata-rata Nilai Akhir " + rataRataNilaiAkhir);
        System.out.println("Status Kelulusan Semester : " + statusSemester);
        

}
}

