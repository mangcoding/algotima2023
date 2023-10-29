public class Fibonanci {
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i=0; i<6; i++) {
            System.out.print(c+" ");
            a = b;
            b = c;
            if (i==0) {
                c = 1;
            }else{
                c = a + b;
            }
        }
    }
}