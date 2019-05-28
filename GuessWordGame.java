import pkg.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class GuessWordGame implements GameState{
    private boolean condition;
    Player win;
    private String[] c;
    private EasyReader input;
    private String line;
    
    public GuessWordGame(String[] a){
        c=a;
        win= new Player("user");
        input = new EasyReader();
        int rand = (int)(Math.random()*(a.length-1));
        String word= a[rand];
        System.out.println("there are " + word.length()+ " letters");
        MysteryWord c= new MysteryWord(word);
        condition = false;
        int count=1;
        while(!condition){
            System.out.println("attempt " +count);
            String inp = input.readWord();
//            System.out.println(inp);
            if(inp.length() !=word.length()){
                System.out.println("input not correct length");
            }
            else if(inp.equalsIgnoreCase(word)){
                System.out.println("good job");
                condition=true;
            } else{
                System.out.println(c.getHint(inp));
                
            }
            count++;
            
        }
    }
    
        public boolean isGameOver()
        {
            return condition;
        }
        
        public Player getWinner()
        {
            return win;
        }
        public Player getCurrentPlayer()
        {
            return win;
        }
        public ArrayList<String> getCurrentMoves()
        {
            ArrayList<String> moves= new ArrayList<String>(c.length);
            for(String a: c)
            {
                moves.add(a);
            }
            
            return moves;
        }
        public void makeMove(String next)
        {
            line=next;
            
        }
        public String toString()
        {
            String words="";
            for (int g=0;g<c.length;g++)
            {
                
                words+= c[g]+", ";
                
            }
            return "possible solutions: "+ words;
        }
}
