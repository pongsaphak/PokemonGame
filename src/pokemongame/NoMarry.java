/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class NoMarry extends JFrame{
    private PokemonFarm pokemonFarm;
    private String[] pokemonName;
    
    public NoMarry(){
            super("Not Marry");
            Container c = getContentPane();
            c.setLayout(new BorderLayout());
            
            JPanel center = new JPanel();
            center.setLayout(new FlowLayout()); 
            
            //not marry
            JLabel Nomarry = new JLabel();
            Nomarry.setHorizontalAlignment(JLabel.CENTER);
            Icon img3 = new ImageIcon(getClass().getResource("Marriedonce.png"));
            Nomarry .setIcon(img3);
            
            JButton exit = new JButton("Exit");
            
            exit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        setVisible(false);
                }
            });
            
            center.add(Nomarry);
            c.add(center,BorderLayout.CENTER);
            c.add(exit,BorderLayout.PAGE_END);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(600,600);
            setVisible(true);
            
    }
    
}
