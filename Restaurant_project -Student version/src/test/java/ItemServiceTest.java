import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class ItemServiceTest {

    ItemService itemService = new ItemService();
    Item item1;
    Item item2;

    @BeforeEach
    public void setup() {
        item1 = new Item("Chicken Lasagna", 220);
        item2 = new Item("Mixed Chicken Sizzler", 360);
    }

    // marking an item from menu should add the item to a selected items list and display the total price
    // unmarking an item from menu should remove the item from selected list and display the total price

    @Test
    public void marking_an_item_from_menu_should_add_the_item_to_a_selected_items_list_and_display_the_total_price() {
        itemService.selectAnItem(item1);
        itemService.selectAnItem(item2);

        Item item3 = new Item("Italian pizza", 249);
        int totalPrice = itemService.selectAnItem(item3);

        assertEquals(totalPrice, 829); // total items in the list is 2 and adding the 3rd item should increment the order total to 829
    }

    @Test
    public void ummarking_an_item_from_menu_should_remove_the_item_from_selected_items_list_and_display_the_total_price() {
        itemService.selectAnItem(item1);
        itemService.selectAnItem(item2);

        int totalPrice = itemService.unselectAnItem(item2);

        assertEquals(totalPrice, 220); // total items in the list is 2 and removing an item should decrement the order total to 220
    }
}