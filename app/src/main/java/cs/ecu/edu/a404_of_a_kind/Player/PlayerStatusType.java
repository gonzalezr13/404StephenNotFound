package cs.ecu.edu.a404_of_a_kind.Player;

import cs.ecu.edu.a404_of_a_kind.R;

/**
 * Created by Stephen on 11/2/2017.
 */

public enum PlayerStatusType {
    NOT_STARTED(R.string.not_started),
    DEALING(R.string.dealing),
    WAITING(R.string.waiting),
    BETTING(R.string.betting),
    LOST(R.string.lost),
    WON(R.string.won),
    STAY_IN(R.string.stay_in),
    FOLD(R.string.fold);

    private int mDisplayString;

    private PlayerStatusType(int displayString){mDisplayString = displayString;}

    public int getStringResource(){return mDisplayString;}

}
