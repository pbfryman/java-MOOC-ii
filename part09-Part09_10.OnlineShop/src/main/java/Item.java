/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
public class Item {
    private String product;
    private int quantity;
    private int unitPrice;
    
    public Item(String product, int qty, int price) {
        this.product = product;
        this.quantity = qty;
        this.unitPrice = price;
    }
    
    public String getProduct() {
        return this.product;
    }
    
    public int price() {
        return this.unitPrice * this.quantity;
    }
    
    public void increaseQuantity() {
        this.quantity += 1;
    }
    
    public String toString() {
        return this.product + ": " + this.quantity;
    }
}
