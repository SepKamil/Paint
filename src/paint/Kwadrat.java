/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paint;

import java.awt.Graphics;

/**
 *
 * @author student
 */
public class Kwadrat implements Figura{
    private int x, y, bok;
    
    public Kwadrat(int x, int y, int bok){
        this.y=y;
        this.x=x;
        this.bok=bok;
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(x-bok/2, y-bok/2, bok, bok);
    }
    
}
