class Mage extends Character{
    public Mage(String name){
        super(name, 20, 10, 10, 0, 1, 10);
        this.characterClass = "Mage";
        this.attackName = "Magiczny pocisk";
        this.attackDescription = "Twój podręczny czar, prosty i skuteczny!";
        this.specialAttackName = "Ognista kula";
        this.specialAttackDescription = "Zbierając myśli wysyłasz pocisk czystej energii";
        maxStats();
    }

    public void attack(Character hero, Character enemy){
        int hero_hitting_chance = intelligence;
        int hero_damage = (int) Math.floor(hero.intelligence / 10);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " does " + hero_damage + " damage! " + enemy.name + " is at " + enemy.health + "hp!!");
    };

    public void specialAttack(Character hero, Character enemy){
        int hero_hitting_chance = 100;
        int hero_damage = (int) Math.floor(hero.intelligence / 10 + 3);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " does " + hero_damage + " damage! " + enemy.name + " is at " + enemy.health + "hp with the special attack!!");
    };
};