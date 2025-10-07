import java.util.Scanner;
public class jobsheet3 {
    public static void main(String[] args) {
        double hargaAwal;
        double uangDp;
        double uangSisa;
        double waktuCicilan;
        double bunga = 0.01;
        double totalBunga;
        double totalBayarTiapBulan;
        double totalBayar;

        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan harga awal ");
        hargaAwal = sc.nextDouble();
        System.out.println("masukkan uang dp ");
        uangDp = sc.nextDouble();
        System.out.println("lama waktu cicilan ");
        waktuCicilan = sc.nextDouble();

        uangSisa = hargaAwal-uangDp;
        bunga = 0.01*uangSisa;
        totalBunga = bunga*waktuCicilan;
        totalBayarTiapBulan = (uangSisa/waktuCicilan) +bunga;
        totalBayar = hargaAwal+totalBunga;

        System.out.println("masukkan harga motor " +hargaAwal);
        System.out.println("masukkan dp " +uangDp);
        System.out.println("masukkan uang sisa " +uangSisa);
        System.out.println("masukkan lama cicilan " +waktuCicilan);
        System.out.println("masukkan bunga " +bunga);
        System.out.println("masukkan total bunga " +totalBunga);
        System.out.println("masukkan total pembayaran setiap bulan " +totalBayarTiapBulan);
        System.out.println("masukkan total semua pembayaran " +totalBayar);

        
    }
    
}
