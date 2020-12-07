/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
import java.util.List;
import java.util.ArrayList;
public class ShoppingCart {
    private List<Item> cart;
    
    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }
    
    public void add(String product, int price) {
        for (Item item : cart) {
            if (item.getProduct().equals(product)) {
                item.increaseQuantity();
                return;
            }
        }
        cart.add(new Item(product, 1, price));
    }
    
    public int price() {
        int total = 0;
        for (Item value : cart) {
            total += value.price();
        }
        return total;
    }
    
    public void print() {
        for (Item value : cart) {
            System.out.println(value.toString());
        }
    }
}
