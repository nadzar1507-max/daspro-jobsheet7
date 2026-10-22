import java.util.Scanner;

public class KafeDoWhile23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kopi, teh, roti;
        int hargakopi = 12000, hargateh = 7000, hargaroti = 20000;
        int totalharga;
        String namapelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namapelanggan = scanner.nextLine();

            if (namapelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = scanner.nextInt();

            System.out.print("Jumlah teh: ");
            teh = scanner.nextInt();

            System.out.print("Jumlah roti: ");
            roti = scanner.nextInt();

            totalharga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("Total yang harus dibayar: Rp " + totalharga);

            scanner.nextLine();

        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}