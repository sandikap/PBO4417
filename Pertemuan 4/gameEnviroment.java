import java.util.ArrayList;

public class gameEnviroment{
    private double width;
    private double height;

    private ArrayList<gameCharacter>arrCharacter =
        new ArrayList<gameCharacter>();
    private ArrayList<gameStickMan>arrStickMan =
        new ArrayList<gameStickMan>();

    
    public gameEnviroment(){
    }
    public void addPlayer(gameCharacter player){
        arrPlayer.add(player);
    }
    public void removePlayer(gameCharacter player){
        arrPlayer.remove(player);
    }

    public void getAllPlayers(){
        System.out.println("All Characters :"+arrPlayer);
    }

    public void addEnemy(gameStickMan enemy){
        arrEnemy.add(enemy);
    }
    
    public void removeEnemy(gameStickMan enemy){
        arrEnemy.remove(enemy);
    }

    public void getAllEnemy(){
        System.out.println("All StickMan :"+arrStickMan);
    }

    public void Interaction(){
		if (arrCharacter==null||arrStickMan==null){
			System.out.println("Player or Enemy not set");
		}
		for(int i=0; i<arrPlayer.size(); i++){
			for(int j=0; j<arrStickMan.size();j++){
				if(arrPlayer.get(i).getY()!=arrStickMan.get(j).getY()){
					System.out.println("Player: "+arrPlayer.get(i)+" and Enemy: "+arrEnemy.get(j)+"not in same Y position");
				}
				if(EuclideanDistance(arrPlayer.get(i).getX(),arrPlayer.get(i).getY(),arrEnemy.get(j).getX(),arrEnemy.get(j).getY())<2){
					System.out.println("Player: "+arrPlayer.get(i)+" Attacked");
					System.out.println("Enemy: "+arrEnemy.get(j)+" loses");
					removeEnemy(arrEnemy.get(j));
				}
				else{
					System.out.println("==> Player "+arrPlayer.get(i));
					arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
					System.out.println("Current x position = 	"+arrPlayer.get(i).getX()+" <==");
				}
			}
		}
	}
    public static int EuclideanDistance(int x1, int y1, int x2, int y2){
	return (int)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    }


}