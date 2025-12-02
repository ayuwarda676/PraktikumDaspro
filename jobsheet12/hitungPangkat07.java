package jobsheet12;
import java.util.Scanner;
public class hitungPangkat07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
        System.out.println();
        cetakDeretPangkat(bilangan, pangkat);
        System.out.println(" = " + hitungPangkat(bilangan, pangkat));
    }

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    static void cetakDeretPangkat(int x, int y) {
        for (int i = 0; i <= y; i++) {
            System.out.print(x + "x");
        }
        System.out.print("1");
    }
    
}
