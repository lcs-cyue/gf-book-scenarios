import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instance variables (can be used anywhere below)
     */
    //Primitive data type (int)
    int frames;
    
    //Object data type...square brackets [] indicate an array (a list)
    //Data type:String, we want an array, and the name is "studentNames"
    String[] studentNames = {"Sarah", "Chelsea", "Jack", "Maxwell", "Gavin", "Minah", "Brandon",
          "Jeewoo", "Peter", "Justy"};

    public Piano() 
    {
        super(800, 340, 1);

        //Start tracking frames
        frames = 0;
        
    }

    /** 
     * Act - called repeatedly to create animation
     */
    public void act()
{
    //Keep track of the frames
        frames += 1;
        
    //Show current frame
    showText("" + frames, 100, 100);
}
}   
