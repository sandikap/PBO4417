public class MotorNinja {
    public int sizeofEnggine = 1;
    public String licencePlate = "H 1 IDN";
    
    public MotorNinja(){
    }
    
    public MotorNinja(int sizeofEnggine, String licencePlate){
        this.sizeofEnggine = sizeofEnggine;
        this.licencePlate = licencePlate;
    }
    
    public int getSizeofEnggine(){
        return sizeofEnggine;
    }
    
    public String getLicencePlate(){
        return licencePlate;
    
    }
}