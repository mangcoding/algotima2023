public class Tiket {
    public static void main(String[] args) throws Exception {
        String jk = "L";
        int umur = 20;
        Double harga = 0.0;

        if (jk.equals("L")) {
            if (umur >=0 && umur <10) {
                harga = 10000.0;
            }else if (umur >=10 && umur <20) {
                harga = 20000.0;
            }else {
                harga = 80000.0;
            }
        }else{
            if (umur >=0 && umur <5) {
                harga = 5000.0;
            }else if (umur >=5 && umur <10) {
                harga = 8000.0;
            }else if (umur >=10 && umur <20) {
                harga = 20000.0;
            }else {
                harga = 100000.0;
            }
        }
    }
}
