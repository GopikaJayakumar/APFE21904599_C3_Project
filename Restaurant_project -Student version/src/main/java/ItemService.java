import java.util.ArrayList;
import java.util.List;

public class ItemService {
    public ArrayList<Item> items = new ArrayList<>();

    public int selectAnItem(Item item) {
        items.add(item);
        return(getTotalItemPrice(items));
    }

    public int unselectAnItem(Item item) {
        items.remove(item);
        return(getTotalItemPrice(items));
    }

    public int getTotalItemPrice(ArrayList<Item> itemList) {
        int totalPrice = 0;
        for(Item item: itemList) {
            totalPrice = totalPrice + item.getPrice();
        }
        return totalPrice;
    }
}
