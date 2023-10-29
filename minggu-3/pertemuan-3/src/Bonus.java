import java.text.NumberFormat;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan gaji: ");
        Double gaji = inputan.nextDouble();
        Double bonus = (double) 0;

        System.out.print("Kinerja saat ini: ");
        String kinerja = inputan.next();

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        if (kinerja.equals("Sangat baik")) {
            bonus = 20*gaji/100;
        } else if (kinerja.equals("Baik")) {
            bonus = 10*gaji/100;
        } else if (kinerja.equals("Cukup")) {
            bonus = 5*gaji/100;
        } else {
            bonus = (double) 0;
        }    
        
        Double total = gaji + bonus;
        System.out.println("Gaji bulan ini: " + formatter.format(total));
        inputan.close();
    }
}
