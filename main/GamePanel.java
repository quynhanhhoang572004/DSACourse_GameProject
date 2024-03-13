package main;

import inputs.Keyboardinputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    private int xDelta =100, yDelta=100;// default value
    public GamePanel(){
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
        repaint();// all apply new value to xdelta, ydelta
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);// JComponent is the superclass of Jpanel
        g.fillRect(xDelta,yDelta,200,50);

    }


}
