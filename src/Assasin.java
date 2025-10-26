class Assasin extends Character{
    public Assasin(String name){
        super(name,20, 20, 10, 10, 1, 10);
        this.characterClass = "Assasin";
        this.attackName = "Cios w plecy";
        this.attackDescription = "Twoi przeciwnicy nigdy na patrzą za plecy";
        this.specialAttackName = "Uderzenie z cieni";
        this.specialAttackDescription = "Twoi przeciwnicy nigdy nie zobaczą co ich uderzyło";
        maxStats();
    }

    public void attack(Character hero, Character enemy){
        int hero_damage = (int) Math.floor(hero.agility / 10);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " zadaje " + hero_damage + " obrażeń! " + enemy.name + " ma " + enemy.health + "punkty zdrowia!!");
    };

    public void specialAttack(Character hero, Character enemy){
        int hero_damage = (int) Math.floor(hero.agility / 10 + 3);
        enemy.setHealth(enemy.health - hero_damage);
        System.out.println(hero.name + " zadaje " + hero_damage + " obrażeń! " + enemy.name + " ma " + enemy.health + "punkty zdrowia (special attack)!!");
    }
};