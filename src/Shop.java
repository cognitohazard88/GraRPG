import java.util.Scanner;

public class Shop extends Item{
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

    public void showShop(Scanner sc, Character c, Item inventory){
        int exit = 1;
        while(exit == 1){
            String Question = sc.nextLine();
            if (Question.equals("Nie")) {
                System.out.println("Dowidzenia. Zapraszam ponownie!");
                break;
            } else if(Question.equals("Tak")){
                while(true){
                    for(int i = 0; i < currentInventory.length; i++){
                        System.out.println(i+1 + ". " + currentInventory[i][0] + "\t Cena: "+currentInventory[i][2]+" gold");
                    };

                    System.out.println("Co chcesz kupić?(1-6) (0 - Exit) (7 - Inventory)");
                    int Question1 = sc.nextInt();
                    if(Question1 >=1 && Question1 <= 6){
                        Question1--;
                        while (true){
                            System.out.println(currentInventory[Question1][0] + "\n> show description [D]\n> buy item [B]");
                            String Question2 = sc.next();
                            if (Question2.equals("D")) {
                                showDescription(Question1);
                            } else if (Question2.equals("B")) {
                                System.out.println("Czy na pewno chcesz kupić " + currentInventory[Question1][0] + "? (Y/N)");
                                String Question3 = sc.next();
                                if (Question3.equals("Y")) {
                                    buyItem(currentInventory[Question1][0], currentInventory[Question1][1], currentInventory[Question1][2], c, inventory);
                                    break;
                                } else if (Question3.equals("N")) {
                                    System.out.println("Aw man :((");
                                    break;
                                };
                            };
                        };
                    } else if(Question1 == 0){
                        System.out.println("Dowidzenia. Zapraszam ponownie!");
                        exit = 0;
                        break;
                    } else if(Question1 == 7){
                        inventory.showItemList();
                    };
                };
            }
        };
    };

    public void buyItem(String name, String description, String price, Character c, Item inventory){
        int priceInt = Integer.parseInt(price);
        if(c.gold >= priceInt){
            inventory.addItem(name, description, inventory);
            c.setGold(priceInt);
            System.out.println("Dziękuję za zakupy!! (Twój gold: " + c.gold+")");
        }else{
            System.out.println("Nie masz tyle gold!!! :/ (Twój gold: " + c.gold+")");
        };
    };
}
