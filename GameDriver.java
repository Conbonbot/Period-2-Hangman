

public class GameDriver{
    private GameState state;
    public GameDriver(GameState initial){
        state = initial;
    }
    public void play()
    {
        System.out.println("Initial state:" + state);
        while (!state.isGameOver()) {
            Player currPlayer = state.getCurrentPlayer();
            String currMove = currPlayer.getNextMove(state);
            System.out.println(currPlayer.getName() + ": " + currMove);
            state.makeMove(currMove);
        }
        Player winner = state.getWinner();
        if (winner != null) {
            System.out.println(winner.getName() + " wins");
        }
        else {
            System.out.println("Game ends in a draw");
        }
    }
    
}
