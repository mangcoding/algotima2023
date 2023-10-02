public class Belanja {
    public static void main(String[] args) throws Exception {
        Double discount = (double) 0;
        Double belanja = (double) 150000;

        if (belanja > 100000) {
            discount = (double) 10/100 * belanja;
        }

        Double totalbayar = belanja-discount;
        System.out.println("Total bayar: "+totalbayar);
    }
}
