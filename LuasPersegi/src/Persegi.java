public class Persegi {
    int sisi;
    Double luas;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int luas() {
        return this.sisi * this.sisi;
    }

    public Double hitungLuas(Double s) {
        this.luas = s * s;
        return this.luas;
    }
}
