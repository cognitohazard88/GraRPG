import java.util.Scanner;

class Character{
    protected String name; //bluh musi być protected a nie private bo takto np Mage nie może dostać sie do nich ok?
    protected String characterClass;
    protected String attackName;
    protected String attackDescription;
    protected String specialAttackName;
    protected String specialAttackDescription;
    protected int level;
    protected int strength;
    protected int health;
    protected int agility;
    protected int accuracy;
    protected int intelligence;
    protected int speed;
    protected int armor;
    protected int gold;

    Character(){};

    Character(String name, int strength, int health, int agility, int accuracy, int armor, int intelligence) {
        basicRollStats();
        this.name = name;
        this.strength += strength;
        this.health += health;
        this.agility += agility;
        this.accuracy += accuracy;
        this.intelligence += intelligence;
        this.speed = (int)Math.floor(this.agility/10);
        this.armor += armor;
        level = 1;
    };

    public void showStats(){
        System.out.println("Character class: " + characterClass);
        System.out.println("Character's special attack: " + specialAttackName);
        System.out.println("Character's special attack description: " + specialAttackDescription);
        System.out.println("Level: " + level);
        System.out.println("Strength: " + strength);
        System.out.println("Accuracy: " + accuracy);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Health: " + health);
        System.out.println("Agility: " + agility);
        System.out.println("Speed: " + speed);
        System.out.println("Armor: " + armor);
        System.out.println("Gold: " + gold);
    };

    public void showStatsFight(){
        System.out.println("-----------------");
        System.out.println("Character's attack: " + attackName + "\tCharacter's attack description: " + attackDescription);
        System.out.println("Character's special attack: " + specialAttackName + "\tCharacter's special attack description: " + specialAttackDescription);
        System.out.println("Character class: " + characterClass + "\t Level: " + level);
        System.out.println("Strength: " + strength + "\t\t\t\t Accuracy: " + accuracy);
        System.out.println("Intelligence: " + intelligence + "\t\t\t Health: " + health);
        System.out.println("Agility: " + agility + "\t\t\t\t\t Speed: " + speed);
        System.out.println("Armor: " + armor + "\t\t\t\t\t Gold: " + gold);
        System.out.println("-----------------");
    };

    public void basicRollStats(){
        strength = Math.min(75, (int) (Math.random() * 101));
        health = 15 + (int) (Math.random() * 11);
        agility = Math.min(75, (int) (Math.random() * 101));
        accuracy = Math.min(75, (int) (Math.random() * 101));
        armor = 2;
        intelligence = Math.min(75, (int) (Math.random() * 101));
        gold = Math.min(200, (int) (Math.random() * 300));
    };

    public void maxStats(){
        if(strength > 75){
            this.strength = 75;
        }if(agility > 75){
            this.agility = 75;
        }if(accuracy > 75){
            this.accuracy = 75;
        }if(intelligence > 75){
            this.intelligence = 75;
        }
    };

    public void attack(Character hero, Character enemy){};

    public void specialAttack(Character hero, Character enemy){};

    public void setGold(int gold){
        this.gold = this.gold - gold;
    };

    public void setHealth(int health){
        this.health = health;
    };
    public void setStrength(int strength){
        this.strength += strength;
    };

    public void setIntelligence(int intelligence){
        this.intelligence += intelligence;
    };

    public void setAccuracy(int accuracy){
        this.accuracy += accuracy;
    };

    public void setAgility(int agility){
        this.agility += agility;
    };

    public void setArmor(int armor){
        this.armor += armor;
    };

    public int getHealth(){
        return health;
    };
};
