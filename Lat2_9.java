public class Lat2_9 {
    public static void main(String[] args) {
        int nilai1 = 10;
        int nilai2 = 20;

        int nilaiMaks = nilaiMaksMin(nilai1, nilai2);
        int nilaiMin = nilaiMaksMin(nilai1, nilai2);

        System.out.println("Nilai Maksimum: " + nilaiMaks);
        System.out.println("Nilai Minimum: " + nilaiMin);
    }

    public static int nilaiMaksMin(int nilai1, int nilai2) {
        if (nilai1 > nilai2) {
            return nilai1;
        } else {
            return nilai2;
	}
}
}