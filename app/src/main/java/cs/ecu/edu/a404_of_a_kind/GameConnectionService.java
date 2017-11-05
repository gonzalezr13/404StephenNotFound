package cs.ecu.edu.a404_of_a_kind;

/**
 * Created by Stephen on 10/31/2017.
 *
 * use to manage states of the game
 * get deck through this
 */

public class GameConnectionService {
    public static GameConnectionService gameConnectionService;

    public static GameConnectionService getInstance(){
        if(gameConnectionService == null){
            gameConnectionService = new GameConnectionService();
        }
        return gameConnectionService;
    }
}
