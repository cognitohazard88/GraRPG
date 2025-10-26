class Warrior extends Character{
    public Warrior(String name){
        super(name, 20, 20, 10, 10, 2, 10); //////
        this.characterClass = "Warrior";
        this.specialAttackName = "Barbarzyński cios";
        this.specialAttackDescription = "Zbierając swojego feworu zbierasz siłę i uderzasz siłą która może przebić skały";
        maxStats();
    }

    public void attack(){
        //???????????????????????????????????????????????
    };

    public void specialattack(){

    }
};