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

    // Track the white keys and notes
    String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\"};
    String[] whiteNotes = {"3c", "3d","3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g"};
    String[] blackKeys = {"w", "e", "", "t", "y", "u", "", "o", "p", "", "]", ""};
    String[] blackNotes = {"3c#", "3d#","", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#", ""};
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
        //This block of code runs once a second until the end of the 
        //-whiteKey array

        // && is a Boolean AND
        //statement in the conditional run only when both conditions are true
        int position = frames / 60;
        //NOTE: whiteKey/length automatically returns the coreect number
        //-of values in the array (so that we won't run past the end)
        if ((frames % 60 == 0) && (position < 24 ))//blackKeys.length))
        {
            //Assemble the piano by creating each key one by one
            Key anotherWhiteKey = new Key(whiteKeys[position], whiteNotes[position],true);
            Key anotherBlackKey = new Key(blackKeys[position], blackNotes[position],false);
            //showText("Hello " + studentNames[ frames / 60 ], 400, 170);

            //This line actually adds the object to the Piano world
            //        OBJECT    Horitontal Position   Vertical position
            if (position < 12)
            {
                addObject(anotherWhiteKey, 54 + position * 63, 140);
            }

            if (blackKeys[position] != "" && (position > 12) && (position < 24))
            {
                addObject(anotherBlackKey, 85 + position * 63, 75);
            }

            //Only show a message when we are in the bounds of the array
            showText("Array indext is:" + position, 400, 250);

        }

        //Keep track of the frames
        frames += 1;

        //Show current frame
        showText("" + frames, 100, 100);

    }

}   
