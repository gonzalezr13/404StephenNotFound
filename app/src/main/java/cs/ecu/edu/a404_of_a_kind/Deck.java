package cs.ecu.edu.a404_of_a_kind;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Stephen on 10/24/2017.
 */

public class Deck {
    private static List<Card> mCards;

    public Deck(){
        initDeck();
        Collections.shuffle(mCards);
        dealCard();
    }

    public Deck(List<Card> cards){
        mCards = cards;
    }

    public void initDeck(){
        mCards = new LinkedList<Card>();
        mCards.addAll(Arrays.asList(Card.values()));
    }

    public static Card dealCard(){
        return mCards.remove(0);
    }
    public List<Card> exportDeck(){
        return mCards;
    }
}
