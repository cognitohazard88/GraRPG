import java.util.Scanner;
//
interface Attackable{
   public void attack();
};
//
//class Enemy extends Character{
//    public Enemy(String name){
//        super(name, 0,0,0,0,0,0);
//    };
//
//    public void enemyAttack(Character enemy, Character hero) {
//        int enemy_damage = (int) Math.floor(enemy.strength / 10);
//        hero.health -= enemy_damage;
//        System.out.println("enemy does " + enemy_damage + " damage! " + hero.name + " is at " + hero.health + "hp!!");
//    };
//
//    public void StartFight(Character enemy, Character hero, Scanner scan) {
//        System.out.println("fight!!!");
//        if (enemy.speed > hero.speed) {
//            System.out.println(enemy.name + " goes first!");
//            enemyAttack(enemy, hero);
//        } else {
//            System.out.println(hero.name + " goes first!");
//        };
//
//        while(true){
//            System.out.println("what will " + hero.name + " do?");
//            System.out.println("> attack [A]");
//            System.out.println("> use item [I]");
//            System.out.println("> view stats [S]");
//            String x = scan.nextLine();
//            if (x == "A") {
//                hero.attack(); //???????/
//            } else if (x == "I") {
//
//            } else if (x == "S") {
//                hero.showStats();
//            } else {//?????????????????????????
//            };
//        }
//    };
//}