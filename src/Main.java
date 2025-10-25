import java.util.Scanner;

void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = InputName(sc);
    //Character character = new Character(name, 20, 20, 10, 10, 1, 10);
    //InputClass(sc, character);
    //Character warrior = (Character) character;
    //warrior.getClass();

    Object character1;
    character1 = InputClass(sc, name);
    System.out.println(character1.getClass());
    sc.close();
}; //you forget so easy u_uuu

public Object InputClass(Scanner sc, String name){
    Object newCharacter;
    while(true){
        System.out.println("Wybierz klasę (Od 1 do 4)" +
                "\n 1. Warrior " +
                "\n 2. Mage " +
                "\n 3. Archer " +
                "\n 4. Assasin");
        int characterClass = sc.nextInt();
        if (characterClass == 1) {
            newCharacter = new Warrior(name);
            break;
        } else if (characterClass == 2) {
            newCharacter = new Mage(name);
            break;
        } else if (characterClass == 3) {
            newCharacter = new Archer(name);
            break;
        } else if (characterClass == 4) {
            newCharacter = new Assasin(name);
            break;
        } else {
            System.out.println("Niepoprawna klasa");
        };
    };
    return newCharacter;
};

public String InputName(Scanner sc){
    System.out.println("Witaj w kreatorze postaci!");
    System.out.println("Podaj imię twojej postaci");
    String name = sc.nextLine();
    return name;
}
