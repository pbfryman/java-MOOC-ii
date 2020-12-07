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

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicles;
    
    public VehicleRegistry() {
        this.vehicles = new HashMap<>();
        
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!vehicles.containsKey(licensePlate)) {
            vehicles.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        if (vehicles.containsKey(licensePlate)) {
            return vehicles.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (vehicles.containsKey(licensePlate)) {
            vehicles.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate plate : vehicles.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> alreadyPrinted = new ArrayList<>();
        for (String owner : vehicles.values()) {
            if (!(alreadyPrinted.contains(owner))) {
                System.out.println(owner);
                alreadyPrinted.add(owner);
            }
        }
    }
}
