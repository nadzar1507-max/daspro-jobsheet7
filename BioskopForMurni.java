import java.util.Scanner;

public class BioskopForMurni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaPerTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;

        System.out.print("Masukkan jumlah pelanggan yang dilayani hari ini: ");
        int jumlahPelanggan = scanner.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.print("Masukkan jumlah tiket untuk pelanggan ke-" + i + ": ");
            int tiket = scanner.nextInt();

            if (tiket < 0) {
                System.out.println("Input tidak valid (negatif). Transaksi diabaikan.");

                continue;
            }

            double diskon = 0;
            if (tiket > 10) {
                diskon = 0.15;
            } else if (tiket > 4) {
                diskon = 0.10;
            }

            double subtotal = tiket * hargaPerTiket;
            double totalHarga = subtotal - (subtotal * diskon);

            totalTiketTerjual += tiket;
            totalPendapatan += totalHarga;

            System.out.println("-> Total yang harus dibayar: Rp " + (int) totalHarga);
            System.out.println();
        }

        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan   : Rp " + (int) totalPendapatan);

    }
}