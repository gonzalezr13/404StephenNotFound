package cs.ecu.edu.a404_of_a_kind;

import static cs.ecu.edu.a404_of_a_kind.Rank.ACE;
import static cs.ecu.edu.a404_of_a_kind.Rank.EIGHT;
import static cs.ecu.edu.a404_of_a_kind.Rank.FIVE;
import static cs.ecu.edu.a404_of_a_kind.Rank.FOUR;
import static cs.ecu.edu.a404_of_a_kind.Rank.JACK;
import static cs.ecu.edu.a404_of_a_kind.Rank.KING;
import static cs.ecu.edu.a404_of_a_kind.Rank.NINE;
import static cs.ecu.edu.a404_of_a_kind.Rank.QUEEN;
import static cs.ecu.edu.a404_of_a_kind.Rank.SEVEN;
import static cs.ecu.edu.a404_of_a_kind.Rank.SIX;
import static cs.ecu.edu.a404_of_a_kind.Rank.TEN;
import static cs.ecu.edu.a404_of_a_kind.Rank.THREE;
import static cs.ecu.edu.a404_of_a_kind.Rank.TWO;
import static cs.ecu.edu.a404_of_a_kind.Suit.CLUBS;
import static cs.ecu.edu.a404_of_a_kind.Suit.DIAMONDS;
import static cs.ecu.edu.a404_of_a_kind.Suit.HEARTS;
import static cs.ecu.edu.a404_of_a_kind.Suit.SPADES;

/**
 * Created by Stephen on 10/24/2017.
 */
public enum Card {

    TWO_CLUBS(TWO, CLUBS, 1, "2c", R.drawable.clubs_two),
    THREE_CLUBS(THREE, CLUBS, 5, "3c", R.drawable.clubs_three),
    FOUR_CLUBS(FOUR, CLUBS, 9, "4c", R.drawable.clubs_four),
    FIVE_CLUBS(FIVE, CLUBS, 13, "5c", R.drawable.clubs_five),
    SIX_CLUBS(SIX, CLUBS, 17, "6c", R.drawable.clubs_six),
    SEVEN_CLUBS(SEVEN, CLUBS, 21, "7c", R.drawable.clubs_seven),
    EIGHT_CLUBS(EIGHT, CLUBS, 25, "8c", R.drawable.clubs_eight),
    NINE_CLUBS(NINE, CLUBS, 29, "9c", R.drawable.clubs_nine),
    TEN_CLUBS(TEN, CLUBS, 33, "Tc", R.drawable.clubs_ten),
    JACK_CLUBS(JACK, CLUBS, 37, "Jc", R.drawable.clubs_11),
    QUEEN_CLUBS(QUEEN, CLUBS, 41, "Qc", R.drawable.clubs_12),
    KING_CLUBS(KING, CLUBS, 45, "Kc", R.drawable.clubs_13),
    ACE_CLUBS(ACE, CLUBS, 49, "Ac", R.drawable.clubs_01),

    TWO_DIAMOND(TWO, DIAMONDS, 2, "2d", R.drawable.diamonds_two),
    THREE_DIAMOND(THREE, DIAMONDS, 6, "3d", R.drawable.diamonds_three),
    FOUR_DIAMOND(FOUR, DIAMONDS, 10, "4d", R.drawable.diamonds_four),
    FIVE_DIAMOND(FIVE, DIAMONDS, 14, "5d", R.drawable.diamonds_five),
    SIX_DIAMOND(SIX, DIAMONDS, 18, "6d", R.drawable.diamonds_six),
    SEVEN_DIAMOND(SEVEN, DIAMONDS, 22, "7d", R.drawable.diamonds_seven),
    EIGHT_DIAMOND(EIGHT, DIAMONDS, 26, "8d", R.drawable.diamonds_eight),
    NINE_DIAMOND(NINE, DIAMONDS, 30, "9d", R.drawable.diamonds_nine),
    TEN_DIAMOND(TEN, DIAMONDS, 34, "Td", R.drawable.diamonds_ten),
    JACK_DIAMOND(JACK, DIAMONDS, 38, "Jd", R.drawable.diamonds_11),
    QUEEN_DIAMOND(QUEEN, DIAMONDS, 42, "Qd", R.drawable.diamonds_12),
    KING_DIAMOND(KING, DIAMONDS, 46, "Kd", R.drawable.diamonds_13),
    ACE_DIAMOND(ACE, DIAMONDS, 50, "Ad", R.drawable.diamonds_01),

