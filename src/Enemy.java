import java.util.Scanner;

class Enemy extends Character{
    public Enemy(String name){
        super(name, 0,0,0,0,0,0);
        this.characterClass = "Enemy";
    };

    public void enemyAttack(int enemyHealth, int heroHealth, Character enemy, Character hero) {
        int enemy_damage = (int) Math.floor(enemy.strength / 10);
        heroHealth -= enemy_damage;
        System.out.println("enemy does " + enemy_damage + " damage! " + hero.name + " is at " + hero.health + "hp!!");
    };//kurwa czy mige sie juz poddac idk
};
