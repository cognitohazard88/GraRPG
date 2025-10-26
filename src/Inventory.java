import java.security.PublicKey;

class Inventory extends Item{
    Inventory(){
        super();
        this.amount = 0;
    };

    public void removeUsedItem(String name){
        while(true){
            for(int i = 0; i < currentInventory.length; i++){
                if(name.equals(currentInventory[i][0])){
                    int amount = Integer.parseInt(currentInventory[i][2]);
                    if (amount != 0){
                        amount--;
                        currentInventory[i][2] = String.valueOf(amount);
                    };
                    break;
                };
            };
            break;
        };
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
