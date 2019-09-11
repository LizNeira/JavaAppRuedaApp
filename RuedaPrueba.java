/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruedaa;

import javax.swing.JFrame;

/**
 *
 * @author Alumno
 */
public class RuedaPrueba
{
    public static void main( String args[] ) throws InterruptedException
    {
        Rueda rueda = new Rueda();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ventana.add( rueda );
        ventana.setSize( 230, 250 );
        ventana.setVisible( true );


        while (true) {
            rueda.girarRueda();
            rueda.repaint();
               Thread.sleep(120);
        }
    }
}