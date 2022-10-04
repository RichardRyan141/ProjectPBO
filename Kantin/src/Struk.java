public class Struk{
    private int idStruk;
    private double uangYangDiterima;
    private double hargaTotal;

    public Struk(int idStruk, double uangYangDiterima, double hargaTotal)
    {
        this.setIdStruk(idStruk);
        this.setUangYangDiterima(uangYangDiterima);
        this.setHargaTotal(hargaTotal);
    }
    public int getIdStruk() {
        return idStruk;
    }

    public void setIdStruk(int idStruk) {
        this.idStruk = idStruk;
    }

    public double getUangYangDiterima() {
        return uangYangDiterima;
    }

    public void setUangYangDiterima(double uangYangDiterima) {
        this.uangYangDiterima = uangYangDiterima;
    }

    public double getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(double hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
    public double UangKembalian()
    {
        return this.getUangYangDiterima() - this.getHargaTotal();
    }

    public String CetakStruk()
    {
        return ("ID : " + this.getIdStruk() + "\n" +
                "Uang yang diterima : " + this.getUangYangDiterima() + "\n" +
                "Harga Total : " + this.getHargaTotal() + "\n" +
                "Uang Kembalian : " + this.UangKembalian());
    }

}
