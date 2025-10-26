import java.util.Scanner;

class Enemy extends Character{
    public Enemy(String name){
        super(name, 0,0,0,0,0,0);//i mean nic sie nie dodaje
        this.characterClass = "Enemy";
    };

    public void attack(Character enemy, Character hero){
        int enemy_damage = (int) Math.floor(enemy.strength / 10);
        hero.setHealth(hero.health - enemy_damage);
        System.out.println(enemy.name+" does " + enemy_damage + " damage! " + hero.name + " is at " + hero.health + "hp!!");
    };
};

//class Boss extends Enemy{
//}