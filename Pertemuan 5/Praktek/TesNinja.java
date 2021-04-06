public class TesNinja {
    public static void main(String[] args) {
        GasNinja kendaraan = new GasNinja();
        Brompton sepeda = new Brompton();
        MotorNinja motor = new MotorNinja(3, "H 171 NO");
    

        sepeda.ringBell();
		kendaraan.goStraight();
        kendaraan.turnRightt();
        motor.getSizeofEnggine();
		motor.getLicencePlate();
    }
}