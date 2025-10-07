public class jobsheet1 {

    public static void main(String[] args) {
        System.out.println("NIM\tNAMA \t PRODI");
        String[] nama = {"varell", "wildan", "fadila", "warda", "Naura", "yuna", "allay", "ajiz", "farda", "brian"};
        String[] prodi = {"Teknik informatika", "Sib"};
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1+"\t"+nama[i]+"\t "+prodi[i%2]);
        }
     }
    }