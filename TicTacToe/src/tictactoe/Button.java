/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author a.ballagan
 */
public class Button extends JButton{
    
    public Button() {
       Dimension dmnsn = new Dimension(100,100);
         
       this.setPreferredSize(dmnsn);
    }
}
