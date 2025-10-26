class Archer extends Character{
    public Archer(String name){
        super(name, 20, 20, 10, 10, 1, 10);
        this.characterClass = "Archer";
        this.specialAttackName = "Śmiercionośny strzał";
        this.specialAttackDescription = "Twoje strzały zawsze trafią w twój cel";
        maxStats();
    }

    public void attack(Character hero, Character enemy, int turn){
        //???????????????????????????????????????????????
        turn++;
    };

    public void specialattack(Character hero, Character enemy, int turn){
        turn++;
    };


};