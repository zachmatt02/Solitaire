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
        if (face == 1) {
            return  "A  "+ suit;
        }
        else if(face < 10)
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
        String word ="";
        switch (suit){
            case 'H':
            word = "Hearts";
            break;
            case 'C':
                word = "Clubs";
                break;
            case 'D':
                word = "Diamonds";
                break;
            case 'S':
                word = "Spades";
                break;
        }
        if (!visability )
        {
            return "Down";
        }
        if (face == 1) {
            return  "Ace  "+ word;
        }
        else if(face < 10)
        {
            return face + "  "+ word;
        }
        else if (face == 10) {
            return face + " "+ word;
        }
        else if (face == 11) {
            return  "Jack  "+ word;
        }
        else if (face == 12) {
            return  "Queen  "+ word;
        }
        else if (face == 13) {
            return  "King  "+ word;
        }
        return "Card not found";
    }

    public void setVisability(boolean var)
    {
        this.visability = var;
    }
}
