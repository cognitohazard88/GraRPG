class Archer extends Character{
    public Archer(String name){
        super(name, 20, 20, 10, 10, 1, 10);
        this.characterClass = "Archer";
        this.attackName = "Broń strzelecka";
        this.attackDescription = "Strzał z twojego łuku są ostre jak brzytwa";
        this.specialAttackName = "Śmiercionośny strzał";
        this.specialAttackDescription = "Twoje strzały zawsze trafią w twój cel, zawsze w ich czuły punkt!";
        maxStats();
    }

    public void attack(Character enemy, Character hero){
        int hero_damage = (int) Math.floor(hero.accuracy / 10);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " zadaje " + hero_damage + " obrażeń! " + enemy.name + " ma " + enemy.health + "punkty zdrowia!!");
    };

    public void specialAttack(Character hero, Character enemy){
        int hero_damage = (int) Math.floor(hero.accuracy / 10 + 3);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " zadaje " + hero_damage + " obrażeń! " + enemy.name + " ma " + enemy.health + "punkty zdrowia (special attack)!!");
    };
};