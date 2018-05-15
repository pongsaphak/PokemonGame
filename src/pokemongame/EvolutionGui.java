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
public class EvolutionGui extends JFrame{
    private PokemonFarm pokemonFarm;
    public EvolutionGui(PokemonFarm pokemonFarm){
        super("Evolution");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        this.pokemonFarm = pokemonFarm;
           
        JLabel pokemonicon = new JLabel();
        pokemonicon.setHorizontalAlignment(JLabel.CENTER);
        Icon img1 = new ImageIcon(getClass().getResource("International_Pokémon_logo.svg.png"));
        pokemonicon.setIcon(img1);
        
        
        
        c.add(pokemonicon, BorderLayout.PAGE_START);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setVisible(true);
    } 
    
}
