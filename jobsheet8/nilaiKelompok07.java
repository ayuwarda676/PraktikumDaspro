package jobsheet8;
import java.util.Scanner;
public class nilaiKelompok07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int i, j, nilai;
        float rataRata, totalNilai;

        totalNilai = 0;
        for ( j = 1; j <= 5; j++) {
            System.out.print("Nilai dari Kelompok Penilai " + j + " : ");
            nilai = sc.nextInt();
            totalNilai += nilai;
        }

        i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for ( j = 1; j <= 5; j++) {
                System.out.print(" Masukkan nilai dari penilai " + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataRata = totalNilai / 5;
            System.out.println("Kelompok " + i + ": " + "nilai rata rata = " + rataRata);
            i++;

        }

    }
    
}
