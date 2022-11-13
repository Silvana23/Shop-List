package me.silvana.shoppList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputHandler {
    private final Scanner sc;

    private  final ItemList itemList;

    public InputHandler(Scanner sc, ItemList itemList) {
        this.sc = sc;
        this.itemList = itemList;
    }

    public  void handle(int option){


        switch (option){

            case 1 -> {
                Item item = getInputAddItem(sc);
                itemList.addItem(item);
            }
            case 2 -> {
                System.out.println("=== Listing all Items");
                itemList.getItems().forEach(System.out::println);
            }
            case 3 ->{

                Item item = getInputUpdateItem(sc);
                itemList.updateItem(item.getId(),item.getAmount(), item.getName());

            }
            case 4 ->{
                int id = getInputDeleteItem(sc);
                itemList.deleteItem(id);
            }
            case 5 -> { }

            default -> System.err.println("not a valid option");
        }
    }

    private Item getInputAddItem (Scanner sc){
        String itemNameStr , itemAmoutStr;

        System.out.print("insert the new item name: ");
        itemNameStr = sc.nextLine();
        System.out.print("insert the new item Amonut :");
        itemAmoutStr = sc.nextLine();

        return new Item(0 , Integer.parseInt(itemAmoutStr), itemNameStr);
    }
 private Item getInputUpdateItem(Scanner sc){
        String itemIdStr , itemNameStr , itemAmoutStr;

        System.out.println("Insert the Item ID : ");
        itemIdStr =sc.nextLine();
     System.out.println("Insert the new name: ");
     itemNameStr = sc.nextLine();
     System.out.println("Insert the new Amount");
     itemAmoutStr = sc.nextLine();

     return new Item(
             Integer.parseInt(itemIdStr),
             Integer.parseInt(itemAmoutStr),
             itemNameStr
     );

 }
    private int getInputDeleteItem(Scanner sc){
        String itemIdStr;

        System.out.println("Insert the Item ID: ");
        itemIdStr = sc.nextLine();

        return Integer.parseInt(itemIdStr);
    }
}
