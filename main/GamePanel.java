package main;

import inputs.Keyboardinputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    private float xDelta =100, yDelta=100;// default value
    private float xDir=0.03f, yDir=0.03f;
    private int frames =0;
    private long lastcheck =0;
    private Color color = new Color(150, 20,90);
    private Random random;
    public GamePanel(){
        random = new Random();
        mouseInputs = new MouseInputs(this);
        addKeyListener(new Keyboardinputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    public void changeXDelta(int value){
        this.xDelta += value;
        repaint();
    }
    public void changeYDelta(int value){
        this.yDelta += value;
        repaint();//it will be repaint itself
    }
    public void setRectPos(int x, int y){
        this.xDelta= x;
        this.yDelta = y;
       // all apply new value to xdelta, ydelta
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);// JComponent is the superclass of Jpanel
        updateRectangle();
        g.setColor(color);

        updateRectangle();
        g.fillRect((int)xDelta,(int)yDelta,200,50);
        frames ++;
        if(System.currentTimeMillis() -lastcheck >=1000 ){
            lastcheck = System.currentTimeMillis();
            System.out.println("FPS: "+frames); //if one second have passed since the last fps check, we do a new fps check
            //save the newfps check as the lastFps check and repeat
            frames =0; // FPS : frame per second


        }
        repaint();


    }
    public void updateRectangle(){
        xDelta +=xDir;
        if(xDelta >400 || xDelta<0 ) {
            xDir *= -1;
            color  = getRndColor();
        }
        yDelta += yDir;
        if(yDelta>400 || yDelta<0) {
            yDir *= -1;
            color  = getRndColor();
        }
    }
    private Color getRndColor(){
        int r =random.nextInt(225);// between 0 and 225        int b =0;
        int g=random.nextInt(225);
        int b = random.nextInt(225);
        return new Color(r,b,g);
    }



}
