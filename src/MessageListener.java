
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 *
 * @author Estudiante
 */
class MessageListener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "You clicked!");
    }
    
}
