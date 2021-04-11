import Transportasi.Speda;
import Transportasi.BMW;

public class TransportasiTesting{
    public static void main(String[] args){
        Speda Jaw = new Speda();
        System.out.println("====== Speda BM ====== ");
        Jaw.JalanKanan();
        Jaw.JalanLurus();
        BMW Lal = new BMW();
        System.out.println("====== Menu Mobil ====== ");
        Lal.Menu();
    }
}