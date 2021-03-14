public class BukuDemo {

    
    public static void main(String[] args) {
        Buku buku2 = new Buku("Pemrograman Java untuk Programmer" ,"R H Sianipar" ,
                "Informatika", 2015);
        buku2.cetakBuku();
        Buku buku3 = new Buku("Pemrograman Berorientasi Objek Menggunakan Java" ,"Adam Mukharil B" ,
                "Informatika", 2018);
        buku3.cetakBuku(); 
        
    }
    
}

class Buku{
    String judul;
    String pengarang;
    String Penerbit;
    private int tahun;
    
    Buku(){}
    
    Buku(String judul, String pengarang, String Penerbit, int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.Penerbit = Penerbit;
        this.tahun = tahun;
    }
    
    void cetakBuku(){
        System.out.println("============================");
        System.out.println("Judul		:" + this.judul);
        System.out.println("Pengarang	:" + this.pengarang);
        System.out.println("Penerbit 	:" + this.Penerbit);
        System.out.println("Tahun 		:" + this.tahun);
    }
}