// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Hewan
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Memanggil metode tampilkanInfo untuk kedua objek
        System.out.println("Informasi Hewan 1:");
        hewan1.tampilkanInfo();
        
        System.out.println("\nInformasi Hewan 2:");
        hewan2.tampilkanInfo();
    }
}