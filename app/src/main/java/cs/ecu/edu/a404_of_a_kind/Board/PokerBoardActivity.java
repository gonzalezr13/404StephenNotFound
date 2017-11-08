package cs.ecu.edu.a404_of_a_kind.Board;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.List;

import cs.ecu.edu.a404_of_a_kind.Card;
import cs.ecu.edu.a404_of_a_kind.Deck;
import cs.ecu.edu.a404_of_a_kind.R;

public class PokerBoardActivity extends AppCompatActivity {

    private List<Card> mCards;
    private ImageView mDeck, mCard1, mCard2, mCard3, mTurn, mRiver;
    private boolean mIsFinish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_poker_board);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mIsFinish = false;

        Deck deck = Deck.getDeck();
        mDeck = (ImageView) findViewById(R.id.deck_back);
        mCard1 = (ImageView) findViewById(R.id.card1);
        mCard2 = (ImageView) findViewById(R.id.card2);
        mCard3 = (ImageView) findViewById(R.id.card3);
        mTurn = (ImageView) findViewById(R.id.card4);
        mRiver = (ImageView) findViewById(R.id.card5);

        mDeck.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mCard1.setImageResource(Deck.drawCard().getDrawable());
                Deck.dealCard();
                mCard2.setImageResource(Deck.drawCard().getDrawable());
                Deck.dealCard();
                mCard3.setImageResource(Deck.drawCard().getDrawable());
                Deck.dealCard();
            }
        });

    }

//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState){
//        View v = inflater.inflate(R.layout.activity_poker_board, container);
//
//
//        return v;
//    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }
}
