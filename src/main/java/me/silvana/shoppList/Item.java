package me.silvana.shoppList;

public class Item {

    private int id;
    private int amount;
    private String name;

    public Item(int id, int amount, String name) {
        this.id = id;
        this.amount = amount;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "\t%d. %s | %d ".formatted(id, name , amount);
    }
}
