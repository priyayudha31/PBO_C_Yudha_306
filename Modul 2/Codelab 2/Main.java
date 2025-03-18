
// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas RekeningBank
        RekeningBank rekening1 = new RekeningBank("202110370311306", "Priya Yudha", 500000);
        RekeningBank rekening2 = new RekeningBank("202110370311328", "Muhammad Jibran", 300000);

        // Menampilkan informasi rekening sebelum transaksi
        System.out.println("Informasi Rekening 1:");
        rekening1.tampilkanInfo();
        System.out.println("\nInformasi Rekening 2:");
        rekening2.tampilkanInfo();

        // Melakukan transaksi pada rekening1
        System.out.println("\nTransaksi pada Rekening 1:");
        rekening1.setorUang(200000); // Menambah saldo
        rekening1.tarikUang(150000); // Mengurangi saldo

        // Melakukan transaksi pada rekening2
        System.out.println("\nTransaksi pada Rekening 2:");
        rekening2.setorUang(50000);  // Menambah saldo
        rekening2.tarikUang(350000); // Mengurangi saldo (tidak cukup)
    }
}
