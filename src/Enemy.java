import java.util.Scanner;

class Enemy extends Character{
    public Enemy(String name){
        super(name, 0,0,0,0,0,0);
        this.characterClass = "Enemy";
    };

    public void attack(Character enemy, Character hero){
        int enemy_damage = (int) Math.floor(enemy.strength / 10);
        hero.setTempHealth(hero.tempHealth - enemy_damage);
        System.out.println(enemy.name+" zadał " + enemy_damage + " obrażeń! " + hero.name + " ma " + hero.tempHealth + "punkty zdrowia!!");
    };
};