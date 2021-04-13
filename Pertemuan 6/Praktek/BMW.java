public class BMW extends Motor{
    boolean seatbelt = false;


    BMW(){

    }
    public void AturSeatBelt(int seatbelt){
        if(seatbelt == 1){
            this.seatbelt = true;
        }
        else{
            this.seatbelt = false;
        }
        
    }
    public boolean DapatSeatBelt(){
        return seatbelt;
    }

}