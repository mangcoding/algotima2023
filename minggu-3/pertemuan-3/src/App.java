import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Mahasiswa> listmahaSiswa = new ArrayList<Mahasiswa>();
        int menu = 1;

        do {
            showMenu();
            BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Pilih Menu: ");
            menu = Integer.parseInt(inputan.readLine());

            if (menu == 1) {
                System.out.print("NIM: ");
                String nim = inputan.readLine().toString();
                System.out.print("Nama: ");
                String nama = inputan.readLine().toString();
                System.out.print("Phone: ");
                String phone = inputan.readLine().toString();
                System.out.print("Nilai: ");
                int nilai = Integer.parseInt(inputan.readLine());

                listmahaSiswa.add(new Mahasiswa(nim, nama, phone, nilai));
            } else if (menu == 2) {
                displayMhs(listmahaSiswa);
            }
        }while(menu != 3);
    }

    public static void showMenu() {
        System.out.println("Menu :");
        System.out.print("1. Tambah Data or ");
        System.out.print("2. Tampilkan Data or ");
        System.out.print("3. Exit");
        System.out.println();
    }

    public static void displayMhs(ArrayList<Mahasiswa> listmahaSiswa) {
        System.out.println("====================================================================");
        System.out.println("NIM\t\tNama\t\tPhone\t\tNilai\t\tIndeks");
        for (Mahasiswa mhs: listmahaSiswa) {
            String Indeks = App.NilaiToIndex(mhs.nilai);
            System.out.println(mhs.nim+ "\t\t"+mhs.nama+"\t\t"+mhs.phone+"\t\t"+mhs.nilai+"\t\t"+Indeks);
        }
        System.out.println("===================================================================");
    }

    public static String NilaiToIndex(int nilai) {
        String index = "E";
        if (nilai >= 85) {
            index = "A";
        } else if (nilai >= 75) {
            index = "B";
        } else if (nilai >= 65) {
            index = "C";
        } else if (nilai >= 55) {
            index = "D";
        } else {
            index = "E";
        }
        return index;
    }
}

