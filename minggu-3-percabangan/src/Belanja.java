public class Belanja {
    public static void main(String[] args) throws Exception {
        int discount = 0;
        int belanja = 150000;

        if (belanja > 100000) {
            discount = 10*belanja/100;
        }

        int totalbayar = belanja-discount;
        System.out.println("Total bayar: "+totalbayar);
    }
}
