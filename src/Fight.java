import java.util.Scanner;

interface Attackable{
    public void attack();
    public void specialAttack();
    public void attackList();
};

class Fight{
    Ending ending = new Ending();
    int turn = 0;
    boolean yourTurn = true;

    public void StartFight(Character enemy, Character hero, Scanner scan, Inventory inventory){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("fight!!!");

        if (enemy.speed > hero.speed) {
            System.out.println(enemy.name + " goes first!" );
            enemy.attack(enemy, hero);
        } else {
            System.out.println(hero.name + " goes first!");
        };

        while(hero.getHealth() > 0 && enemy.getHealth() > 0){
            while(yourTurn){
                System.out.println("what will " + hero.name + " do?");
                System.out.println("> attack [A]");
                System.out.println("> use item [I]");
                System.out.println("> view stats [S]");
                String x;
                x = scan.nextLine(); 
                if (x.equals("A")) {
                    attackList(scan, hero, enemy, this);
                } else if (x.equals("I")) {
                    inventory.chooseItem(hero, scan, this);
                } else if (x.equals("S")) {
                    hero.showStats();
                } else {
                    System.out.println("Try again...");
                };
            };
            enemy.attack(enemy, hero);
            yourTurn = true;
        };

        if (hero.getHealth() <= 0){
            System.out.println("You're dead!! L");
            ending.Smierc();
        } else if (enemy.getHealth() <= 0){
            System.out.println("You win!! yayyyy");
        };
    };

    public void attackList(Scanner sc, Character character, Character enemy, Fight battle){
        while(true){
            System.out.println("> use " + character.attackName + " [A]");
            System.out.println("> use " + character.specialAttackName + "(SPECIAL) [S]");
            System.out.println("> go back [Q]");
            String attack = sc.nextLine();
            if (attack.equals("A")) {
                character.attack(character, enemy);
                battle.addTurn();
                break;
            } else if (attack.equals("S")) {
                if(turn >= 3){
                    character.specialAttack(character, enemy);
                    battle.resetTurn();
                    break;
                } else {
                    System.out.println("You can't use your special attack yet!!");
                };
            } else if (attack.equals("Q")) {
                break;
            };
        };
    };

    public void addTurn(){
        this.turn++;
        this.yourTurn = false;
    };

    public void resetTurn(){
        this.turn = 0;
        this.yourTurn = false;
    };
}
