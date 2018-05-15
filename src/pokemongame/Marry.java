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
public class Marry extends JFrame{
    private PokemonFarm pokemonFarm;
    private String[] pokemonName;
    
    public Marry(PokemonFarm pokemonFarm,String s1 ,String s2){
            super("Marry");
            Container c = getContentPane();
            c.setLayout(new BorderLayout());
            
            
            JPanel center = new JPanel();
            center.setLayout(new FlowLayout()); 
            
            //pokemon1
            JLabel pokemonpic1 = new JLabel();
            Icon img1 = new ImageIcon(getClass().getResource("./imagefiles/" + s1 + ".png"));
            pokemonpic1 .setIcon(img1);
            
            //marry
            JLabel marry = new JLabel();
            Icon img3 = new ImageIcon(getClass().getResource("marry.gif"));
            marry .setIcon(img3);
            
            //pokemon2
            JLabel pokemonpic2 = new JLabel();
            Icon img2 = new ImageIcon(getClass().getResource("./imagefiles/" + s2 + ".png"));
            pokemonpic2 .setIcon(img2);
            
            JButton exit = new JButton("Exit");
            
            exit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        setVisible(false);
                }
            });
            center.add(pokemonpic1);
            center.add(marry);
            center.add(pokemonpic2);
            c.add(center,BorderLayout.CENTER);
            c.add(exit,BorderLayout.PAGE_END);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(1500,300);
            setVisible(true);
            
    }
    
}
