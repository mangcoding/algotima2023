import java.util.Stack;

public class SampleStack {
    public static void main(String[] args) throws Exception {
        Stack<String> Mahasiswa = new Stack<String>();
        Mahasiswa.push("Anton");
        Mahasiswa.push("Aldi");
        Mahasiswa.push("Rina");
        Mahasiswa.pop();

        for (String mhs:Mahasiswa) {
            System.out.println(mhs);
        }
    }
}
