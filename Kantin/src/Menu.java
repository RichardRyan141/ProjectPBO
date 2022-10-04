public class Menu {
    private String jenisMenu;

    public String getJenisMenu() {
        return jenisMenu;
    }

    public void setJenisMenu(String jenisMenu) {
        this.jenisMenu = jenisMenu;
    }

    public Menu(String jenisMenu)
    {
        this.setJenisMenu(jenisMenu);
    }

    public String CetakMenu()
    {
        return("Jenis menu : " + this.getJenisMenu());
    }
}
