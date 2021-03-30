public class gameCharacter{
    int PositionX = 20;
    int PositionY;
    double width;
    double height;
    int run;
    int x;

    gameCharacter(){

    }


    gameCharacter(double width, double height){
		this.width = width;
        this.height = height;
    }
    

    gameCharacter (double width, double height, int PositionX, int PositionY){
		this.width = width;
        this.height = height;
        this.PositionX = PositionX;
        this.PositionY = PositionY;

    }

    public void setDimensi(double width, double height){
		this.width = width;
        this.height = height;
    }
    }

    public void setPosition(int PositionX, int PositionY){
		this.PositionX = PositionX;
        this.PositionY = PositionY;
    }

    public double getWidth(){
        return this.width;
    
    public double getHeight(){
        return this.height;
    }

    public int getX(){
        return this.PositionX;
    }

    public int getY(){
        return this.PositionY;
    }

    public void run(){
        System.out.println(" \n The starting position of the Character: " + PositionX);
    }
    public void Run(int increment) {
        PositionX = PositionX + increment;
        System.out.println(" \n The current position of the Character: " + PositionX);
    }    
}