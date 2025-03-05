package codelab;

import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminLengkap;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminLengkap = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminLengkap = "Perempuan";
        } else {
            jenisKelaminLengkap = "Tidak Valid";
        }

        // Menampilkan output
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}