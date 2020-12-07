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
import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;
    
    public Hand() {
        cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void sort() {
        Comparator<Card> comparator = Comparator.comparing(Card::getValue)
        .thenComparing(Card::getSuit);
        
        Collections.sort(cards, comparator);
    }
    
    public void print() {
        Iterator<Card> iterator = cards.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator.comparing(Card::getSuit)
                .thenComparing(Card::getValue);
        
        Collections.sort(cards, comparator);
    }
    
    @Override
    public int compareTo(Hand hand) {
        int handOne = 0;
        int handTwo = 0;
        
        for (Card card : cards) {
            handOne += card.getValue();
        }
        for (Card card : hand.cards) {
            handTwo += card.getValue();
        }
        
        if (handOne == handTwo) {
            return 0;
        } else if (handOne > handTwo) {
            return 1;
        } else {
            return -1;
        }
    }
}
