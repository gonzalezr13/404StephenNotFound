package cs.ecu.edu.a404_of_a_kind;

/**
 * Created by Stephen on 10/24/2017.
 */

public class Card {

    public enum Suits{
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS;
    }

    public enum Ranks{
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        JACK,
        QUEEN,
        KING,
        ACE;
    }

    private Ranks mRanks;
    private Suits mSuits;

    public Card(Suits suit, Ranks ranks){
        this.mSuits = suit;
        this.mRanks = ranks;
    }

    public Ranks getRanks(){return mRanks;}
    public Suits getSuits(){return mSuits;}
    public int geValues(){return mRanks.ordinal()+2;}

    @Override
    public boolean equals(Object o){
        return (o != null
                && o instanceof Card
                && ((Card) o).mRanks == mRanks
                && ((Card) o).mSuits == mSuits);
    }
}
