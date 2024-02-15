package edu.ucalgary.oop;

public class Supply {
    private String type;
    private int quantity;

    public String getType() {return this.type;}
    public int getQuantity() {return this.quantity;}

    public void setType(String type) {
        this.type = type;
        return;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        return;
    }

    public Supply(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }
}
