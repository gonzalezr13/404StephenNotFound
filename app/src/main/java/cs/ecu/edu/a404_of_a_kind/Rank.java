package cs.ecu.edu.a404_of_a_kind;

/**
 * Created by Stephen on 10/29/2017.
 */

public enum Rank {

    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("T"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private final String mName;

    Rank(String name){
        mName = name;
    }

    @Override
    public String toString(){
        return mName;
    }
}
