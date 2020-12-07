/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Blake
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }
    
    @Override
    public void setOff() {
        while (true) {
            int num = new Random().nextInt(sensors.size());
            if (sensors.get(num).isOn()) {
                sensors.get(num).setOff();
                break;
            }
        }
    }
    
    @Override
    public int read() {
        if (!(isOn()) || sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        int count = 0;
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
            count++;
        }
        int avg = sum / count;
        readings.add(avg);
        return avg;
    }
}
