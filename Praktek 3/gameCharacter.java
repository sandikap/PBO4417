public class gameCharacter{
    int PositionX = 20;
    int PositionY;
    double width;
    double height;
    int run;

    gameCharacter(){

    }


    gameCharacter(double width, double height){

    }
    

    gameCharacter (double width, double height, int PositionX, int PositionY){


    }

    public void setDimensi(double width, double height){

    }

    public void setPosition(int PositionX, int PositionY){

    }

    public double getWidth(){
        return 10.0;
    }
    
    public double getHeight(){
        return 10.0;
    }

    public int getX(){
        return 10;
    }

    public int getY(){
        return 10;
    }

    public void run(){
        System.out.println(" \n The starting position of the Character: " + PositionX);
    }
    public void Run(int increment) {
        PositionX = PositionX + increment;
        System.out.println(" \n The current position of the Character: " + PositionX);
    }    
}