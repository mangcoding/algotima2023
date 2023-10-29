public class Bilangan {
    public static void main(String[] args) throws Exception {
        int c = 0;
        for (int i=0; i<=2; i++) {
            for (int j=1; j<=5; j++) {
                c = i+j;
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
