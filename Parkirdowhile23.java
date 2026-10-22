import java.util.Scanner;

public class Parkirdowhile23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Input jenis (1: mobil, 2: motor, 0: keluar): ");
            jenis = scanner.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Input durasi: ");
                durasi = scanner.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid!");
            }

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
    }
}