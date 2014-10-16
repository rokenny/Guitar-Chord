import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An Application that displays guitar chords in an image and also plays the sound of the chord.
 * 
 * @author Ronan Kenny 
 * @version 2.0 25/11/2013
 * This is the final and fully functional version of the application
 */
public class Guitar extends World
{
    /**
     * Creates the layout for the app
     * makeButton() runs the method to create the app
     */ 
    public Guitar()
    {    
        /**
         * Create a new world with 800 x 600 cells 
         * with a cell size of 1x1 pixels
         */
        super(800, 600, 1);
        makeButtons();
    }

    /**
     * Places the buttons on the app in the required coordinates
     * addObject()  Creates the buttons representing the actors.   
     */
    public void makeButtons()
    {
        addObject(new AMajor(),85, 175);
        addObject(new BMajor(),190, 175);
        addObject(new CMajor(),295, 175);
        addObject(new DMajor(),400, 175);
        addObject(new EMajor(),505, 175);
        addObject(new FMajor(),610, 175);
        addObject(new GMajor(),715, 175);
        addObject(new Sharp(),85, 250);
        addObject(new Flat(),190, 250);
        addObject(new minor(),135, 325);
        addObject(new App_Intro(),530, 400);
        addObject(new ShowChord(),135, 460);
    }
}
