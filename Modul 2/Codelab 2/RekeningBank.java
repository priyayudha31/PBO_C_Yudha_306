// Kelas RekeningBank
class RekeningBank {
    // Atribut
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Konstruktor untuk menginisialisasi atribut
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
    }

    // Method untuk setor uang (menambah saldo)
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Setoran: " + jumlah);
        tampilkanInfo(); // Menampilkan informasi setelah transaksi
    }

    // Method untuk tarik uang (mengurangi saldo jika cukup)
    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Penarikan: " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan sebesar: " + jumlah);
        }
        tampilkanInfo(); // Menampilkan informasi setelah transaksi
    }
}
