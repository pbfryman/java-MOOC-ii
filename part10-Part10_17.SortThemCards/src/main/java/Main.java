

public class Main {

    public static void main(String[] args) {
        Card first = new Card(10,Suit.HEART);
        Card second = new Card(10,Suit.SPADE);
        System.out.println(first.compareTo(second));
    }
}
