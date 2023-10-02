public class Tiket {
    public static void main(String[] args) throws Exception {
        String jk="P";
        int umur=2;
        int harga_tiket = 0;

        if (jk.equals("L")) {
            if (umur >20) {
                harga_tiket = 20000;
            }else if (umur > 10) {
                harga_tiket = 15000;
            }else{
                harga_tiket = 10000;
            }
        } else{
            if (umur >20) {
                harga_tiket = 19000;
            }else if (umur > 10) {
                harga_tiket = 15000;
            }else{
                harga_tiket = 8000;
            }
        }

        System.out.println("Harga tiket: "+harga_tiket);
    }
}
