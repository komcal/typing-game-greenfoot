import greenfoot.*;
import java.awt.Color;
 
public class TextBox extends Actor
{
    
    public String text = "";
    public String input = "";
    
    public int MAX_INPUT_LENGTH = text.length();
    
    public TextBox()
    {
        updateImage();
    }
     
    private void updateImage()
    {
        text = CrabWorld.getText();
        GreenfootImage image = new GreenfootImage(15*MAX_INPUT_LENGTH, 30);
        image.setColor(new Color(128, 0, 0));
        image.fill();
        image.setColor(Color.lightGray);
        image.fillRect(3, 3, image.getWidth()-6, 24);
        GreenfootImage textImage = new GreenfootImage(text, 24, Color.black, null);
        image.drawImage(textImage, (image.getWidth()-textImage.getWidth())/2, 15-textImage.getHeight()/2);
        setImage(image);
    }
 
    public void act()
    {
        moveObject();
        onReceiveKey();
    }
    private void onReceiveKey() {
        String key = CrabWorld.recentKey;
        if (key == null) return;
        else if ("enter".equals(key) && input.length() > 0)
        {
            isTextMustRemove();
            input = "";
            return;
        }
        else if ("backspace".equals(key) && input.length() > 0){
            input = input.substring(0, input.length() - 1);
        }
        else if ("escape".equals(key)) {
            input = "";
        }
        else if ("space".equals(key)) {
            key = " ";
        }
        
        if (key.length() == 1 && input.length() < MAX_INPUT_LENGTH){
            input += key;
        }
    }
    public void isTextMustRemove() {
        if(input.equals(text)){
            System.out.println("text is same");
            removeItSelf();
        }
        else {
            System.out.println("not correct");
        }
    }
    public void removeItSelf() {
        getWorld().removeObject(this);
    }
    public void moveObject() {
        int x = getX();
        int y = getY();
        setLocation(x, y+3);
    }
}
