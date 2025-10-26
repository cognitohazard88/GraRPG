import java.util.Scanner;

void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = InputName(sc);

    Lore lore = new Lore();
    Ending ending = new Ending();
    Shop shop = new Shop();
    Inventory inventory = new Inventory();
    Character character = new Character();
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

    lore.Poczatek();
    shop.showShop(sc, character, inventory);
    lore.PoSklepiePoczatkowym();

    Enemy enemy1 = new Enemy("Szczuru");
    Fight battle1 = new Fight();
    battle1.StartFight(enemy1, character, sc, inventory);
    lore.PoPierwszejWalce();

    Enemy enemy2 = new Enemy("Księża");
    battle1.StartFight(enemy2, character, sc, inventory);
    lore.PoDrugiejWalce();
    Enemy enemy3 = new Enemy("Smok");
    battle1.StartFight(enemy3, character, sc, inventory);
    lore.PoTrzeciejWalce();
    Enemy enemy4 = new Enemy("Strażnicy więzienia");
    battle1.StartFight(enemy4, character, sc, inventory);
    if(characterClass == 4){
        ending.RatunekAssasin();
    } else {
        ending.Ratunek();
    }
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
