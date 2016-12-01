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
public class Kolko implements Figura {
    private int x0, y0;
    private int R;
    
    public Kolko(int x0,int y0, int R){
        this.x0=x0;
        this.y0=y0;
        this.R=R;
    }
    
    @Override
    public void paint(Graphics g){
        g.drawOval(x0-R/2, y0-R/2, R, R);
    }
}
