import java.util.*;

public class Tableau {
    static int numOfTableu = 0;
    int startingSize;
    ArrayList<Card> cardList = new ArrayList<>();

    public Tableau(){
        numOfTableu += 1;
        startingSize = numOfTableu;
    }

    public int getStartingSize() {
        return startingSize;
    }

    public void addCard(Card x) {
        cardList.add(x);
    }
    public String showCard(int i)
    {
        if (i < cardList.size())
        {
            return cardList.get(i).cardDisplay();
        }
        else{
            return "    ";
        }
    }
}
