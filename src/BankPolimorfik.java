
public class BankPolimorfik {
    public static void main(String[] args) {

        Tabungan ani = new Tabungan("101", "Ani", 1000000, 2.5);
        Tabungan citra = new Tabungan("102", "Citra", 300000, 2.0);
        Giro budi = new Giro("201", "Budi", 200000, 500000);

        Rekening[] semua = {ani, citra, budi};
        BerBunga[] berbunga = {ani, citra};

        // Rekening r = new Rekening("999", "Eko", 0);
        // Error: Rekening is abstract; cannot be instantiated.

        System.out.println("========== REKENING AWAL ==========");

        for (Rekening r : semua) {
            r.tampilkanInfo();
        }

        System.out.println();
        System.out.println("========== AKHIR BULAN ============");

        for (Rekening r : semua) {
            System.out.printf("%s biaya admin  : Rp%,d%n",
                    r.getNomor(), r.potongBiayaAdmin());
        }

        for (BerBunga b : berbunga) {
            System.out.printf("%s bunga        : Rp%,d%n",
                    b.getNomor(), b.tambahBunga());
        }

        System.out.println();
        System.out.println("========== REKENING AKHIR =========");

        int total = 0;

        for (Rekening r : semua) {
            r.tampilkanInfo();
            total += r.getSaldo();
        }

        System.out.println("-----------------------------------");
        System.out.printf("Total dana bank : Rp%,d%n", total);
    }
}
