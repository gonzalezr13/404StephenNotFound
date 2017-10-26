package cs.ecu.edu.a404_of_a_kind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PokerBoardActivity extends AppCompatActivity {

    private ArrayList<Card> mCards;
    private ArrayList<Card> mPulledCards;
    private Random mRandom;

    ImageView deck, card1, card2, card3, card4, card5;

    ArrayList<Integer> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_poker_board);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        deck = (ImageView) findViewById(R.id.deck_back);
        card1 = (ImageView) findViewById(R.id.card1);
        card2 = (ImageView) findViewById(R.id.card2);
        card3 = (ImageView) findViewById(R.id.card3);
        card4 = (ImageView) findViewById(R.id.card4);
        card5 = (ImageView) findViewById(R.id.card5);

        card1.setVisibility(View.VISIBLE);
        card2.setVisibility(View.VISIBLE);
        card3.setVisibility(View.VISIBLE);
        card4.setVisibility(View.VISIBLE);
        card5.setVisibility(View.VISIBLE);

        for(int i=0;i<=52;i++){

        }

    }
}
