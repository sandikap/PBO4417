public class TestTV {

    public static void main(String[] args) {

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1's channel is " + tv1.channel 
                + " and Volume Level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel 
                + " and Volume Level is " + tv2.volumeLevel);
        
        Manusia man1 = new Manusia();
        man1.nama = "Erick";
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        man1.beliTV(tvku);
        System.out.println(man1.cekTV());
        man1.jualSemuaTV(tvku);
        System.out.println(man1.cekTV());
    }
    
}

class TV{
    boolean on = true;
    int channel = 0;
    int volumeLevel = 0;
    
    void turnOn(){
    on = true;
    }
    
    void turnOff(){
    on = false;
    }
    
    void setChannel(int newChannel){
    channel = newChannel;
    }
    
    void setVolume(int newVolumeLevel){
    volumeLevel = newVolumeLevel;
    }
    
    void channelUp(){
    channel++;
    }
    
    void channelDown(){
    channel--;
    }
    
    void volumeUp(){
    volumeLevel++;
    }
    
    void volumeDown(){
    volumeLevel--;
    }
}

class Manusia{
    String nama = "noname";
    boolean punyaTv = false;
    
    Manusia(){
    }
    Manusia(String nama){
    }
    String namaSaya(){
        return nama;
    }
    
    void beliTV(TV tvku){
            punyaTv = true;
    }
    void jualSemuaTV(TV tvku){
        punyaTv = false;
    }
    boolean cekTV(){
       return punyaTv;
    }
    
}