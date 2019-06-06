import pkg.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Player

{
    private String name;
    
    public Player(String aName)
    {
        name= aName;
    }
    public String getName()
    {
        return name;
    }
    public String getNextMove(GameState state)
    {
        ArrayList<String> moves= state.getCurrentMoves();
        int game= (int)(Math.random()*(moves.size()-1));;
        String nmove= moves.get(game);
        return nmove;
    }
}
