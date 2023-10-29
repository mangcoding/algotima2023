import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SampleArray {
    public static void main(String[] args) throws Exception {
        BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in));
        String mahaSiswa[] = new String[4];
        Double nilai[] = new Double[4];
        Double total = 0.0;
        String Indeks = "A";
        int i = 0;
        do {
            System.out.println("Mahasiswa ke-" +(i+1));
            System.out.print("Nama: ");
            mahaSiswa[i] = inputan.readLine().toString();
            System.out.print("Nilai: ");
            nilai[i] = Double.parseDouble(inputan.readLine());
            i++;
        }while(i<mahaSiswa.length);

        inputan.close();
        System.out.println("======================================");
        System.out.println("Nama\t\tNilai\t\tIndeks");
        System.out.println("======================================");
        for (int z=0; z< mahaSiswa.length; z++) {
            //Indeks nya tolong dihituung pake if else
            total += nilai[z];
            System.out.println(mahaSiswa[z]+ "\t\t"+nilai[z]+"\t\t"+Indeks);
        }
        System.out.println("======================================");
        System.out.println("Total Nilai: "+total);
        System.out.println("Rata-rata "+total/mahaSiswa.length);
        System.out.println("======================================");
    }
}
