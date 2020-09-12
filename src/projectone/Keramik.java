package projectone;

/**
 *
 * @author alfarkhan
 */
public class Keramik {
    int ukuran,isi,harga;
    String kategori;
    
    int hitungJumlah(){
        int jumlah = 1000000/this.ukuran;
        return jumlah;
        }
    
    int hitungBox(){
        int box = this.hitungJumlah()/this.isi;
        return box;
        }
    
    void hitungHarga(){
        int box = this.hitungBox();
        int total = box * this.harga;
        System.out.println("Membutuhkan Keramik "+this.kategori+" Sebanyak "+box+" Box Dengan Harga Total Rp"+total);
        }
}
