/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
public class Container {
    private int amount;
    private int maxAmount;
    
    public Container() {
        this.amount = 0;
        this.maxAmount = 100;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            if (this.amount + amount > maxAmount) {
                this.amount = maxAmount;
            } else {
                this.amount += amount;
            }
        }
    }
    
    public void move(Container container, int amount) {
        if (amount > 0) {
            if (this.amount - amount < 0) {
                if (container.amount + this.amount > maxAmount) {
                    container.amount = maxAmount;
                } else {
                    container.amount += this.amount;
                }
                this.amount = 0;
            } else {
                this.amount -= amount;
                if (container.amount + amount > maxAmount) {
                    container.amount = maxAmount;
                } else {
                    container.amount += amount;
                }
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if (this.amount - amount < 0) {
                this.amount = 0;
            } else {
                this.amount -= amount;
            }
        }
    }
    
    public int contains() {
        return this.amount;
    }
    
    @Override
    public String toString() {
        return contains() + "/" + this.maxAmount;
    }
}
