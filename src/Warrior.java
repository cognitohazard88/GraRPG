class Warrior extends Character{
    public Warrior(String name){
        super(name, 20, 20, 10, 10, 2, 10);
        this.characterClass = "Warrior";
        this.attackName = "Proste uderzenie";
        this.attackDescription = "Weź swój miecz i uderz go z furią wojownika!";
        this.specialAttackName = "Barbarzyński cios";
        this.specialAttackDescription = "Zbierając swojego feworu zbierasz siłę i uderzasz siłą która może przebić skały";
        maxStats();
    }

    public void attack(Character hero, Character enemy){
        int hero_damage = (int) Math.floor(hero.strength / 10);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " zadaje " + hero_damage + " obrażeń! " + enemy.name + " ma " + enemy.health + "punkty zdrowia!!");
    };

    public void specialAttack(Character hero, Character enemy){
        int hero_damage = (int) Math.floor(hero.strength / 10 + 3);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " zadaje " + hero_damage + " obrażeń! " + enemy.name + " ma " + enemy.health + "punkty zdrowia (special attack)!!");
    }
};