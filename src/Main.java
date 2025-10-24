import java.util.Scanner;

void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] character = CharacterCreation(sc);
    if(character[1].equals("1")){
        Warrior x = new Warrior(character[0]);
        x.showStats();
    } else if(character[1].equals("2")){
        Mage x = new Mage(character[0]);
        x.showStats();
    } else if(character[1].equals("3")){
        Archer x = new Archer(character[0]);
        x.showStats();
    } else if(character[1].equals("4")){
        Assasin x = new Assasin(character[0]);
        x.showStats();
    } else {
        System.out.println("Wybrana zła klasa. Wybrano Warrior");
        Warrior x = new Warrior(character[0]);

        x.showStats();
    };
    sc.close();
};

public String[] CharacterCreation(Scanner sc){
    System.out.println("Witaj w kreatorze postaci!");
    System.out.println("Podaj imię twojej postaci");
    String name = sc.nextLine(); //:ppppp
    System.out.println("Wybierz klasę (Od 1 do 4)" +
            "\n 1. Warrior " +
            "\n 2. Mage " +
            "\n 3. Archer " +
            "\n 4. Assasin");
    String CharacterClass = sc.nextLine();
    String x[] = {name, CharacterClass};
    return x;
};
