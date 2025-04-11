import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Tableau[] tableau = new Tableau[7];
        Stack<Card> stockStack = deck.getStack();




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

            displaySolitaire(tableau, stockStack);


    }

    public static void displaySolitaire(Tableau[] tableau,Stack<Card> stockStack){
        Stack<Card> wasteStack = new Stack<>();
        while(true){
            Scanner scanner = new Scanner(System.in);
            int choice= 0;
            String topStackDisplay;
            if(stockStack.isEmpty())
            {
                topStackDisplay = "Empty";
            }
            else
            {
                topStackDisplay = stockStack.peek().toString();
            }

            System.out.println("Cards "+ stockStack.size() +  "    Pile :"+ topStackDisplay );
            for(int i = 6; i >= 0 ; i--)
            {
                for(int j = 0;j < 7; j++)
                {
                    System.out.print(tableau[i].showCard(j) + "      ");
                }
                System.out.println();
            }
            System.out.println("Select Action");
            choice = scanner.nextInt();
            if(choice == 1)
            {
                if (!stockStack.isEmpty())
                {
                    System.out.println("Drawing card");
                    Card card = stockStack.pop();
                    wasteStack.push(card);
                    System.out.println(wasteStack.size());

                }
                else
                {
                    stockStack = wasteStack;
                    wasteStack = new Stack<>();
                    System.out.println("pile reset");
                }

            }
            System.out.println();
        }

    }

}