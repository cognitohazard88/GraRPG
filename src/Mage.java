class Mage extends Character{
    public Mage(String name){
        super(name, 20, 10, 10, 0, 1, 10);
        this.characterClass = "Mage";
        this.specialAttackName = "Magiczny pocisk";
        this.specialAttackDescription = "Zbierając myśli wysyłasz pocisk czystej energii";
        maxStats();
    }

    public void attack(){
        //???????????????????????????????????????????????
        // System.out.println(this.name + "uses");
    };

    public void specialattack(){

    }
};