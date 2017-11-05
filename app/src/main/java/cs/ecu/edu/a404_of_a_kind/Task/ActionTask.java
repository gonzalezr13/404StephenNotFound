package cs.ecu.edu.a404_of_a_kind.Task;

import android.os.AsyncTask;

import cs.ecu.edu.a404_of_a_kind.Player.PlayerStatusHandler;

/**
 * Created by Stephen on 11/3/2017.
 */

public abstract class ActionTask extends AsyncTask<Void,Void,Boolean> {
    protected String mServerName;
    protected long mGameId;
    protected String mPlayerId;
    protected PlayerStatusHandler mPlayerHandler;

    public ActionTask(String serverName, long gameId, String playerId, PlayerStatusHandler playerHandler){
        mServerName = serverName;
        mGameId = gameId;
        mPlayerId = playerId;
        mPlayerHandler = playerHandler;
    }

    public void setPlayerHandler(PlayerStatusHandler playerHandler){
        mPlayerHandler = playerHandler;
    }

    @Override
    protected void onPostExecute(Boolean success){
        if(mPlayerHandler == null || this.isCancelled()){
            return;
        }
        mPlayerHandler.actionResponse(success);
    }
}
