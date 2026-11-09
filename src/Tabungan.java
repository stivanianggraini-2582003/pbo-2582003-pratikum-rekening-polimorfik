
public class Tabungan extends Rekening implements BerBunga {
    private double bunga;

    public Tabungan(String nomor, String pemilik,
                    int saldo, double bunga) {
        super(nomor, pemilik, saldo);
        this.bunga = bunga;
    }

    @Override
    public int biayaAdminBulanan() {
        if (saldo >= 1000000) {
            return 0;
        }
        return 5000;
    }

    @Override
    public int tambahBunga() {
        int jumlahBunga = (int) ((saldo * bunga) / 100);
        saldo += jumlahBunga;
        return jumlahBunga;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.printf("      Tabungan, bunga %.1f%% per bulan%n",
                bunga);
    }
}
