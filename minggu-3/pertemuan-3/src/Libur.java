import java.util.Scanner;

public class Libur {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan hari: ");
        String hari = inputan.nextLine();
        hari = hari.toLowerCase();

        if (hari.equals("sabtu") || hari.equals("minggu")) {
            System.out.println("Hari libur");
        } else {
            System.out.println("Hari kerja");
        }

        inputan.close();
    }
}
