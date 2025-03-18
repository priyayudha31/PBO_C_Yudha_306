public class Musuh extends KarakterGame {
    
    // Constructor dengan super()
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }
    
    // Override method serang
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        
        // Mengurangi 15 poin kesehatan target
        target.setKesehatan(target.getKesehatan() - 15);
        
        // Menampilkan kesehatan terbaru target
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}
