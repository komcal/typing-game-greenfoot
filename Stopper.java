import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Stopper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stopper extends Actor
{
    /**
     * Act - do whatever the Stopper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Stopper(){
        setImage();
    }
    public void act() 
    {
        // Add your action code here.
        checkTextBoxTouch();
    }
    private void checkTextBoxTouch(){
        if(isTouching(TextBox.class)){
            Counter counter = CrabWorld.getCounter();
            counter.setValue(counter.getValue() - 2);
            removeTouching(TextBox.class);
        }
    }
    private void setImage(){
        GreenfootImage image = new GreenfootImage(400, 10);
        image.setColor(new Color(128, 0, 0));
        image.fill();
        setImage(image);
    }
}
