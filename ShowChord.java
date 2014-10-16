import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Ronan Kenny 
 * @version 2.0 25/11/2013
 * This class checks for the combination of buttons selected to determine the output
 */
public class ShowChord extends Actor
{
    /**
     * mouseClicked starts the if statements
     * 
     * ImageReader is a variable created in each chord, sharp, flat and minor
     * to determine the final chord selection.
     * 
     * playSound plays the audio sample from the audio folder based on the if statement outcome.
     * 
     * addObject calls from the Chord class via the Array index to display the chord image at
     * the given coordinates
     */
    public void act() 
    {
        /**
         * Testing for A Major, A Minor, A Sharp Major, A Sharp Minor, A Flat Major of A Flat Minor
         * If conditions are correct, the relevant audio will be played and image displayed
        */
        if (Greenfoot.mouseClicked(this) && AMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("A_major.wav");
            getWorld().addObject(new Chords(0) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && AMajor.ImageReader == true && minor.ImageReader == true && 
                Sharp.ImageReader == false && Flat.ImageReader == false)
        {   
            Greenfoot.playSound("A_minor.wav");
            getWorld().addObject(new Chords(1) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && AMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("A#_major.wav");
            getWorld().addObject(new Chords(2) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && AMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == true)
        {   
            Greenfoot.playSound("A#_minor.wav");
            getWorld().addObject(new Chords(3) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && AMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == false)
        {   
            Greenfoot.playSound("G#_major.wav");
            getWorld().addObject(new Chords(22) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && AMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == true)
        {   
            Greenfoot.playSound("G#_minor.wav");
            getWorld().addObject(new Chords(23) , 530, 400);
        }
        
        /**
         * Testing for B Major, B Minor, B Sharp Major, B Sharp Minor, B Flat Major of B Flat Minor
         * If conditions are correct, the relevant audio will be played and image displayed
        */
        if (Greenfoot.mouseClicked(this) && BMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("B_major.wav");
            getWorld().addObject(new Chords(4) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && BMajor.ImageReader == true && minor.ImageReader == true && 
                Sharp.ImageReader == false && Flat.ImageReader == false)
        {   
            Greenfoot.playSound("B_minor.wav");
            getWorld().addObject(new Chords(5) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && BMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("C_major.wav");
            getWorld().addObject(new Chords(6) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && BMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == true)
        {   
            Greenfoot.playSound("C_minor.wav");
            getWorld().addObject(new Chords(7) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && BMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == false)
        {   
            Greenfoot.playSound("A#_major.wav");
            getWorld().addObject(new Chords(2) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && BMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == true)
        {   
            Greenfoot.playSound("A#_minor.wav");
            getWorld().addObject(new Chords(3) , 530, 400);
        }
        
        /**
         * Testing for C Major, C Minor, C Sharp Major, C Sharp Minor, C Flat Major of C Flat Minor
         * If conditions are correct, the relevant audio will be played and image displayed
        */
        if (Greenfoot.mouseClicked(this) && CMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("C_major.wav");
            getWorld().addObject(new Chords(6) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && CMajor.ImageReader == true && minor.ImageReader == true && 
                Sharp.ImageReader == false && Flat.ImageReader == false)
        {   
            Greenfoot.playSound("C_minor.wav");
            getWorld().addObject(new Chords(7) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && CMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("C#_major.wav");
            getWorld().addObject(new Chords(8) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && CMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == true)
        {   
            Greenfoot.playSound("C#_minor.wav");
            getWorld().addObject(new Chords(9) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && CMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == false)
        {   
            Greenfoot.playSound("B_major.wav");
            getWorld().addObject(new Chords(4) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && CMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == true)
        {   
            Greenfoot.playSound("B_minor.wav");
            getWorld().addObject(new Chords(5) , 530, 400);
        }
        
        /**
         * Testing for D Major, D Minor, D Sharp Major, D Sharp Minor, D Flat Major of D Flat Minor
         * If conditions are correct, the relevant audio will be played and image displayed
        */
        if (Greenfoot.mouseClicked(this) && DMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("D_major.wav");
            getWorld().addObject(new Chords(10) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && DMajor.ImageReader == true && minor.ImageReader == true && 
                Sharp.ImageReader == false && Flat.ImageReader == false)
        {   
            Greenfoot.playSound("D_minor.wav");
            getWorld().addObject(new Chords(11) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && DMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("D#_major.wav");
            getWorld().addObject(new Chords(12) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && DMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == true)
        {   
            Greenfoot.playSound("D#_minor.wav");
            getWorld().addObject(new Chords(13) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && DMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == false)
        {   
            Greenfoot.playSound("C#_major.wav");
            getWorld().addObject(new Chords(8) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && DMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == true)
        {   
            Greenfoot.playSound("C#_minor.wav");
            getWorld().addObject(new Chords(9) , 530, 400);
        }
        
        /**
         * Testing for E Major, E Minor, E Sharp Major, E Sharp Minor, E Flat Major of E Flat Minor
         * If conditions are correct, the relevant audio will be played and image displayed
        */
        if (Greenfoot.mouseClicked(this) && EMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("E_major.wav");
            getWorld().addObject(new Chords(14) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && EMajor.ImageReader == true && minor.ImageReader == true && 
                Sharp.ImageReader == false && Flat.ImageReader == false)
        {   
            Greenfoot.playSound("E_minor.wav");
            getWorld().addObject(new Chords(15) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && EMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("F_major.wav");
            getWorld().addObject(new Chords(16) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && EMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == true)
        {   
            Greenfoot.playSound("F_minor.wav");
            getWorld().addObject(new Chords(17) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && EMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == false)
        {   
            Greenfoot.playSound("D#_major.wav");
            getWorld().addObject(new Chords(12) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && EMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == true)
        {   
            Greenfoot.playSound("D#_minor.wav");
            getWorld().addObject(new Chords(13) , 530, 400);
        }
        
        /**
         * Testing for F Major, F Minor, F Sharp Major, F Sharp Minor, F Flat Major of F Flat Minor
         * If conditions are correct, the relevant audio will be played and image displayed
        */
        if (Greenfoot.mouseClicked(this) && FMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("F_major.wav");
            getWorld().addObject(new Chords(16) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && FMajor.ImageReader == true && minor.ImageReader == true && 
                Sharp.ImageReader == false && Flat.ImageReader == false)
        {   
            Greenfoot.playSound("F_minor.wav");
            getWorld().addObject(new Chords(17) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && FMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("F#_major.wav");
            getWorld().addObject(new Chords(18) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && FMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == true)
        {   
            Greenfoot.playSound("F#_minor.wav");
            getWorld().addObject(new Chords(19) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && FMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == false)
        {   
            Greenfoot.playSound("E_major.wav");
            getWorld().addObject(new Chords(14) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && FMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == true)
        {   
            Greenfoot.playSound("E_minor.wav");
            getWorld().addObject(new Chords(15) , 530, 400);
        }
        
        /**
         * Testing for G Major, G Minor, G Sharp Major, G Sharp Minor, G Flat Major of G Flat Minor
         * If conditions are correct, the relevant audio will be played and image displayed
        */
        if (Greenfoot.mouseClicked(this) && GMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("G_major.wav");
            getWorld().addObject(new Chords(20) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && GMajor.ImageReader == true && minor.ImageReader == true && 
                Sharp.ImageReader == false && Flat.ImageReader == false)
        {   
            Greenfoot.playSound("G_minor.wav");
            getWorld().addObject(new Chords(21) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && GMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == false)
        {   
            Greenfoot.playSound("G#_major.wav");
            getWorld().addObject(new Chords(22) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && GMajor.ImageReader == true && Sharp.ImageReader == true &&
                Flat.ImageReader == false && minor.ImageReader == true)
        {   
            Greenfoot.playSound("G#_minor.wav");
            getWorld().addObject(new Chords(23) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && GMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == false)
        {   
            Greenfoot.playSound("F#_major.wav");
            getWorld().addObject(new Chords(18) , 530, 400);
        }
        if (Greenfoot.mouseClicked(this) && GMajor.ImageReader == true && Sharp.ImageReader == false &&
                Flat.ImageReader == true && minor.ImageReader == true)
        {   
            Greenfoot.playSound("F#_minor.wav");
            getWorld().addObject(new Chords(19) , 530, 400);
        }
    }    
}
