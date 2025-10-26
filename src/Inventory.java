import java.security.PublicKey;

class Inventory extends Item{
    Inventory(){};

    public void addItem(String name, String description){
        while(true) {
            int inventoryLength = currentInventory.length;

            for (int i = 0; i < inventoryLength; i++) {
                if (name.equals(currentInventory[i][0])) {
                    int amount = Integer.parseInt(currentInventory[i][2]) + 1;
                    currentInventory[i][2] = String.valueOf(amount);
                    break;
                };
            };

            String[] newItem = {name, description, "1"};
            currentInventory[inventoryLength] = newItem;
            break;
        };
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
    protected String amount;
    protected String description;
    protected String name;
    protected String[][] currentInventory;

    public void showItemList(){
        int inventoryLength = currentInventory.length;
        for(int i=0; i>inventoryLength; i++){
            if(currentInventory[i][2].equals("0") == false){
                System.out.println(currentInventory[i][1]);
            };
        };
    };

    public void showDescription(int x){
        System.out.println(currentInventory[x][2]);
    };

//    protected String[][] characters_inventory = {
//            {"","",""},
//            {"","",""},
//            {"","",""},
//            {"","",""},
//            {"","",""},
//            {"","",""}
//    };
}
