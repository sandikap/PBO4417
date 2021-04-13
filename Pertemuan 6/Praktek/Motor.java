public class Motor extends Kendaraan {
    int Mesin = 1;
    String PlatNomor = "H 7699 AGG";

    Motor() {

    }

    public Motor(int UkMesin, String LiPlate) {
        this.Mesin = UkMesin;
        this.PlatNomor = LiPlate;

    }

    public void Tes() {
        System.out.println(Mesin);
        System.out.println(PlatNomor);

    }

    public int getMesin() {
        return Mesin;
    }

    public String getPlatNomor() {
        return PlatNomor;
    }

}