public class TestingApp {
    public static void main(String[] args){
    gameCharacter Hero = new gameCharacter();
    Hero.setDimensi(12,12);
    Hero.setPosition(10,220);
    System.out.println("Posisi Character: "+ Hero.getX()+","+Hero.getY());
    Hero.Run(12);
    System.out.println("Posisi Character: "+ Hero.getX()+","+Hero.getY());

    gameCharacter Hero2 = new gameCharacter();
    Hero2.setDimensi(12,32);
    Hero2.setPosition(10,10);


    gameStickMan mon = new gameStickMan();
    mon.setDimensi(12,32);
    mon.setPosition(10,10);

    gameEnvironment sce = new gameEnvironment();
    sce.addCharacter(Hero);
    sce.addCharacter(Hero);
    sce.addCharacter(Hero2);
    sce.getAllCharacters();
    sce.removeCharacter(Hero);
    sce.getAllCharacters();
    sce.addStickMan(mon);
    sce.Interaction();

    }
}