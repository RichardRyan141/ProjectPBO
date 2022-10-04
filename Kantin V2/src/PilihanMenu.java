public class PilihanMenu extends Menu{
    private String namaMakanan;
    private double hargaMakanan;

    public PilihanMenu(String jenisMenu, String namaMakanan, double hargaMakanan) {
        super(jenisMenu);
        this.setData(namaMakanan);
        this.setData(hargaMakanan);
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setData(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }
    public void setData(String namaMakanan) { this.namaMakanan = namaMakanan;}
    public String CetakMenu()
    {
        return ("Jenis makanan : " + super.getJenisMenu() + "\n" +
                "Nama makanan : " + this.getNamaMakanan() + "\n" +
                "Harga makanan : " + this.getHargaMakanan());
    }
}
