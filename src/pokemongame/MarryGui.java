/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author user
 */
public class MarryGui extends JFrame{
    private PokemonFarm pokemonFarm;
    private String[] pokemonName;
    
    public MarryGui(PokemonFarm pokemonFarm){
            super("Marry");
            Container c = getContentPane();
            c.setLayout(new BorderLayout());
            
            pokemonName = new String[pokemonFarm.getPokemonAmount()];
            for (int i = 0; i < pokemonFarm.getPokemonAmount(); i++) {
                pokemonName[i] = pokemonFarm.getPokemon(i);
            }
            //pokemon1
            JPanel start = new JPanel();
            start.setLayout(new FlowLayout()); 
            JLabel jName1 = new JLabel("Pokemon Name1: ");
            JComboBox pokemon1 = new JComboBox(pokemonName);
            JButton enter1 = new JButton("Enter");
            JLabel pokemonpic1 = new JLabel();
            pokemonpic1 .setHorizontalAlignment(JLabel.CENTER);
            Icon img1 = new ImageIcon(getClass().getResource("Pokeball.png"));
            pokemonpic1 .setIcon(img1);
            
            //pokemon2
            JPanel center = new JPanel();
            center.setLayout(new FlowLayout()); 
            JLabel jName2 = new JLabel("Pokemon Name2: ");
            JComboBox pokemon2 = new JComboBox(pokemonName);
            JButton enter2 = new JButton("Enter");
            JLabel pokemonpic2 = new JLabel();
            pokemonpic2 .setHorizontalAlignment(JLabel.CENTER);
            Icon img2 = new ImageIcon(getClass().getResource("Pokeball.png"));
            pokemonpic2 .setIcon(img2);
        
            //marry&&exit
            JPanel end = new JPanel();
            end.setLayout(new GridLayout(0,2));
            JButton marry = new JButton("Marry");
            JButton exit = new JButton("Exit");
       
        enter1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name = (String) pokemon1.getSelectedItem();
                    Pokemon pokemon= pokemonFarm.getPokemonName(name);
                    
                    switch (name){
                        case "Pikachu": pokemonpic1.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/Pikachu.png")));
                                        break;
                        case "Charmander": pokemonpic1.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/Charmander.png")));
                                           break;
                        default : pokemonpic1.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/" + name +".png")));
                                  break;
                    }
                }
            });
            
            
            enter2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    String name = (String) pokemon2.getSelectedItem();
                    Pokemon pokemon= pokemonFarm.getPokemonName(name);
                    
                     switch (name){
                        case "Pikachu": pokemonpic2.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/Pikachu.png")));
                                        break;
                        case "Charmander": pokemonpic2.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/Charmander.png")));
                                           break;
                        default : pokemonpic2.setIcon(new ImageIcon(getClass().getResource( "./imagefiles/" + name +".png")));
                                  break;
                    }
                }
            });
        
            marry.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                  String name1 = (String) pokemon1.getSelectedItem();
                  String name2 = (String) pokemon2.getSelectedItem();
                  new Marry(pokemonFarm,name1,name2);
                }
            });
        
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        
        start.add(jName1);
            start.add(pokemon1);
            start.add(enter1);
            start.add(pokemonpic1);
            c.add(start,BorderLayout.PAGE_START);
            
            center.add(jName2);
            center.add(pokemon2);
            center.add(enter2);
            center.add(pokemonpic2);
            c.add(center,BorderLayout.CENTER);
     
            
            end.add(marry);
            end.add(exit);
            c.add(end, BorderLayout.PAGE_END);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setVisible(true);
    } 
    
}
