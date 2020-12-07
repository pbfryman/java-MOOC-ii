/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;
    
    public Warehouse() {
        this.products = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product) {
        return this.products.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.stocks.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (!(this.stocks.containsKey(product))) {
            return false;
        }
        int stock = this.stocks.get(product);
        if (stock - 1 < 0) {
            return false;
        }
        stock -= 1;
        this.stocks.put(product, stock);
        return true;
    }
    
    public Set<String> products() {
        Set<String> productNames = products.keySet();
        return productNames;
    }
}
