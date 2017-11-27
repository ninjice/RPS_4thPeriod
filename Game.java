

public interface Game
{
    /**
     * 1 is p1 win
     * -1 is p2 win
     * 0 is a tie
     */
    public int win(Player p1, Player p2);
    
    public boolean end();
    
    public void updateScore(Player p);
    
    public int howManyPlayers();
}
