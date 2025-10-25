import java.util.Scanner;

void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = InputName(sc);
    //Character character = new Character(name, 20, 20, 10, 10, 1, 10);
    //InputClass(sc, character);
    //Character warrior = (Character) character;
    //warrior.getClass();

    Character character1 = new Character();
    int characterClass = InputClass(sc);

    if(characterClass == 1){
        character1 = new Warrior(name);
    }else if(characterClass == 2){
        character1 = new Mage(name);
    }else if(characterClass == 3){
        character1 = new Archer(name);
    }else if(characterClass == 4){
        character1 = new Assasin(name);
    };

    character1.showStats();

    sc.close();
}; //you forget so easy u_uuu

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
