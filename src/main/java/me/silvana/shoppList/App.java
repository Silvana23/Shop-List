package me.silvana.shoppList;

import java.util.Scanner;

public class App {
    private  final InputHandler inputHandler;
    private final Scanner sc;

    private final ItemList itemList;

    public App() {
        this.sc =  new Scanner(System.in);
        this.itemList = new ItemList();
        this.inputHandler = new InputHandler(sc, itemList);
    }

    public void start(){

     int option = 0;
     while (option != 5 ){
         showMenu();
         System.out.print("select an option: ");
         option = getUserInt(sc);

         inputHandler.handle(option);
        }

        sc.close();
    }

    private  void showMenu(){
        System.out.println("===SHOPP LIST v0.1.0 ===");
        System.out.println("\t1. CREATE ITEM");
        System.out.println("\t2.SHOW ITEMS");
        System.out.println("\t3.UPDATE ITEM");
        System.out.println("\t4.DELETE ITEM");
        System.out.println("\t5.EXIT");

    }
    private int getUserInt(Scanner sc){
        return  Integer.parseInt(sc.nextLine());

    }
}
