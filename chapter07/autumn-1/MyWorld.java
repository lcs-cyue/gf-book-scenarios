import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
        
        //Add 18 leaves object to the world
        //Start    keep going as long as this true   change by
        for(int i = 1; i <= 18; i += 1)
        {
            Leaf aLeaf = new Leaf();
            
            //Get a random location (use getWidth() instead of 600 to avoid a magic constant)
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            
            //Add the leaf object to the world
            addObject(aLeaf, x, y);
        }
    }
}
