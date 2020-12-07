
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        VehicleRegistry vehicleRegistry = new VehicleRegistry();
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        vehicleRegistry.add(li1, "Blake");
        vehicleRegistry.add(li2, "Julie");
        vehicleRegistry.add(li3, "Olive");
        
        vehicleRegistry.printOwners();
        System.out.println("------------");
        vehicleRegistry.printLicensePlates();
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
        
        
        // if the hasCode-method hasn't been overwritten, the owners won't be found 
    }
}
