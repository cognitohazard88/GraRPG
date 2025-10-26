import java.util.Scanner;

interface Attackable{
    public void attack();
    public void specialAttack();
};

class Fight{
    Ending ending = new Ending();
    int turn = 0;
    boolean yourTurn = true;


    public void StartFight(Character enemy, Character hero, Scanner scan, Inventory inventory){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("fight!!!");
        yourTurn = true;//AHHHHHHNIENEINEI
        
        hero.saveHealth();

        if (enemy.speed > hero.speed) {
            System.out.println(enemy.name + "zaczyna walke" );
            enemy.attack(enemy, hero);
        } else {
            System.out.println(hero.name + " zaczyna walke!");
        };

        while(hero.getTempHealth() > 0 && enemy.getHealth() > 0){
            while(yourTurn){
                System.out.println("Co zrobi " + hero.name + "?");
                System.out.println("> Zaatakuj [A]");
                System.out.println("> Użyj przedmiotu [I]");
                System.out.println("> Pokaż statystyki [S]");
                String x;
                x = scan.nextLine(); 
                if (x.equals("A")) {
                    attackList(scan, hero, enemy, this);
                } else if (x.equals("I")) {
                    inventory.chooseItem(hero, scan, this);
                } else if (x.equals("S")) {
                    hero.showStatsFight();
                };
            };
            if(enemy.getHealth() > 0){
                enemy.attack(enemy, hero);
                yourTurn = true;
            };
        };

        if (hero.getTempHealth() <= 0){
            System.out.println("Umarłeś!!");
            ending.Smierc();
            System.exit(0);
        } else if (enemy.getHealth() <= 0){
            System.out.println("Wygrałeś!!");
        };

        resetTurn();
    };

    public void attackList(Scanner sc, Character character, Character enemy, Fight battle){
        while(true){
            System.out.println("> Użyj " + character.attackName + " [A]");
            System.out.println("> Użyj " + character.specialAttackName + "(SPECIAL) [S]");
            System.out.println("> Wróć [Q]");
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
                    System.out.println("Nie możesz jeszcze użyć specjalnego ataku!! ()");
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
