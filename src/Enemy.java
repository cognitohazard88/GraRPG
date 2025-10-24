class enemy {
    protected String name; //bluh musi być protected a nie private bo takto np Mage nie może dostać sie do nich ok?
    protected int strength;
    protected int health;
    protected int agility;//agility,
    protected int speed;
    protected int armor;

    enemy(String name, int strength, int health, int agility, int armor) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.agility = agility;
        this.speed = (int) Math.floor(agility/10);
        this.armor = armor;
    }
}

class Enemystats extends enemy{
    public Enemystats(String name, int strength, int health, int agility, int armor){
        //int randomNum = (int)(Math.random() * 101); ????
        super(name, strength, health, agility, armor);
        //?!?!?!?
    };

    public void attack(){
        //???????????????????????????????????????????????
    }
};

public class Enemy {


}
