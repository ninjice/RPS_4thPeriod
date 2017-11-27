

public interface Player
{
    /**
     * If cpu = true, randomly generate
     * If cpu = false, ask user for input
     */
    public String pick(boolean cpu);
    
    
    public void setName(String n);
    
}
