package AlgoSinavlari;

public class finalalgo6 {
    public static void main(String[] args) {
        Calisan kisi1 = new Calisan("Master Solver", 123, 9000);
        Calisan kisi2 = new Calisan("Code Warrior", 124, 8000);
        kisi1.bilgileriGoster();
        kisi2.bilgileriGoster();
    }


    static class Calisan {
        private int sicilNo;
        private String adSoyad;
        private double maas;

        Calisan(String a, int s, double m) {
            sicilNo = s;
            adSoyad = a;
            maas = m;
        }

        public void bilgileriGoster() {
        }
    }
}
