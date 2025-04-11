import java.util.*;
public class Deck {
    ArrayList<Card> list = new ArrayList<>();
    Stack<Card> stack = new Stack<>();


    public Deck(){
        Random rand = new Random();
        char[] suits = {'D', 'H', 'S', 'C'};

        for (char suit : suits) {
            for (int i = 1; i <= 13; i++) {
                list.add(new Card(i, suit));
            }
        }
        for(int i = 52; i > 0; i-- ){
            int r = rand.nextInt(i);
            stack.push(list.get(r));
            list.remove(r);

        }

    }

     public void displayDeck() {
         System.out.println(stack.size());
         for(int i = 1; i <= 52; i++)
        {
            System.out.println(i);
            Card card = stack.pop();
            System.out.println(card.toString());
        }

    }
    public Stack<Card> getStack(){
        return stack;
    }

}
