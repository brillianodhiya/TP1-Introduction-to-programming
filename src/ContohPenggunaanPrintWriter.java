import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class ContohPenggunaanPrintWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama file: ");
        String namaFile = scanner.nextLine();

        try {
            PrintWriter output = new PrintWriter(new File(namaFile));
            System.out.print("Masukkan teks yang ingin disimpan di file: ");
            String teks = scanner.nextLine();
            output.println(teks);
            System.out.println("Teks berhasil disimpan di file " + namaFile);
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File " + namaFile + " tidak ditemukan.");
        }
    }
}