    TWO_HEARTS(TWO, HEARTS, 3, "2h", R.drawable.hearts_two),
    THREE_HEARTS(THREE, HEARTS, 7, "3h", R.drawable.hearts_three),
    FOUR_HEARTS(FOUR, HEARTS, 11, "4h", R.drawable.hearts_four),
    FIVE_HEARTS(FIVE, HEARTS, 15, "5h", R.drawable.hearts_five),
    SIX_HEARTS(SIX, HEARTS, 19, "6h", R.drawable.hearts_six),
    SEVEN_HEARTS(SEVEN, HEARTS, 23, "7h", R.drawable.hearts_seven),
    EIGHT_HEARTS(EIGHT, HEARTS, 27, "8h", R.drawable.hearts_eight),
    NINE_HEARTS(NINE, HEARTS, 31, "9h", R.drawable.hearts_nine),
    TEN_HEARTS(TEN, HEARTS, 35, "Th", R.drawable.hearts_ten),
    JACK_HEARTS(JACK, HEARTS, 39, "Jh", R.drawable.hearts_11),
    QUEEN_HEARTS(QUEEN, HEARTS, 43, "Qh", R.drawable.hearts_12),
    KING_HEARTS(KING, HEARTS, 47, "Kh", R.drawable.hearts_13),
    ACE_HEARTS(ACE, HEARTS, 51, "Ah", R.drawable.hearts_01),

    TWO_SPADES(TWO, SPADES, 4, "2s", R.drawable.spades_two),
    THREE_SPADES(THREE, SPADES, 8, "3s", R.drawable.spades_three),
    FOUR_SPADES(FOUR, SPADES, 12, "4s", R.drawable.spades_four),
    FIVE_SPADES(FIVE, SPADES, 16, "5s", R.drawable.spades_five),
    SIX_SPADES(SIX, SPADES, 20, "6s", R.drawable.spades_six),
    SEVEN_SPADES(SEVEN, SPADES, 24, "7s", R.drawable.spades_seven),
    EIGHT_SPADES(EIGHT, SPADES, 28, "8s", R.drawable.spades_eight),
    NINE_SPADES(NINE, SPADES, 32, "9s", R.drawable.spades_nine),
    TEN_SPADES(TEN, SPADES, 36, "Ts", R.drawable.spades_ten),
    JACK_SPADES(JACK, SPADES, 40, "Js", R.drawable.spades_11),
    QUEEN_SPADES(QUEEN, SPADES, 44, "Qs", R.drawable.spades_12),
    KING_SPADES(KING, SPADES, 48, "Ks", R.drawable.spades_13),
    ACE_SPADES(ACE, SPADES, 52, "As", R.drawable.spades_01);

    private final Rank mRanks;
    private final Suit mSuits;
    private int mEval;

    private String mId;
    private int mDrawable;

    Card( Rank rank, Suit suit, int eval, String id, int drawable){
        mRanks = rank;
        mSuits = suit;
        mEval = eval;
        mId = id;
        mDrawable = drawable;
    }

    public Rank getRanks(){return mRanks;}
    public Suit getSuits(){return mSuits;}
    public int getEval(){ return mEval;}

    @Override
    public String toString(){
        return mRanks.toString() + mSuits.toString();
    }

    public static Card getCardById(String id){
        for (Card c : Card.values()){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }

    public String getId(){
        return mId;
    }

    public int getDrawable(){
        return mDrawable;
    }
}
