/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;
/**
 *
 * @author Blake
 */
public class TemperatureSensor implements Sensor {
    private int temperature;
    private boolean on = false;
    
    @Override
    public boolean isOn() {
        return this.on;
    }
    
    @Override
    public void setOn() {
        this.on = true;
    }
    
    @Override
    public void setOff() {
        this.on = false;
    }
    
    @Override
    public int read() {
        if (this.on == false) {
            throw new IllegalStateException("Sensor is off");
        }
        return new Random().nextInt(30 + 1 + 30) - 30;
    }
}
