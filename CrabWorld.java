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
    static String recentKey;
    static String[] words = {"console.log", "getElementbyid", "innerHTML",
        "var", "Object.prototype", "str.length", "str.indexOf",
        "new Date()", "new Array()", "promise", "()=>{}", "describe", "reduce",
        "map"};
    static int wordSize = words.length;
    public CrabWorld()
    {    
        super(400, 800, 1);

        prepare();
    }
    public void act() {
        recentKey = Greenfoot.getKey();
        if(isWordCanGenerate()){
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
        addObject(textbox,103,251);
        textbox.setLocation(182,178);
    }

    private boolean isWordCanGenerate() {
        return (random(90) == 80);
    }
    private void ganerateTextBox(){
        TextBox textbox = new TextBox();
        addObject(textbox,random(300)+50,1);
    }
    public static int random(int num){
        return Greenfoot.getRandomNumber(num);
    }
    public static String getText() {
        int random = random(wordSize);
        return words[random];
    }
}
