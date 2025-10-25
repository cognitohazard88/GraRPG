//class enemy {
//    protected String name; //bluh musi być protected a nie private bo takto np Mage nie może dostać sie do nich ok?
//    protected int strength;
//    protected int health;
//    protected int agility;//agility,
//    protected int speed;
//    protected int armor;
//
//    enemy(String name, int strength, int health, int agility, int armor) {
//        this.name = name;
//        this.strength = strength;
//        this.health = health;
//        this.agility = agility;
//        this.speed = (int) Math.floor(agility/10);
//        this.armor = armor;
//    }
//}
//
//class Enemystats extends enemy{
//    public Enemystats(String name, int strength, int health, int agility, int armor){
//        //int randomNum = (int)(Math.random() * 101); ????
//        super(name, strength, health, agility, armor);
//        //?!?!?!?
//    };
//
//    public void attack(){
//        //???????????????????????????????????????????????
//    }
//};

import java.util.Scanner;

class Enemy extends Character{
    public Enemy(String name){
        super(name, 0,0,0,0,0,0);
    };

    public void enemyAttack(Character enemy, Character hero) {
        int enemy_damage = (int) Math.floor(enemy.strength / 10);
        hero.health -= enemy_damage;
        System.out.println("enemy does " + enemy_damage + " damage! " + hero.name + " is at " + hero.health + "hp!!");
    };

    public void StartFight(Character enemy, Character hero, Scanner scan) {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("fight!!!");

        if (enemy.speed > hero.speed) {
            System.out.println(enemy.name + " goes first!");
            enemyAttack(enemy, hero);
        } else {
            System.out.println(hero.name + " goes first!");
        };
        while(hero.health > 0 && enemy.health > 0){
            while(true){
                System.out.println("what will " + hero.name + " do?");
                System.out.println("> attack [A]");
                System.out.println("> use item [I]");
                System.out.println("> view stats [S]");
                String x = scan.nextLine();
                if (x.equals("A")) {
                    hero.attack(); //???????/
                    break;
                } else if (x.equals("I")) {
                    System.out.println("Nothing here yet..");
                } else if (x.equals("S")) {
                    hero.showStats();
                } else {//?????????????????????????
                    System.out.println("Try again...");
                };
            };
            enemyAttack(enemy, hero);
        };

        if(hero.health == 0){
            System.out.println("You're dead!! L");
        }else if(enemy.health == 0){
            System.out.println("You win!! yayyyy");
        };
    };
}
