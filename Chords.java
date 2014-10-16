import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Ronan Kenny
 * @version 2.0 25/11/2013
 * This class contains an array containing the .png images of the chords
 */
public class Chords extends Actor
{
    private int index;
    
    String[] images = { "A_Major.png", "A_Minor.png", "A#_Major.png", "A#_Minor.png", "B_Major.png", "B_Minor.png", 
    "C_Major.png", "C_Minor.png", "C#_Major.png", "C#_Minor.png", "D_Major.png", "D_Minor.png", "D#_Major.png", 
    "D#_Minor.png", "E_Major.png", "E_Minor.png", "F_Major.png", "F_Minor.png", "F#_Major.png", "F#_Minor.png", 
    "G_Major.png", "G_Minor.png", "G#_Major.png", "G#_Minor.png"};
    
    /**
     * @param  index tracks the array index for the image needed
     * returns the image by its array index from the ShowChord class 
     */
    public Chords(int index)
    {
        this.index = index;
        setImage(new GreenfootImage(images[index]));
    } 
}
