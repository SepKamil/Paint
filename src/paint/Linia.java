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
public class Linia implements Figura{
    private int x0, y0, x1, y1;
    
    public Linia(int x0,int y0, int x1, int y1){
        this.x0=x0;
        this.x1=x1;
        this.y0=y0;
        this.y1=y1;
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(x0,y0,x1,y1);
    }
    
}
