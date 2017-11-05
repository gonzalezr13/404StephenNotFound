package cs.ecu.edu.a404_of_a_kind;

/**
 * Created by Stephen on 10/29/2017.
 */

public enum Suit {

    CLUBS("c"),
    DIAMONDS("d"),
    HEARTS("h"),
    SPADES("s");

    private final String mName;

    Suit(String name){
        mName = name;
    }

    @Override
    public String toString(){
        return mName;
    }
}
