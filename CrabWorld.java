import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public int maxWorm = 20;
    static String recentKey;
    public CrabWorld()
    {    
        super(400, 800, 1);

        prepare();
    }
    public void act() {
        recentKey = Greenfoot.getKey();
        if(random(100) == 98 || random(100) == 50){
            ganerateTextBox();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StringInputBox inputBox = new StringInputBox();
        addObject(inputBox,200,780);

        TextBox textbox = new TextBox();
        addObject(textbox,100,10);
    }
    public void ganerateTextBox(){
        TextBox textbox = new TextBox();
        addObject(textbox,random(300)+50,1);
    }
    public int random(int num){
        return Greenfoot.getRandomNumber(num);
    }
}
