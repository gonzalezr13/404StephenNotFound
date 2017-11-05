package cs.ecu.edu.a404_of_a_kind.Player;

/**
 * Created by Stephen on 11/3/2017.
 */

public interface PlayerStatusHandler {
    public void updatePlayerStatus(PlayerStatus playerStatus);

    public void actionResponse(boolean success);
}
