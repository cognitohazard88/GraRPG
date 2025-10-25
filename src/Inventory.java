//public class Inventory extends Item{
//    String[] current_inventory_items;
//};

class Item{
    protected int amount;
    protected String description;
    protected String name;
    protected int price;

    protected String[][] possible_inventory_items = {
            {"Witamina d3k2","zwieszka siłe w walce"},
            {"Fentanyl","Zwiększa inteligęcje w walce"},
            {"Okulary","Zwiększają celnośc w walce"},
            {"Fursuit","Zwiększa zręczność w walce"},
            {"Piwko","Uzdrawia 1k6 życia"},
            {"Aleminium","Zwiększa pancerz 1k3 na turę"}
    };

    protected String[][] characters_inventory = {
            {"","",""},
            {"","",""},
            {"","",""},
            {"","",""},
            {"","",""},
            {"","",""}
    };

    Item(int amount, int x, int price){
        this.amount = amount;
        this.name = possible_inventory_items[x][0]; //
        this.description = possible_inventory_items[x][1];
        this.price = price;
    };
}
