import java.util.Scanner;

public class Shop extends Item{
    protected String[][] shopItems = {
            {"Witamina d3k2","zwieszka siłe w walce", "2"}, //name, desc, price
            {"Fentanyl","Zwiększa inteligęcje w walce", "2"},
            {"Okulary","Zwiększają celnośc w walce", "2"},
            {"Fursuit","Zwiększa zręczność w walce", "2"},
            {"Piwko","Uzdrawia 1k6 życia", "2"},
            {"Aleminium","Zwiększa pancerz 1k3 na turę", "2"}
    };

//    protected String[][] shop_items = {
//            {"1.Witamina d3k2","zwieszka siłe w walce", "cena: 2"},
//            {"2.Fentanyl","Zwiększa inteligęcje w walce", "cena: 2"},
//            {"3.Okulary","Zwiększają celnośc w walce", "cena: 2"},
//            {"4.Fursuit","Zwiększa zręczność w walce", "cena: 2"},
//            {"5.Piwko","Uzdrawia 1k6 życia", "cena: 2"},
//            {"6.Aleminium","Zwiększa pancerz 1k3 na turę", "cena: 2"}
//    };


    Shop(){
        super();
    }

    public void showShop(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Witaj w moim sklepie! Czy chcesz zobaczyć moje oferty?(Tak/Nie)");
        String Question = sc.nextLine();
        if(Question.equals("Nie")){
            System.out.println("Dowidzenia. Zapraszam ponownie!");
        } else if(Question.equals("Tak")){
            for(int i = 0; i < shopItems.length; i++){
                for(int j = 0; j < shopItems[i].length; j++){
                    System.out.println(shopItems[i][j]);
                };
            };

            System.out.println("Co chcesz kupić?(1-6)");
            int Question1 = sc.nextInt();
            if(Question1 == 1){
                
            }
        }
    }
}
