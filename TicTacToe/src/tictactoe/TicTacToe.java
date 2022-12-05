/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author a.ballagan
 */
public class TicTacToe extends JFrame {
    //TicTacToe "is a" JFrame
    Button[][] buttonGrid;
    static int Rows = 3;
    static int Cols = 3;
    
    public TicTacToe() {
        //JFrame frame = new JFrame("Tic Tac Toe");
        super("Tic Tac Toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        GridLayout lm = new GridLayout(Rows,Cols);
        JPanel buttonPanel = new JPanel(lm);
        buttonGrid = new Button[Rows][Cols];
        
        for (int i = 0; i< Rows; i++){
            for(int j=0; j< Cols; j++){
                Button b = new Button();
                buttonGrid[i][j] = b;
                buttonPanel.add(b);
                
            }
        }
        this.add(buttonPanel);
        this.pack();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TicTacToe game = new TicTacToe();
    }
    
}
