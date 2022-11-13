package me.silvana.shoppList;

import java.util.ArrayList;

public class ItemList {
    private ArrayList<Item>items;

    private int currentId;

    public ItemList(){
        this.items = new ArrayList<>();
        this.currentId = 1;
    }

    public void addItem(Item item){
        items.add(item);
        item.setId(currentId++);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void updateItem(int id, int amount, String name){
        items.parallelStream().filter(item -> item.getId()== id).findFirst().ifPresent(item -> {
            if (name != null) item.setName(name);

          if( amount ==0){
              deleteItem(id);

          } else {
              item.setAmount(amount);

          }
        });

    }

     public void deleteItem(int id){
        items.parallelStream().filter(item ->  item.getId() == id).findFirst().ifPresent(items::remove);
     }
}
