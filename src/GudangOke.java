import java.text.DecimalFormat;
import java.util.Scanner;

public class GudangOke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        // Minta input Nama
        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();

        // Minta input data barang
        System.out.println("Stok Gudang Input Barang");
        System.out.println("#########################");
        System.out.println();
        System.out.println("Selamat Datang " + nama);

        System.out.print("Masukkan nama barang yang mau ditambah: ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan jumlah barang yang mau ditambah : ");
        int jumlahBarang = input.nextInt();

        System.out.print("Masukkan harga beli untuk barang tersebut: Rp. ");
        double hargaBeli = input.nextDouble();

        System.out.print("Masukkan harga jual untuk barang tersebut : Rp. ");
        double hargaJual = input.nextDouble();

        // Tampilkan rincian barang
        System.out.println();
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################");
        System.out.println();
        System.out.println("Nama Barang\t\t: " + namaBarang);
        System.out.println("Jumlah Barang\t: " + jumlahBarang);
        System.out.println("Harga Beli\t\t: Rp. " + df.format(hargaBeli));
        System.out.println("Harga Jual\t\t: Rp. " + df.format(hargaJual));
    }
}
