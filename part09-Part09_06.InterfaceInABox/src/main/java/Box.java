/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        double totalWeight = weight();
        if (item.weight() + totalWeight <= capacity) {
            items.add(item);
        }
    }
    
    public void add(Box box) {
        double totalWeight = weight();
        if (box.weight() + totalWeight <= capacity) {
            items.add(box);
        }
    }
    
    public int numberOfItems() {
        int count = 0;
        for (Packable value : items) {
            count += 1;
        }
        return count;
    }
    
    public double weight() {
        double weight = 0;
        for (Packable value : items) {
            weight += value.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + numberOfItems() + " items, total weight " + weight() + " kg";
    }
}
