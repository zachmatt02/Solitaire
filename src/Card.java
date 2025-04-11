public class Card {
    int face;
    char suit;
    char colour;
    boolean visability = true;
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

    public String cardDisplay() {
        if (!visability )
        {
            return "Down";
        }
        if(face < 10)
        {
            return face + "  "+ suit;
        }
        else if (face == 10) {
            return face + " "+ suit;
        }
        else if (face == 11) {
            return  "J  "+ suit;
        }
        else if (face == 12) {
            return  "Q  "+ suit;
        }
        else if (face == 13) {
            return  "K  "+ suit;
        }
        return "Card not found";
    }

    public String toString() {
        return "Card{" +
                "face=" + face +
                ", suit=" + suit +
                ", colour=" + colour +
                ", visability=" + visability +
                '}';
    }

    public void setVisability(boolean var)
    {
        this.visability = var;
    }
}
