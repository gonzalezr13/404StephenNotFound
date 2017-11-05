package cs.ecu.edu.a404_of_a_kind.Board;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.List;

import cs.ecu.edu.a404_of_a_kind.Card;
import cs.ecu.edu.a404_of_a_kind.R;

public class PokerBoardActivity extends AppCompatActivity {

    private List<Card> mCards;
    private Card mCard1, mCard2, mCard3, mTurn, mRiver;
    private boolean mIsFinish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_poker_board);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mIsFinish = false;

    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }
}
