class Warrior extends Character{
    public Warrior(String name){
        super(name, 20, 20, 10, 10, 2, 10); //////
        this.characterClass = "Warrior";
        this.attackName = "Proste uderzenie";
        this.attackDescription = "Weź swój miecz i uderz go z furią wojownika!";
        //dont you give up nanana i wont give up nanana let me love youuuuuuuuu
        this.specialAttackName = "Barbarzyński cios";
        this.specialAttackDescription = "Zbierając swojego feworu zbierasz siłę i uderzasz siłą która może przebić skały";
        maxStats();
    }

    public void attack(Character hero, Character enemy){
        int hero_hitting_chance = strength;
        int hero_damage = (int) Math.floor(hero.strength / 10);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " does " + hero_damage + " damage! " + enemy.name + " is at " + enemy.health + "hp!!");
    };

    public void specialattack(Character hero, Character enemy){
        int hero_hitting_chance = 100;
        int hero_damage = (int) Math.floor(hero.strength / 10 + 3);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " does " + hero_damage + " damage! " + enemy.name + " is at " + enemy.health + "hp!!");
    }
};