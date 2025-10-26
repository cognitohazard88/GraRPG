import java.util.Scanner;

class Inventory extends Item{
    Inventory(){
        super();
        this.amount = 0;
    };

    public void chooseItem(Character character, Scanner scan, Fight battle){
        showItemList();
        if(amount!=0){
            while(battle.yourTurn){
                System.out.println("Którego przedmiotu chcesz użyć? (Wpisz nazwe) (E - exit)");
                String x = scan.nextLine();
                if(x.equals("E")){
                    break;
                }else{
                    for(int i=0; i<currentInventory.length; i++){
                        if(x.equals(currentInventory[i][0])){
                            while(true){
                                System.out.println("> use item [U]\n> show description [D]\n> exit [E]");
                                String y = scan.nextLine();
                                if(y.equals("U")){
                                    while(true){
                                        System.out.println("Are you sure? (Y/N)");
                                        String a = scan.nextLine();
                                        if(a.equals("Y")){
                                            useItem(i, character);
                                            battle.addTurn();
                                            break;
                                        }else if(a.equals("N")) {
                                            break;
                                        };
                                    }
                                } else if (y.equals("D")){
                                    showDescription(i);
                                } else if (y.equals("E")){
                                    break;
                            };}
                        }
                    }
                }
            }
        }
    };

    public void useItem(int x, Character character){
        if(x == 0){
            character.setStrength(6);
        }else if(x==1){
            character.setIntelligence(6);
        }else if(x==2){
            character.setAccuracy(6);
        }else if(x==3){
            character.setAgility(6);
        }else if(x==4){
            character.setHealth(+10);
        }else if(x==5){
            character.setArmor(3);
        };

        System.out.println(currentInventory[x][0]+" został użyty.");
        removeUsedItem(x);
    };

    public void removeUsedItem(int x){
        int amount = Integer.parseInt(currentInventory[x][2]);
        amount--;
        currentInventory[x][2] = String.valueOf(amount);
    };
};

class Item{
    protected String name;
    protected int amount;
    protected String[][] currentInventory;

    Item(){
        this.currentInventory = new String[][]{
                {"Witamina d3k2","zwieszka siłe w walce","0"}, //name, desc, amount/price
                {"Fentanyl","Zwiększa inteligęcje w walce","0"},
                {"Okulary","Zwiększają celnośc w walce","0"},
                {"Fursuit","Zwiększa zręczność w walce","0"},
                {"Piwko","Uzdrawia 1k6 życia","0"},
                {"Aleminium","Zwiększa pancerz 1k3 na turę","0"}
        };
    }

    public void showItemList(){
        int inventoryLength = currentInventory.length;
        while(true){
            if (amount == 0){
                System.out.println("Nic tutaj nie ma!");
                break;
            };
            for (int i = 0; i < inventoryLength; i++){
                if (currentInventory[i][2].equals("0") == false) {
                    System.out.println("nazwa: " + currentInventory[i][0] + " ilość: " + currentInventory[i][2]);
                };
            };
            break;
        };
    };

    public void showDescription(int x){
        System.out.println("\""+currentInventory[x][1]+"\"");
    };

    public void addItem(String name, String description, Item inventory){
        while(true){
            int inventoryLength = inventory.currentInventory.length;

            for (int i = 0; i < inventoryLength; i++) {
                if(name.equals(inventory.currentInventory[i][0])) {
                    int itemAmount = Integer.parseInt(inventory.currentInventory[i][2]) + 1;
                    inventory.setAmount(String.valueOf(itemAmount), i);
                    break;
                };
            };
            break;
        };
    };

    public void setAmount(String itemAmount, int x){
        this.currentInventory[x][2] = itemAmount;
        this.amount++;
    };
}
