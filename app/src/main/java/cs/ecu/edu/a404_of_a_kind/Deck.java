package cs.ecu.edu.a404_of_a_kind;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Stephen on 10/24/2017.
 */

public class Deck {
    private ArrayList<Card> mCards;
    private ArrayList<Card> mPulledCards;
    private Random mRandom;

    public Deck(){
        mRandom = new Random();
        mPulledCards = new ArrayList<Card>();
        mCards = new ArrayList<Card>(Card.Suits.values().length * Card.Ranks.values().length);
        reset();
    }

    public void reset(){
        mPulledCards.clear();
        mCards.clear();

        for (Card.Suits s : Card.Suits.values()){
            for (Card.Ranks r : Card.Ranks.values()){
                Card c = new Card(s, r);
                mCards.add(c);
            }
        }
    }
}
