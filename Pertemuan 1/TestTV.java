import java.io.*;
public class TestTV {
    int channel;
    int volumeLevel;
    boolean on;

    TestTV() {
    }

    void turnOn(boolean on){
        on = true;
    }
    void turnOff(boolean on){
        on = false;
    }
    void setChannel(int newChannel){
        channel = newChannel;
    }
    void setVolume(int NewVolumeLevel){
        volumeLevel = NewVolumeLevel;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
    void volumeUp(){
        ++volumeLevel;
    }
    void volumeDown(){
        --volumeLevel;
    }

    public static void main(String[] args) {
        TestTV tv1 = new TestTV();
        tv1.turnOn(true);
        tv1.setChannel(30);
        tv1.setVolume(3);

        TestTV tv2 = new TestTV();
        tv2.turnOn(true);
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.volumeUp();

        System.out.println("Tv1's Channel is "+ tv1.channel +" and Volume level is " + tv1.volumeLevel );
        System.out.println("Tv2's Channel is "+ tv2.channel +" and Volume level is " + tv2.volumeLevel );    


    }
}