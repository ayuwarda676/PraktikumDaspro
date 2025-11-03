package jobsheet8;
import java.util.Scanner;
public class kopiSenja07 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int jumlahCabang, totalPelanggan = 0, item, totalItem = 0, jumlahPelanggan, totalItemCabang;
        
        System.out.print("Masukkan jumlah cabang kopi senja: ");
        jumlahCabang = sc.nextInt();

        System.out.println();
        System.out.println("==========DATA PENJUALAN KOPI SENJA==========");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println();
            System.out.println("----- Cabang " + i + " -----");
            System.out.print("Masukkan jumlah pelanggan hari ini: ");
            jumlahPelanggan = sc.nextInt();

            totalItemCabang = 0;

            for (int j =1; j <= jumlahPelanggan; j++) {
                System.out.print("Masukkan jumlah item yang dibeli pelanggan ke- " + j + "memesan berapa item? : ");
                item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println();
            System.out.println("Cabang " + i + " :");
            System.out.println("- Pelanggan " + jumlahPelanggan + " orang");
            System.out.println("- Total item terjual : " + totalItemCabang + " item");

            totalPelanggan += jumlahPelanggan;
            totalItem += totalItemCabang;
        }
        System.out.println();
        System.out.println("==========TOTAL PENJUALAN KOPI SENJA==========");
        System.out.println("Total pelanggan hari ini: " + totalPelanggan + " orang");
        System.out.println("Total item terjual hari ini: " + totalItem + " item");
    }
    
}
