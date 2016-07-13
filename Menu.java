/**
 * Created by Arvind on 7/12/16.
 */
public class Menu {
    Item[] items;

    public Menu() {
        items = new Item[];
    }

    public Menu(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
