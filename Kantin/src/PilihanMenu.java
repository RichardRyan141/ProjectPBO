public class PilihanMenu extends Menu{
    private String namaMakanan;
    private double hargaMakanan;

    public PilihanMenu(String jenisMenu, String namaMakanan, double hargaMakanan) {
        super(jenisMenu);
        this.setNamaMakanan(namaMakanan);
        this.setHargaMakanan(hargaMakanan);
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public String CetakMenu()
    {
        return ("Jenis makanan : " + super.getJenisMenu() + "\n" +
                "Nama makanan : " + this.getNamaMakanan() + "\n" +
                "Harga makanan : " + this.getHargaMakanan());
    }
}
