import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Siswa {
    String name;
    Integer nilai;

    public Siswa(String name, Integer nilai) {
        this.name = name;
        this.nilai = nilai;
    }
}

public class Contoh {
    public static void main(String[] args) throws Exception {
        ArrayList<Siswa> tekhnik = new ArrayList<Siswa>();
        int menu =1;
        int indeksA=0;
        int indeksB=0;
        int indeksC=0;
        int indeksD=0;
        int indeksE=0;

        do {
            BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in)); 
            System.out.print("Nama: ");
            String name = inputan.readLine().toString();
            System.out.print("Nilai: ");
            Integer nilai = Integer.parseInt(inputan.readLine());
            tekhnik.add(new Siswa(name, nilai));

            System.out.print("Pilih menu: 1)Add 2)Show 3)Exit : ");
            menu = Integer.parseInt(inputan.readLine());

            if (menu == 2) {
                for (Siswa mhs:tekhnik) {
                    String indeks = Contoh.convertToIndeks(mhs.nilai);
                    if (indeks == "A")
                        indeksA++;
                    else if (indeks == "B")
                        indeksB++;
                    else if (indeks == "C")
                        indeksC++;
                    else if (indeks == "D")
                        indeksD++;
                    else 
                        indeksE++;

                    System.out.println(mhs.name+" : "+mhs.nilai+" "+indeks);
                }

                System.out.println("Indeks A "+indeksA);
                System.out.println("Indeks B "+indeksB);
                System.out.println("Indeks C "+indeksC);
                System.out.println("Indeks D "+indeksD);
                System.out.println("Indeks E "+indeksE);
            }

        }while(menu !=3);
    }

    public static String convertToIndeks(Integer nilai) {
        String result = "E";

        if (nilai >=85) 
            result = "A";
        else if (nilai >=75) 
            result = "B";
        else if (nilai >=65) 
            result = "C";
        else if (nilai >=55) 
            result = "D";

        return result;
    }
}
