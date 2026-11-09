
public class Giro extends Rekening {
    private int batasOverdraft;

    public Giro(String nomor, String pemilik,
                int saldo, int batasOverdraft) {
        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    @Override
    public int biayaAdminBulanan() {
        return 15000;
    }

    public boolean tarik(int jumlah) {
        if (saldo - jumlah >= -batasOverdraft) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.printf("      Giro, batas overdraft Rp%,d%n",
                batasOverdraft);
    }
}
