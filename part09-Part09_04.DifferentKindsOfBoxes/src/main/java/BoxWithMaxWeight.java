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

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (!(items.isEmpty())) {
            int weight = 0;
            for (Item value : items) {
                weight += value.getWeight();
            }
            if (weight + item.getWeight() <= capacity) {
                items.add(item);
            }
        } else {
            items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        }
        return false;
    }
}
