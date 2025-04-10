public class Card {
    int face;
    char suit;
    char colour;
    public Card(int face, char suit){
        this.face = face;
        this.suit = suit;
        if (suit == 'D' || suit =='H')
        {
            colour = 'R';
        }
        else {
            colour = 'B';
        }
    }
    public Card(){

    }

    @Override
    public String toString() {
        return "Card{" +
                "face=" + face +
                ", suit=" + suit +
                ", colour=" + colour +
                '}';
    }
}
