import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Ronan Kenny
 * @version 2.0 25/11/2013
 * This class contains the G Major image and swaps images when selected or de-selected
 */
public class GMajor extends ShowChord
{    
    public static int clicked = 0;
    public static boolean ImageReader = false;
    
    public void act() 
    {  
        /** 
         * Here the ImageReader is used to decide between normal image or selected image
         */
        if(ImageReader == false)
        {
            GreenfootImage img = new GreenfootImage("GMajor.png");
            setImage(img);
        }
        else if(ImageReader == true)
        {
            GreenfootImage img = new GreenfootImage("GSelected.png");
            setImage(img);
        }
        /** 
         * Here the int clicked is used to change the ImageReader boolean value. Also it sets all
         * other chord Imagereader values to false and Clicked values to 0 to return all the images
         * to the de-selected images.
         */
        if (Greenfoot.mouseClicked(this) && (clicked % 2 == 0)) 
        { 
            ImageReader = true;
            AMajor.ImageReader = false;
            BMajor.ImageReader = false;
            CMajor.ImageReader = false;
            DMajor.ImageReader = false;
            EMajor.ImageReader = false;
            FMajor.ImageReader = false;
            
            clicked++;
            AMajor.clicked = 0;
            BMajor.clicked = 0;
            CMajor.clicked = 0;
            DMajor.clicked = 0;
            EMajor.clicked = 0;
            FMajor.clicked = 0;
        }  
        else if (Greenfoot.mouseClicked(this) && (clicked % 2 != 0)) 
        {  
            ImageReader = false;
            clicked++;
            AMajor.clicked = 0;
            BMajor.clicked = 0;
            CMajor.clicked = 0;
            DMajor.clicked = 0;
            EMajor.clicked = 0;
            FMajor.clicked = 0; 
        } 
    }   
}