package jobsheet9;
import java.util.Scanner;
public class searchNilai07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    System.out.print("Masukkan banyaknya nilai yang akan di input: ");
    int n = sc.nextInt();
    int[] arrInput = new int[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + ": ");
        arrInput[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
        System.out.print("Masukkan nilai yang akan dicari: ");
        int key = sc.nextInt();
        int hasil = 0;

        for (int j = 0; j < n; j++) {
            if (arrInput[j] == key) {
                hasil = j;
                break;
            }
        }
            if (hasil != 0) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + hasil);
            } else {
                System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
            }
        }
    }
}
