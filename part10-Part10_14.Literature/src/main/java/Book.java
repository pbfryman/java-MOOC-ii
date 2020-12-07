/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blake
 */
public class Book {
    private String title;
    private int age;
    
    public Book(String title, int age) {
        this.title = title;
        this.age = age;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getAge() {
        return this.age;
    }
    
    @Override
    public String toString() {
        return this.title + " (recommended for " + this.age + " year-olds or older)";
    }
}
