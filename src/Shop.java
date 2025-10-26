import java.util.Scanner;

public class Shop extends Item{
//    protected String[][] shop_items = {
//            {"1.Witamina d3k2","zwieszka siłe w walce", "cena: 2"},
//            {"2.Fentanyl","Zwiększa inteligęcje w walce", "cena: 2"},
//            {"3.Okulary","Zwiększają celnośc w walce", "cena: 2"},
//            {"4.Fursuit","Zwiększa zręczność w walce", "cena: 2"},
//            {"5.Piwko","Uzdrawia 1k6 życia", "cena: 2"},
//            {"6.Aleminium","Zwiększa pancerz 1k3 na turę", "cena: 2"}
//    };


    Shop(){
        this.currentInventory = new String[][]{
                {"Witamina d3k2","zwieszka siłe w walce", "2"}, //name, desc, price
                {"Fentanyl","Zwiększa inteligęcje w walce", "2"},
                {"Okulary","Zwiększają celnośc w walce", "2"},
                {"Fursuit","Zwiększa zręczność w walce", "2"},
                {"Piwko","Uzdrawia 1k6 życia", "2"},
                {"Aleminium","Zwiększa pancerz 1k3 na turę", "2"}
        };
    };

    public void showShop(Scanner sc){
        while(true){
            System.out.println("Witaj w moim sklepie! Czy chcesz zobaczyć moje oferty? (Tak/Nie)");
            String Question = sc.nextLine();
            if (Question.equals("Nie")) {
                System.out.println("Dowidzenia. Zapraszam ponownie!");
                break;
            } else if(Question.equals("Tak")){
                for(int i = 0; i < currentInventory.length; i++){
                    System.out.println(i + ". " + currentInventory[i][0] + "\t Cena: "+currentInventory[i][2]);
                };

                System.out.println("Co chcesz kupić?(1-6)");
                int Question1 = sc.nextInt();
                showDescription(Question1);
                System.out.println("Czy na pewno chcesz kupić "+ currentInventory[Question1][0]+"?");
            }
        };
    }
}
