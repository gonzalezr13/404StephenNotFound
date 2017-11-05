package cs.ecu.edu.a404_of_a_kind.Board;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cs.ecu.edu.a404_of_a_kind.Card;

/**
 * Created by Stephen on 11/3/2017.
 */

public class BoardEntity implements Serializable {

    private long mId;
    private Card mCard1;
    private Card mCard2;
    private Card mCard3;
    private Card mTurn;
    private Card mRiver;

    public List<Card> getBoardCards(){
        List<Card> cards = new ArrayList<>();
        if(mCard1 != null){
            cards.add(mCard1);
            cards.add(mCard2);
            cards.add(mCard3);
        }
        if (mTurn != null){
            cards.add(mTurn);
        }
        if(mRiver != null){
            cards.add(mRiver);
        }

        return cards;
    }

    public long getId(){return mId;}
    public long setId(long id){ mId = id;return id;}

    public Card getCard1(){return mCard1;}
    public Card setCard1(Card card1){mCard1 = card1;return card1;}

    public Card getCard2(){return mCard2;}
    public Card setCard2(Card card2){mCard2 = card2;return card2;}

    public Card getCard3(){return mCard3;}
    public Card setCard3(Card card3){mCard3 = card3;return card3;}

    public Card getTurn(){return mTurn;}
    public Card setTurn(Card turn){mTurn = turn;return turn;}

    public Card getRiver(){return mRiver;}
    public Card setRiver(Card river){mRiver = river;return river;}

}
