/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
public class Hideout<T> {
    private T hidden;
    
    public void putIntoHideout(T tohide) {
        this.hidden = tohide;
    }
    
    public T takeFromHideout() {
        if (this.hidden == null) {
            return null;
        }
        T value = this.hidden;
        this.hidden = null;
        return value;
    }
    
    public boolean isInHideout() {
        if (this.hidden != null) {
            return true;
        }
        return false;
    }
}
