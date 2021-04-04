import java.util.ArrayList;

class L1{
    ArrayList<String>  Array = new ArrayList<String>();
    
    public void TambahArray(String i){
        Array.add(i);
    }
    
    public void HapusArray(String n){
        Array.remove(n);
    }  
}

class L2 extends L1{
    
    public void GantiArray(int x, String y){
    Array.set(x, y);
    }
    
    public void Cetak(){
    System.out.println(Array);
    }
        
}
public class Array_List{

    public static void main(String[] args) {

    L2 data = new L2();
    System.out.println("----- Isi Array -----");
    data.Cetak();
    System.out.println("----- Menambah Array ----");
    data.TambahArray("Soekarno");
    data.TambahArray("Supriyadi");
    data.TambahArray("Panjaitan");
    data.TambahArray("WR Supratman");
    data.TambahArray("Adi Sucipto");
    data.Cetak();
    data.HapusArray("Panjaitan");
    data.HapusArray("Adi Sucipto");
    System.out.println("----- Setelah Dihapus -----");
    data.Cetak();
    data.GantiArray(1, "Ahmad Yani");
    System.out.println("----- Setelah Diganti -----");
    data.Cetak();
    }
    
}
