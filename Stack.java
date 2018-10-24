package practice7;
import java.util.ArrayDeque;
public class Stack {
    ArrayDeque<Integer> cardDeck;
    public void start(int[] cards) {
        cardDeck = new ArrayDeque<Integer>(cards.length);
        for(int i : cards) {
            cardDeck.push(i);
        }
    }
    
    public int getTop() {
        return cardDeck.getFirst();
    }
    
    public void addBottom(int last) {
        cardDeck.addLast(last);
    }
    
    public int removeTop() {
        return cardDeck.removeFirst();
    }
    
    public void show() {
        System.out.println(cardDeck.toString());
    }
    
    public boolean isEmpty() {
        return cardDeck.isEmpty();
    }
}
