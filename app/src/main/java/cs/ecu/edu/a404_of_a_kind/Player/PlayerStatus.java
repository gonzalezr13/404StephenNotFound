package cs.ecu.edu.a404_of_a_kind.Player;

import cs.ecu.edu.a404_of_a_kind.Card;

/**
 * Created by Stephen on 11/2/2017.
 */

public class PlayerStatus {
    private PlayerStatusType mStatus;
    private Card mCard1;
    private Card mCard2;
    private int mBet;
    private int mSmallBlind;
    private int mBigBlind;

    public PlayerStatus(){    }

    public void setStatus(PlayerStatusType mStatus) {
        this.mStatus = mStatus;
    }

    public void setCard1(Card mCard1) {
        this.mCard1 = mCard1;
    }

    public void setCard2(Card mCard2) {
        this.mCard2 = mCard2;
    }

    public void setBet(int mBet) {
        this.mBet = mBet;
    }

    public void setSmallBlind(int mSmallBlind) {
        this.mSmallBlind = mSmallBlind;
    }

    public void setBigBlind(int mBigBlind) {
        this.mBigBlind = mBigBlind;
    }


    public PlayerStatusType getStatus() {
        return mStatus;
    }

    public Card getCard1() {
        return mCard1;
    }

    public Card getCard2() {
        return mCard2;
    }

    public int getBet() {
        return mBet;
    }

    public int getSmallBlind() {
        return mSmallBlind;
    }

    public int getBigBlind() {
        return mBigBlind;
    }
}
