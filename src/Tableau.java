import java.util.*;

public class Tableau {
    static int numOfTableu = 0;
    int startingSize;
    Stack<Card> cardStack = new Stack<>();
    ArrayList<Card> cardList = new ArrayList<>();

    public Tableau(){
        numOfTableu += 1;
        startingSize = numOfTableu;
    }

    public int getStartingSize() {
        return startingSize;
    }

    public void addCard(Card x) {
        if(x.visability)
        {
            cardList.add(x);
        }
        else{
            cardStack.add(x);
        }
    }
    public String showCard(int i)
    {
//        String x;
//        if (i < cardList.size() ){
//            x  = cardList.get(i).cardDisplay();
//        }
//        else
//        {
//            x = "";
//        }
        if (i < cardStack.size())
        {
            return cardStack.get(i).cardDisplay() ;
        }
        else if (i < (cardStack.size() + cardList.size())) {
            return cardList.get(i-cardStack.size()).cardDisplay();
        }

        return "    " ;

    }
//    public void check(){
//        System.out.println("HI" + cardList.toString());
//    }
}
