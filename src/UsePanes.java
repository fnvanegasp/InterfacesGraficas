/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import javax.swing.*;
public class UsePanes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"What's your name?");
        
        int choice = JOptionPane.showConfirmDialog(null,"Do you like cake, " + name + "?");
        
        if (choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Of course! Who does not?");
        } else {
            JOptionPane.showMessageDialog(null, "We will have to agree to disagree");
        }
    }
    
}
