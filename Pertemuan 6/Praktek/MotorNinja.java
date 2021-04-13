public class MotorNinja extends Motor{
    int numGear = 0;

    MotorNinja(){

    }
    public void AturGearFoot(int nmGear){
        this.numGear = nmGear;
    }
    public int DapatGearFoot(){
        return numGear;
    }
    public void Cek() {
        System.out.println("Gear Sepeda Sekarang Yaitu : "+numGear);

    }
}