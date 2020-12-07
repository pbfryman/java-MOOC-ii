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

public class ChangeHistory {
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }
    
    public void add(double status) {
        changes.add(status);
    }
    
    public void clear() {
        changes.clear();
    }
    
    public double maxValue() {
        if (changes.isEmpty()) {
            return 0;
        }
        double max = changes.get(0);
        for (Double value : changes) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    
    public double minValue() {
        if (changes.isEmpty()) {
            return 0;
        }
        double min = changes.get(0);
        for (Double value : changes) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    
    public double average() {
        if (changes.isEmpty()) {
            return 0;
        }
        int count = 0;
        int sum = 0;
        for (Double value : changes) {
            sum += value;
            count++;
        }
        return (double)(sum) / (double)(count);
    }
    
    @Override
    public String toString() {
        return changes.toString();
    }
}
