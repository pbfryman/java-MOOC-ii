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

public class IOU {
    private HashMap<String, Double> iou;
    
    public IOU() {
        this.iou = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        toWhom = cleanString(toWhom);
        iou.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        toWhom = cleanString(toWhom);
        for (String name : iou.keySet()) {
            if (name.contains(toWhom)) {
                return iou.get(name);
            }
        }
        return 0;
    }
    
    private String cleanString(String text) {
        text = text.toLowerCase();
        return text.trim();
    }
}
