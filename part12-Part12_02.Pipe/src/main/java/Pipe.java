/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
import java.util.List;
import java.util.ArrayList;

public class Pipe<T> {
    private List<T> pipe;
    
    public Pipe() {
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        pipe.add(value);
    }
    
    public T takeFromPipe() {
        if (pipe.isEmpty()) {
            return null;
        }
        T value = pipe.get(0);
        pipe.remove(0);
        return value;
    }
    
    public boolean isInPipe() {
        if (pipe.isEmpty()) {
            return false;
        }
        return true;
    }
}
