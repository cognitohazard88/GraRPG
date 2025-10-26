import java.util.Scanner;

interface Attackable{
    public void attack();
    public void specialAttack();
    public void attackList();
};

class Fight{
    public void StartFight(Character enemy, Character hero, Scanner scan, Inventory inventory){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("fight!!!");
        int turn = 0;
        int heroHealth = hero.health;
        int enemyHealth = enemy.health;

        if (enemy.speed > hero.speed) {
            System.out.println(enemy.name + " goes first!");
            enemy.attack(enemyHealth, heroHealth, enemy, hero);//zabije sie
        } else {
            System.out.println(hero.name + " goes first!");
        };

        while (heroHealth > 0 && enemyHealth > 0) {
            while(turn == turn){
                System.out.println("what will " + hero.name + " do?");
                System.out.println("> attack [A]");
                System.out.println("> use item [I]");
                System.out.println("> view stats [S]");
                String x;
                x = scan.nextLine(); 
                if (x.equals("A")) {
                    attackList(scan, hero, enemy, heroHealth, enemyHealth, turn);
                } else if (x.equals("I")) {//sigh.
                    inventory.showItemList();//>____________________________>
                    System.out.println("Nothing here yet..");
                } else if (x.equals("S")) {
                    hero.showStats();
                } else {
                    System.out.println("Try again...");
                };
            };
            enemy.attack(enemyHealth, heroHealth, enemy, hero);//dupa...............................
        };

        if (hero.health == 0) {
            System.out.println("You're dead!! L");
        } else if (enemy.health == 0) {
            System.out.println("You win!! yayyyy");
        };
    };

    public void attackList(Scanner sc, Character character, Character enemy, int heroHealth, int enemyHealth, int turn){
        while(true){
            System.out.println("> use " + character.attackName + " [A]");
            System.out.println("> use " + character.specialAttackName + "(SPECIAL) [S]");
            System.out.println("> go back [Q]");
            String attack = sc.nextLine();
            if (attack.equals("A")) {
                character.attack(heroHealth, enemyHealth, character, enemy);
                break;
            } else if (attack.equals("S")) {
                if (turn >= 3) {
                    character.specialAttack(heroHealth, enemyHealth, character, enemy);
                    break;
                } else {
                    System.out.println("You can't use your special attack yet!!");
                };
            } else if (attack.equals("Q")) {
                break;
            };//ok
        };
    };
}
