// Kelas Hewan
class Hewan {
    // Atribut
    String Nama;
    String Jenis;
    String Suara;

    // Konstruktor untuk menginisialisasi atribut
    public Hewan(String Nama, String Jenis, String Suara) {
        this.Nama = Nama;
        this.Jenis = Jenis;
        this.Suara = Suara;
    }

    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis: " + Jenis);
        System.out.println("Suara: " + Suara);
    }
}


