public class Main {
    public static void main(String[] args) {
        // Membuat tiga objek sesuai ketentuan
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);
        
        // Demonstrasi pertarungan
        System.out.println("=== DEMONSTRASI PERTARUNGAN ===");
        System.out.println("Status awal:");
        System.out.println(karakterUmum.getNama() + " - Kesehatan: " + karakterUmum.getKesehatan());
        System.out.println(brimstone.getNama() + " - Kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " - Kesehatan: " + viper.getKesehatan());
        
        System.out.println("\n--- Ronde 1 ---");
        brimstone.serang(viper);
        
        System.out.println("\n--- Ronde 2 ---");
        viper.serang(brimstone);
        
        System.out.println("\n--- Ronde 3 ---");
        karakterUmum.serang(viper);
        
        System.out.println("\n--- Ronde 4 ---");
        brimstone.serang(karakterUmum);
        
        System.out.println("\n--- Ronde 5 ---");
        viper.serang(karakterUmum);
        
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println(karakterUmum.getNama() + " - Kesehatan: " + karakterUmum.getKesehatan());
        System.out.println(brimstone.getNama() + " - Kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " - Kesehatan: " + viper.getKesehatan());
    }
}
