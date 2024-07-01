import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Honda = 0;
        int Yamaha = 0;
        int jawab = 1;

        while (jawab == 1) {
            tampilkanMenu();
            int kategori = scanner.nextInt();

            switch (kategori) {
                case 1:
                    Honda++;
                    break;
                case 2:
                    Yamaha++;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.print("Pilih Jenis Motor Lagi? (1=ya, 0=tidak): ");
            jawab = scanner.nextInt();
        }

        tampilkanHasil(Honda, Yamaha);
    }

    private static void tampilkanMenu() {
        System.out.println("Kategori Motor:");
        System.out.println("1. Honda");
        System.out.println("2. Yamaha");
        System.out.print("Masukkan Kategori Jenis Motor (1/2): ");
    }

    private static void tampilkanHasil(int Honda, int Yamaha) {
        System.out.println("\n\nData yang Dimasukkan:");
        System.out.println("Jumlah Motor Honda: " + Honda);
        System.out.println("Jumlah Motor Yamaha: " + Yamaha);
    }
}
