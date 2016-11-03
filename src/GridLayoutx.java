/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Estudiante
 */
public class GridLayoutx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400, 300));
        frame.setTitle("Ein anderes Bild");
        
        frame.setLayout(new GridLayout(2,3));
        for(int i = 1; i <= 6; i++){
            frame.add(new JButton("Button " + i));
        }
    }

}
