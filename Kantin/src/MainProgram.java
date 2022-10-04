import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama pedagang : ");
        String namaPedagang= in.nextLine();
        System.out.print("Lokasi pedagang : ");
        String lokasiPedagang = in.nextLine();
        Pedagang stan1 = new Pedagang(namaPedagang, lokasiPedagang);
        System.out.println(stan1.InfoPedagang());

        System.out.print("Jumlah jenis menu yang ada : ");
        int jumlahJenis = in.nextInt();
        ArrayList<Menu> menu = new ArrayList<Menu>(100000);
        ArrayList<Menu> makanan = new ArrayList<Menu>(1000000);
        int count=0;
        for (int x=0; x<jumlahJenis; x++)
        {
            String a = in.nextLine();
            System.out.print("Nama jenis menu : ");
            String jenisMenu = in.nextLine();
            menu.add(new Menu(jenisMenu));
            System.out.println(menu.get(x).getJenisMenu());
            System.out.print("Jumlah makanan dalam " + menu.get(x).getJenisMenu() + ": ");
            int jumlahMakanan = in.nextInt();
            for (int y=1; y<=jumlahMakanan; y++)
            {
                a = in.nextLine();
                System.out.print("Nama makanan : ");
                String namaMakanan = in.nextLine();
                System.out.print("Harga makanan : ");
                double hargaMakanan = in.nextDouble();
                makanan.add(new PilihanMenu(jenisMenu, namaMakanan, hargaMakanan));
                count++;
            }
        }
        System.out.println("Daftar Menu : ");
        for (int x=0; x<count; x++)
        {
            System.out.println(makanan.get(x).CetakMenu());
            System.out.println();
        }

        System.out.print("Jumlah transaksi : ");
        int jumlahStruk = in.nextInt();
        for (int x=1; x<=jumlahStruk; x++)
        {
            String a = in.nextLine();
            System.out.print("Harga Total : ");
            double hargaTotal = in.nextDouble();
            System.out.print("Uang yang diterima : ");
            double uangDiterima = in.nextDouble();
            Struk struk = new Struk(x,uangDiterima,hargaTotal);
            System.out.println(struk.CetakStruk());
            System.out.println();
        }
    }
}
