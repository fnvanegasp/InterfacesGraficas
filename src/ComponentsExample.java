/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */

import java.awt.*;
import javax.swing.*;
public class ComponentsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(new Dimension(300, 100));
       frame.setTitle("A button");
       
       JButton button1 = new JButton();
       button1.setText("I'm a button");
       button1.setBackground(Color.red);
       frame.add(button1);
       
       JButton button2 = new JButton();
       button2.setText("Click me");
       button2.setBackground(Color.RED);
       
       frame.setVisible(true);
    }
    
}
