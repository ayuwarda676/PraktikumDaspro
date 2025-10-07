import java.util.Scanner;
public class jobsheet2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jariJari = 2.0 / 2;
        System.out.println("masukkan panjang :");
        double panjang = input.nextInt();
        System.out.println("masukkan lebar :");
        double lebar = input.nextInt();
        System.out.println("masukkan diameter :");
        double diameter  = input.nextInt();
        System.out.println("masukkan sisi");
        double sisi = input.nextInt();


        double luasTanah = panjang * lebar;
        double luasKolamLingkaran = 2 * (Math.PI * Math.pow(diameter/2.0, 2));
        double luasKolamPersegi = 2 * (sisi * sisi);
        double luasRumput = luasTanah - (luasKolamLingkaran + luasKolamPersegi);

        System.out.println("luasTanahRumput :" + luasRumput + " m2");


        
    }

    
}
