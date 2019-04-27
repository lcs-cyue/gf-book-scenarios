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

        int position = frames / 60;
        //draw all the white notes on the screen
        for (int index = 0; index < whiteKeys.length; index +=1)
        {
            // Create a new Key object
            Key newKey = new Key(whiteKeys[index], whiteNotes[index], true);

            // Add the Key object to the scenario
            addObject(newKey, 54 + index * 63, 140);
        }

        for (int index = 0; index < blackKeys.length; index += 1)

        {
            if (blackKeys[index] != "" )
            {
                Key newKey = new Key(blackKeys[index], blackNotes[index], false);
                addObject(newKey, 85 + 63 * index, 86);
            }
        }

        //Only show a message when we are in the bounds of the array
        //showText("Array index is:" + position, 400, 250);

    }

    //Keep track of the frames
    //frames += 1;

    //Show current frame
    // showText("" + frames, 100, 100);

}



