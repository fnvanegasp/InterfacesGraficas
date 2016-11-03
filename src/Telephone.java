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
public class Telephone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400, 300));
        frame.setTitle("Das telefon");
        frame.setLayout(new BorderLayout());
      
      
        
        JPanel centerPanel = new JPanel(new GridLayout(4, 3));
        for(int i = 1; i <= 9; i++){
            centerPanel.add(new JButton("" + i));
        }
        centerPanel.add(new JButton("*"));
        centerPanel.add(new JButton("0"));
        centerPanel.add(new JButton("#"));
        frame.add(centerPanel, BorderLayout.CENTER);
        
        JPanel southPanel = new JPanel(new FlowLayout());
        southPanel.add(new JLabel("Numbre to dial: "));
        southPanel.add(new JTextField(10));
        frame.add(southPanel, BorderLayout.SOUTH);
        
        frame.setVisible(true);
        
    }
    
}
