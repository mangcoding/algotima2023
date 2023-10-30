import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupByBooks {
    public static void main(String[] args) throws Exception {
        ArrayList<Mahasiswa> listmahaSiswa = new ArrayList<Mahasiswa>();
        int menu = 1;
        Map<String, Integer> indeks = new HashMap<>();
        do {
            showMenu();
            BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in));
    
            System.out.print("Pilih Menu: ");
            menu = Integer.parseInt(inputan.readLine());

            if (menu == 1) {
                System.out.print("NIM: ");
                String nim = inputan.readLine().toString();
                System.out.print("Buku yang dipinjam: ");
                String nama = inputan.readLine().toString();

                if (!indeks.containsKey(nama)) {
                    indeks.put(nama,1);
                }else{
                    indeks.replace(nama, indeks.get(nama).intValue()+1);
                }
                listmahaSiswa.add(new Mahasiswa(nim, nama));
            } else if (menu == 2) {
                displayMhs(listmahaSiswa);
                /* Loop Indeks */
                for (Map.Entry<String,Integer> entry : indeks.entrySet())  
                    System.out.println("Buku = " + entry.getKey() + ", Jumlah = " + entry.getValue()); 
            }else {
                displayMhs(listmahaSiswa);
            }
        }while(menu != 3);
    }

    public static void showMenu() {
        System.out.println("=============================================================================");
        System.out.print("1) Tambah ");
        System.out.print("2) Tampilkan ");
        System.out.print("3) Exit");
        System.out.println();
    }

    public static void displayMhs(ArrayList<Mahasiswa> listmahaSiswa) {
        System.out.println("=============================================================================");
        System.out.println("NIM\t\t\tBuku Yang dipinjam");
        for (Mahasiswa mhs: listmahaSiswa) {
            String buku = mhs.buku;
            if (mhs.nim.length()<8)
                buku = "\t"+buku;
            System.out.println(mhs.nim+ "\t\t"+buku);
        }
        System.out.println("==============================================================================");
    }
}
