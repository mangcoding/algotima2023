import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);
        int harga_per_kilo = 15000;

        System.out.print("Masukkan jeruk yang dibeli (kg): ");
        int jumlah_kilo = masukan.nextInt();
        
        System.out.print("Masukkan uang dibayarkan: ");
        int uang_yang_dibayar = masukan.nextInt();

        int jumlah_bayar = jumlah_kilo * harga_per_kilo;
        int kembalian = uang_yang_dibayar - jumlah_bayar;
        System.out.println("Uang yang dikasih: "+uang_yang_dibayar);
        System.out.println("Jumlah yang dibayar: " + jumlah_bayar);
        System.out.println("Kembalian: " + kembalian);
        masukan.close();
    }
}