import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Ronan Kenny 
 * @version 2.0 25/11/2013 
 * This class extends ShowChord and checks for the true or false reading of Flat to determine the output
 *      and let the final value get accessed by ShowChord
 */
public class Flat extends ShowChord
{
    /**
     * ImageReader is read by its boolean value by ShowChord
     * returns the selected or not selected image to the GUI
     * returns the boolean value of Flat to ShowChord for analysis in the if statements
     */
    public static int clicked = 0;
    public static boolean ImageReader = false;
    
    public void act() 
    {  
        /** 
         * Here the ImageReader is used to decide between normal image or selected image
         */
        if(ImageReader == false)
        {
            GreenfootImage img = new GreenfootImage("Flat.png");
            setImage(img);
        }
        else if(ImageReader == true)
        {
            GreenfootImage img = new GreenfootImage("FlatSelected.png");
            setImage(img);
        }
        /** 
         * Here the int clicked is used to change the ImageReader boolean value
         */
        if (Greenfoot.mouseClicked(this) && (clicked % 2 == 0)) 
        {
            ImageReader = true;
            Sharp.ImageReader = false;
            clicked++;
            Sharp.clicked = 0;
        }  
        else if (Greenfoot.mouseClicked(this) && (clicked % 2 != 0)) 
        {
            ImageReader = false;
            clicked++;
            Sharp.clicked = 0;
        } 
    }   
} 

