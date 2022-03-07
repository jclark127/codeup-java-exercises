package GroceryList;

public class ListItem {
    public String item;
    public String category;

    public ListItem(){
        item = "";
        category = "";
    }

    public ListItem(String item, String category) {
        this.item = item;
        this.category = category;

    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
