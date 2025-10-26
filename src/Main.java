import java.util.Scanner;

void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = InputName(sc);

    Lore lore = new Lore();
    Ending ending = new Ending();
    Shop shop = new Shop();
    Inventory inventory = new Inventory();
    Character character = new Character();
    Character characterClone = new Character();
    int characterClass = InputClass(sc);

    if(characterClass == 1){
        character = new Warrior(name);
    }else if(characterClass == 2){
        character = new Mage(name);
    }else if(characterClass == 3){
        character = new Archer(name);
    }else if(characterClass == 4){
        character = new Assasin(name);
    };

    character.showStats();
    //System.out.println(character1.getClass());

    //character1.showStatsFight();
    //Enemy enemy1 = new Enemy("enemy1");
    //enemy1.StartFight(enemy1, character1, sc);

    lore.Poczatek();
    shop.showShop(sc, character, inventory);
    lore.PoSklepiePoczatkowym();
    Enemy enemy1 = new Enemy("enemy1");
    Fight battle1 = new Fight();
    battle1.StartFight(enemy1, character, sc, inventory);


    sc.close();
};

public int InputClass(Scanner sc){
    int characterClass;
    while(true){
        System.out.println("Wybierz klasę (Od 1 do 4)" +
                "\n 1. Warrior " +
                "\n 2. Mage " +
                "\n 3. Archer " +
                "\n 4. Assasin");
        characterClass = sc.nextInt();
        if(characterClass > 0 && characterClass < 5){
            break;
        } else {
            System.out.println("Niepoprawna klasa");
        };
    };
    return characterClass;
};

public String InputName(Scanner sc){
    System.out.println("Witaj w kreatorze postaci!");
    System.out.println("Podaj imię twojej postaci");
    String name = sc.nextLine();
    return name;
}
