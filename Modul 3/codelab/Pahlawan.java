public class Pahlawan extends KarakterGame {
    
    // Constructor dengan super()
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }
    
    // Override method serang
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
        
        // Mengurangi 20 poin kesehatan target
        target.setKesehatan(target.getKesehatan() - 20);
        
        // Menampilkan kesehatan terbaru target
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}
