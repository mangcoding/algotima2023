public class App {
    public static void main(String[] args) throws Exception {
        Double belanja = (double) 170000;
        Double diskon = (double) 0;

        if (belanja >100000) {
            diskon = belanja * 10/100;
        }

        Double total = belanja - diskon;

        System.out.println("Total belanja: " + belanja);
        System.out.println("Total yang harus dibayar: " + total);
        
    }
}