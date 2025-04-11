import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Tableau[] tableau = new Tableau[7];
        Stack<Card> stockStack = deck.getStack();
        Stack<Card> wasteStack = new Stack<>();



        //deck.displayDeck();
        for(int i = 0; i < 7; i++)
        {
            tableau[i] = new Tableau();
            for (int j = 0 ; j <  i; j++ )
            {
                Card topCard = stockStack.pop();
                topCard.setVisability(false);
                tableau[i].addCard(topCard);
            }

            tableau[i].addCard(stockStack.pop());
        }
        for(int i = 6; i >= 0 ; i--)
        {
            for(int j = 0;j < 7; j++)
            {
                System.out.print(tableau[i].showCard(j) + "      ");
            }
            System.out.println();
        }

    }

}