/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paint;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author student
 */
public class Panel extends JPanel implements MouseListener, MouseMotionListener {
    private int x=-1;
    private int y=-1;
    private int x0 = -1;
    private int y0 = -1;
    private ArrayList<Figura> rzeczy;

    public Panel() {
        addMouseListener(this);
        addMouseMotionListener(this);
        rzeczy = new ArrayList<Figura>();

    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        x0 = e.getX();
        y0 = e.getY();
        
    }

    public void mouseReleased(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        if(x0!=x || y0!=y)rzeczy.add(new Linia(x0,y0,x,y));
        repaint();
    }

    public void mouseClicked(MouseEvent e) {
        if(e.getButton()==1)rzeczy.add(new Kolko(e.getX(), e.getY(), 50));
        if(e.getButton()==3)rzeczy.add(new Kwadrat(e.getX(), e.getY(), 50));
        repaint();
       // JOptionPane.showMessageDialog(null,
        //        e.getPoint().toString());
        
    }
    public void paint(Graphics g) {
        g.clearRect(0, 0, getSize().width, getSize().height);
        if(x0!=x || y0!=y)g.drawLine(x0,y0,x,y);
        g.setColor(Color.RED);
        for(Figura i : rzeczy){
            i.paint(g);
        }
    }
    
    

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
