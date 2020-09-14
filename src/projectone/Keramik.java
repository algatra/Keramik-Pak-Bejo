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
        return box+1; // ditambah 1 karena untunk menutupi kekurangan keramik 
        }
    
    void hitungHarga(){
        int box = this.hitungBox();
        int total = this.hitungBox() * this.harga;
        System.out.println("Membutuhkan Keramik "+this.kategori+" Sebanyak "+box+" Box Dengan Harga Total Rp"+total);
        }
}
