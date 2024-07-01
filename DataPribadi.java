public class DataPribadi {
    private String NIK;
    private String Nama;
    private String JK;
    private int Umur;
    private String Alamat;

    public DataPribadi(String NIK, String Nama, String JK, int Umur, String Alamat) {
        this.NIK = NIK;
        this.Nama = Nama;
        this.JK = JK;
        this.Umur = Umur;
        this.Alamat = Alamat;
    }

    public void tampilkan() {
        System.out.println("NIK\t\t: " + NIK);
        System.out.println("Nama\t\t: " + Nama);
        System.out.println("Jenis Kelamin\t: " + JK);
        System.out.println("Umur\t\t: " + Umur);
        System.out.println("Alamat\t\t: " + Alamat);
    }

    public static void main(String[] args) {
        DataPribadi dataPribadi1 = new DataPribadi("123321009", "Sehun", "Laki-Laki", 30, "Jl. Braga");
        dataPribadi1.tampilkan();
}
}