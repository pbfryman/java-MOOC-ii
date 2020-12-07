/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> units;
    
    public StorageFacility() {
        this.units = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        units.putIfAbsent(unit, new ArrayList<>());
        this.units.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return units.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        if (units.containsKey(storageUnit)) {
            if (units.get(storageUnit).contains(item)) {
                units.get(storageUnit).remove(item);
            }
            if (units.get(storageUnit).isEmpty()) {
                units.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitList = new ArrayList<>();
        for (String unit : units.keySet()) {
            unitList.add(unit);
        }
        return unitList;
    }
}
