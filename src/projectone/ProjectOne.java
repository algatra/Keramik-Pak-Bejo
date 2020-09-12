package projectone;

/**
 *
 * @author alfarkhan
 */
public class ProjectOne {
    
    public static void main(String[] args) {

        Keramik A = new Keramik();
        A.kategori = "A";
        A.ukuran = 30*30;
        A.isi = 10;
        A.harga = 54000;
        A.hitungHarga();
        
        Keramik B = new Keramik();
        B.kategori = "B";
        B.ukuran = 40*40;
        B.isi = 5;
        B.harga = 65000;
        B.hitungHarga();
        
        Keramik C = new Keramik();
        C.kategori = "C";
        C.ukuran = 30*40;
        C.isi = 8;
        C.harga = 60000;
        C.hitungHarga();
    }
    
}
