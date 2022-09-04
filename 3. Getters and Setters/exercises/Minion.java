package exercises;

public class Minion {
    private String name;
  	private int eyes;
  	private String color;
  	private String master;
    public Minion(String name, int eyes, String color, String master) {
        this.name = name;
        this.eyes = eyes;
        this.color = color;
        this.master = master;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setEyes(int eyes){
        this.eyes = eyes;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMaster(String master){
        this.master = master;
    }
    //getters
    public String getName(){
        return name;
    }
    public int getEyes(){
        return eyes;
    }
    public String getColor(){
        return color;
    }
    public String getMaster(){
        return master;
    }

    public static void main(String[] args) {
        Minion stuart = new Minion("Stuart", 1, "yellow", "");
        Minion dave = new Minion("Dave", 2, "yellow", "");

        stuart.setMaster("T. Rex");
        dave.setMaster("Napoleon");



    }
}



