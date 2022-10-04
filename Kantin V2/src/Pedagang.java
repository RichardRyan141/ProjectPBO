public class Pedagang {
    private String namaPedagang;
    private String lokasiPedagang;

    public Pedagang(String nama, String lokasi)
    {
        this.setNamaPedagang(nama);
        this.setLokasiPedagang(lokasi);
    }

    public String getNamaPedagang() {
        return namaPedagang;
    }

    public void setNamaPedagang(String namaPedagang) {
        this.namaPedagang = namaPedagang;
    }

    public String getLokasiPedagang() {
        return lokasiPedagang;
    }

    public void setLokasiPedagang(String lokasiPedagang) {
        this.lokasiPedagang = lokasiPedagang;
    }

    public String InfoPedagang()
    {
        return ("Nama Pedagang : " + this.getNamaPedagang() + "\n" +
                "Lokasi Pedagang : " + this.getLokasiPedagang());
    }

}
