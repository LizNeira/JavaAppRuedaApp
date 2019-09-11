/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruedaa;

/**
 *
 * @author Alumno
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class Rueda extends JPanel {

    int y = 20;
    int x = 10;
    int z = 40;
    int w = 70;

    public void girarRueda() {

        y = y + 20;
        x = x + 10;
        z = z + 5;
        w = w + 1;


    }

    @Override
    public void paint(Graphics gg) {
        super.paint(gg);
        AffineTransform transform = new AffineTransform();
        Graphics2D g = (Graphics2D) gg;
        Graphics2D g2 = (Graphics2D) gg;
        Graphics2D g3 = (Graphics2D) gg;
        Graphics2D g4 = (Graphics2D) gg;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.BLACK);
        g.fillOval(-9, -8, 230, 230);
        g.setColor(Color.GRAY);

        g.fillOval(8, 4, 200, 200);

        g.setColor(Color.BLACK);

        Rectangle rect2 = new Rectangle(20, 110, 180, 2);



        g.rotate(Math.toRadians(y), rect2.getX() + rect2.width / 2, rect2.getY() + rect2.height / 2);
        g.draw(rect2);
        g.fill(rect2);

        g2.rotate(Math.toRadians(x), rect2.getX() + rect2.width / 2, rect2.getY() + rect2.height / 2);
        g2.draw(rect2);
        g2.fill(rect2);

        g3.rotate(Math.toRadians(z), rect2.getX() + rect2.width / 2, rect2.getY() + rect2.height / 2);
        g3.draw(rect2);

        g3.fill(rect2);
        g4.rotate(Math.toRadians(w), rect2.getX() + rect2.width / 2, rect2.getY() + rect2.height / 2);
        g4.draw(rect2);

        g4.fill(rect2);


    }


}