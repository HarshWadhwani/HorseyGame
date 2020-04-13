package MyGame;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Wizard extends GameObject {

    Handler handler;
    
    Color myColor;
    
    public Wizard(int x, int y, ID id, Handler handler, Color color) {
        super(x, y, id);
        this.handler = handler;
        this.myColor = color;
    }
    
    public void tick() {
        x += velX;
        y += velY;
        
        // movement
        if(handler.isUp()) velY = -5;
        else if(!handler.isDown()) { velY = 0; }

        if(handler.isDown()) velY = 5;  // Works
        else if(!handler.isUp())  velY = 0; 
        
        if(handler.isRight()) velX = 5; 
        else if(!handler.isLeft())  velX = 0; 
                
        if(handler.isLeft()) velX = -5;  
        else if(!handler.isRight())  velX = 0; 
      }

    public void render(Graphics g) {
        g.setColor(myColor);
        g.fillRect(x, y, 50, 50);
       }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 48);
        }
}
