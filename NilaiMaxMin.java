import java.util.Scanner;
public class NilaiMaxMin {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int bil1, bil2;

        System.out.print("Masukkan Bilangan 1: ");
        bil1 = scanner.nextInt();
        System.out.print("Masukkan Bilangan 2: ");
        bil2 = scanner.nextInt();

        int nilaiMax = hitungNilaiMax(bil1, bil2);
        int nilaiMin = hitungNilaiMin(bil1, bil2);

        // Menampilkan hasil
        System.out.println("Nilai Maksimum: " + nilaiMax);
        System.out.println("Nilai Minimum: " + nilaiMin);
    }

    // Method untuk menghitung nilai maksimum
    public static int hitungNilaiMax(int bil1, int bil2) {
        if (bil1 > bil2) {
            return bil1;
        } else {
            return bil2;
        }
    }

    // Method untuk menghitung nilai minimum
    public static int hitungNilaiMin(int bil1, int bil2) {
        if (bil1 < bil2) {
            return bil1;
        } else {
            return bil2;
	}
}
}