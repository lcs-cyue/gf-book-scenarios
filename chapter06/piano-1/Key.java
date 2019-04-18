import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{

    /**
     * Instance variable
     */

    //tracks whether is "piano key down" image has already been set or not
    // (isDown is a primitive data type - shows in red, type is lowercase)
    private boolean isDown;

    //Track what key is being played AND what sound file to play
    //key and sound areobject data types - shows in black, type i Capitalized)
    private String key;
    private String sound; 
    private boolean keyWhite;

    /**
     * Create a new key.
     * Constructor - it runs once when the Key object is created
     */
    public Key(String keyName, String soundFile, boolean isKeyWhite)
    {
        // Key begins in the "up" position
        isDown = false;

        //initialize the key ad sound instance variables
        key = keyName;
        sound = soundFile;
        keyWhite = isKeyWhite;
        
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //When the key image is NOT already showing "down"
        //AND
        //the "g" key on the keyboard has been pressed

        // {(! isDown && Greenfoot.isKeyDown(key))
        if (keyWhite == true)
        {
            setImage("white-key-down.png");
            isDown = true;
            play();


            setImage("white-key.png");
            isDown= false;
        }
        else
        {
            setImage("black-key-down.png");
            isDown = true;
            play();

            setImage("black-key.png");
            isDown= false;
        }
    }

    /**
     * Play the note of this key
     */
    public void play()
    {
        Greenfoot.playSound(sound + ".wav");
    }

}
