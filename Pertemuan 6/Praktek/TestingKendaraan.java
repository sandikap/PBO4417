public class TestingKendaraan {
    static void KendaraanMelaju(Kendaraan vehicle) {
        vehicle.JalanLurus();
    }

    public static void main(String[] args) {
        Sepeda Coba = new Sepeda();
        Motor MV1 = new Motor();
        MotorNinja COL = new MotorNinja();
        BMW Cek = new BMW();

        Coba.BunyiBell();
        KendaraanMelaju(Coba);

        MV1.Tes();
        KendaraanMelaju(MV1);

        COL.AturGearFoot(2);
        COL.Cek();
        KendaraanMelaju(COL);

        Cek.AturSeatBelt(1);
        System.out.println("Sabuk Sekarang Bernilai : "+ Cek.DapatSeatBelt());
        KendaraanMelaju(Cek);
        
        
    }
    
}