import pkg.*;
public class starter{
    public static void main(String args[]) {
        EasyReader a= new EasyReader("words_alpha.txt");
        int f = (int)(Math.random()*1000);
        String c[] = new String[1000];
        for(int b=0; b<f; b++){
            c[b]= a.readLine();
        }
        GameState g = new GuessWordGame(c);
        GameDriver game = new GameDriver(g);
        game.play();
    }
}

