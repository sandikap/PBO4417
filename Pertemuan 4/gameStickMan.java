public class gameStickMan{
    int PositionX ;
    int PositionY;
    double width;
    double height;
    int ruun;

    gameStickMan(){

    }


    public gameStickMan(double width, double height){
		this.width = width;
        this.height = height;
    }
    
    }
    

    public gameStickMan (double width, double height, int PositionX, int PositionY){
		this.width = width;
        this.height = height;
        this.PositionX = PositionX;
        this.PositionY = PositionY;

    }

    public void setDimensi(double width, double height){

    }

    public void setPosition(int PositionX, int PositionY){

    }

    public double getWidth(){
        return this.width;
    }
    
    public double getHeight(){
        return this.height;
    }

    public int getX(){
        return this.PositionX;
    }

    public int getY(){
        return this.PositionY;
    }

    public void ruun(){
        System.out.println(" \n StickMan is Ambush");
    }
  
}
   
