public class MysteryWord
{
    private String word;
    
    public MysteryWord(String word)
    {
        this.word = word;
    }
    
    public String getHint(String guess)
    {
        String hint = "";
        
        for(int i = 0; i < word.length(); i++)
        {
            String guessLetter = guess.substring(i, i + 1);
            if(word.substring(i, i + 1).equalsIgnoreCase(guessLetter)){
                hint += guessLetter;

            }
            else if(word.indexOf(guessLetter) != -1){
                hint += "+";
            }
            else{
                hint += "*";
            }
            }
        
        return hint;
    }
}
