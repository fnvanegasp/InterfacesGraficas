
import javax.swing.*;
import java.awt.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Layout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               JFrame frame = new JFrame();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setSize(new Dimension(400, 300));
               frame.setTitle("Viel spaß");
               frame.setLayout(new FlowLayout());
               
               JLabel label = new JLabel("Schreib etwas");
               JTextField field = new JTextField(5);
               JButton button = new JButton("Submit");
               button.setIcon(new ImageIcon("caution.gif"));
               
               frame.setLayout(new FlowLayout());
               frame.add(label);
               frame.add(field);
               frame.add(button);
               
               Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
               frame.setLocation(dim.width/2-frame.getSize().width/2,
                                dim.height/2-frame.getSize().height/2);
               frame.setVisible(true);

    }
    
}
