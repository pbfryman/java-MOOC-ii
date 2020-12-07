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

public class Herd implements Movable {
    private ArrayList<Movable> list;
    
    public Herd() {
        this.list = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        list.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable object : list) {
            object.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Object object : list) {
            result += object.toString() + "\n";
        }
        return result;
    }
}
