package jobsheet9;
import java.util.Scanner;
public class menuKafe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println();
        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) { 
                ditemukan = true;
                posisi = i;
                break; 
            }
        }
        System.out.println();
        System.out.println("=== Hasil Pencarian ===");
        if (ditemukan) {
            System.out.println("Makanan \"" + menu[posisi] + "\" tersedia di menu kafe.");
        } else {
            System.out.println("Maaf, makanan \"" + cari + "\" tidak ada di menu.");
        }

        sc.close();
    }
    
}
