class Archer extends Character{
    public Archer(String name){
        super(name, 20, 20, 10, 10, 1, 10);
        this.characterClass = "Archer";
        this.attackName = "Broń strzelecka";
        this.attackDescription = "Strzał z twojego łuku są ostre jak brzytwa";//juz istnieją
        this.specialAttackName = "Śmiercionośny strzał";
        this.specialAttackDescription = "Twoje strzały zawsze trafią w twój cel, zawsze w ich czuły punkt!";
        maxStats();
    }

    public void attack(Character enemy, Character hero){
        int hero_hitting_chance = accuracy;
        int hero_damage = (int) Math.floor(hero.accuracy / 10);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " does " + hero_damage + " damage! " + enemy.name + " is at " + enemy.health + "hp!!");
    };

    public void specialattack(Character hero, Character enemy, int turn){
        int hero_hitting_chance = 100;//hm
        int hero_damage = (int) Math.floor(hero.accuracy / 10 + 3);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " does " + hero_damage + " damage! " + enemy.name + " is at " + enemy.health + "hp!!");
    };


};