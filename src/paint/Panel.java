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

    public Panel() {
        addMouseListener(this);
        addMouseMotionListener(this);

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
    }

    public void mouseClicked(MouseEvent e) {
        
       // JOptionPane.showMessageDialog(null,
        //        e.getPoint().toString());
        
    }
    public void paint(Graphics g) {
        g.clearRect(0, 0, getSize().width, getSize().height);
        g.setColor(Color.RED);
        if (x != -1 && y != -1) {
            g.drawLine(x0, y0, x, y);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
