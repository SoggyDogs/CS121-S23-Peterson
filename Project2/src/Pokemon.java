//Pokemon class contains instance variables that
//are set with getters and setters and have one constructor
//the displayPokemonStats() method simply calls every instance
//into one string called stats to be used later to display
//each pokemon's stats
public class Pokemon {
    private String name;
    private int hitPoints;
    private String move;
    private int movePower;
    private int attackSpeed;

    public Pokemon(String name, int hitPoints, String move, int movePower, int attackSpeed){
            this.name = name;
            this.hitPoints = hitPoints;
            this.move = move;
            this.movePower = movePower;
            this.attackSpeed = attackSpeed;
        }
        //getters and setters for instance variables
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    public String getMove(){
        return move;
    }
    public void setMove(String move){
        this.move = move;
    }
    public int getMovePower(){
        return movePower;
    }
    public void setMovePower(int movePower){
        this.movePower = movePower;
    }
    public int getAttackSpeed(){
        return attackSpeed;
    }
    public int setAttackSpeed(int attackSpeed){
        this.attackSpeed = attackSpeed;
        return attackSpeed;
    }
    //displayPokemonStats() method
    public String displayPokemonStats(){
        String stats = "Name: " + name + "\n" + "Hit Points: " + hitPoints + "\n" + "Move:" + move +
                "\n" + "Move Power" + movePower + "\n" + "Arrack Speed: " + attackSpeed + "\n";
        return stats;
    }
}
