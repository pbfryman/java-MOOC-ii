/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
public class Cat extends Animal {
    
    public Cat(String name) {
        super(name);
    }
    
    public Cat() {
        super("Cat");
    }
    
    @Override
    public void makeNoise() {
        purr();
    }
    
    public void purr() {
        System.out.println(getName() + " purrs");
    }
}
