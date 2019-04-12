import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{

    /**
     * Instance variable
     */

    //tracks whether is "piano key down" image has already been set or not
    private boolean isDown;
    
    
    //Track what key is being played AND what sound file to play
    private String key;
    private String sound;
    
    /**
     * Create a new key.
     * Constructor - it runs once when the Key object is created
     */
    public Key(String keyName, String soundFile)
    {
        // Key begins in the "up" position
        isDown = false;
        
        
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //When the key image is NOT already showing "down"
        //AND
        //the "g" key on the keyboard has been pressed
        if (! isDown && Greenfoot.isKeyDown("g"))
        {
            setImage("white-key-down.png");
            isDown = true;
            play();
        }

        if ( isDown == true && Greenfoot.isKeyDown("g") == false)
        {
            setImage("white-key.png");
            isDown= false;
        }
    }

    /**
     * Play the note of this key
     */
    public void play()
    {
        Greenfoot.playSound("3c.wav");
        Greenfoot.playSound("3e.wav");
        Greenfoot.playSound("3g.wav");
    }

}
