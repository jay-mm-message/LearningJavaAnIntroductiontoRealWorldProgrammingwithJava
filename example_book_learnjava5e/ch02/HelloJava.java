package ch02;

import javax.swing.*;

/**
 * A bare bones graphical version of Hello World.
 */
public class HelloJava {
    static String szFrame = new String("Hello, Java! frame");
    static String szLabel = new String("Hello, Java! label");
    public static void main( String[] args ) {
        JFrame frame = new JFrame(szFrame);
        JLabel label = new JLabel(szLabel, JLabel.CENTER );
        frame.add(label);
        frame.setSize( 300, 300 );
        frame.setVisible( true );
    }
}
