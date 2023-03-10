import java.util.Scanner;

public class RamalanCupu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++++\n");

        // input data user
        System.out.println("Data Anda :");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("Masukkan Nama Anda : ");
        String namaUser = input.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        int umurUser = input.nextInt();
        input.nextLine();

        // input data pasangan
        System.out.println("\nData Pasangan Anda :");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("Masukkan Nama Pasangan Anda : ");
        String namaPasangan = input.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda : ");
        int umurPasangan = input.nextInt();

        // tampilkan data user dan pasangan
        System.out.println("\n" + namaUser + " [" + umurUser + "] tahun\n");
        System.out.println("          ♥♥♥    ♥♥♥");
        System.out.println("         ♥♥♥♥♥,,♥♥♥♥♥");
        System.out.println("        ♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("         ♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("           ♥♥♥♥♥♥♥♥");
        System.out.println("             ♥♥♥♥");
        System.out.println("              ♥♥\n");
        System.out.println(namaPasangan + " [" + umurPasangan + "] tahun\n");


        // membersihkan line berikutnya
        input.nextLine();

        // tampilkan hasil ramalan
        System.out.println("Tekan ENTER untuk melihat hasil ramalan...");
        input.nextLine();

        // hitung hasil ramalan
        double kecocokan = Math.random() * 50 + 50; // hasil random antara 50 dan 100
        kecocokan /= 1.1; // hitung kecocokan dengan rumus

        System.out.printf("Kecocokan anda dengan pasangan anda adalah : %.2f %%\n", kecocokan);
        System.out.println("Terima Kasih karena anda telah menggunakan jasa Ramalan kami.. ^^v");
    }
}
