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
public class addGui extends JFrame{
        private PokemonFarm pokemonFarm;
        private String[] pokemonType = {"Grass","Water","Fire","Normal","Electr"};
        private String[] pokemonSkill = {"Flame burst","thunderbolt","tail whip","Water Pulse","Tackle"};
        public addGui(PokemonFarm pokemonFarm){
            
            super("ADD");
            this.pokemonFarm = pokemonFarm;
            
            Container c = getContentPane();
            c.setLayout(new GridLayout(0,2));
            
            //Type
            JLabel Typelabel = new JLabel("Type: ");
            Typelabel.setHorizontalAlignment(JLabel.CENTER);
            JComboBox chooseType = new JComboBox(pokemonType);
            
            //Name
            JLabel Namelabel = new JLabel("Name: ");
            Namelabel.setHorizontalAlignment(JLabel.CENTER);
            JTextField NameTextField = new JTextField();
            
            //weight
            JLabel WeightLabel = new JLabel("Weight: ");
            WeightLabel.setHorizontalAlignment(JLabel.CENTER);
            JTextField WeightTextField = new JTextField();
            
            //skill
            JLabel SkillLabel = new JLabel("Skill: ");
            SkillLabel.setHorizontalAlignment(JLabel.CENTER);
            JComboBox chooseSkll = new JComboBox(pokemonSkill);
            
            //cp
            JLabel CpLabel = new JLabel("CP: ");
            CpLabel.setHorizontalAlignment(JLabel.CENTER);
            JTextField CpTextField = new JTextField();
            
            JButton EnterButton = new JButton("Enter");
            JButton CancelButton = new JButton("Back");
            
            
            EnterButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String type = (String) chooseType.getSelectedItem();
                    String name = NameTextField.getText();
                    float weight = Float.parseFloat(WeightTextField.getText());
                    String skill = (String) chooseSkll.getSelectedItem();
                    float cp = Float.parseFloat(CpTextField.getText());
                    
                if(type.equals("Grass")){
                    Grass grass = new Grass(name,weight,skill,cp);
                    pokemonFarm.addPokemon(grass);
                }
                else if(type.equals("Water")){
                    Water water = new Water(name,weight,skill,cp);
                    pokemonFarm.addPokemon(water);
                }
                else if(type.equals("Fire")){
                    Fire fire = new Fire(name,weight,skill,cp);
                    pokemonFarm.addPokemon(fire);
                }
                else if(type.equals("Normal")){
                    Normal normal = new Normal(name,weight,skill,cp);
                    pokemonFarm.addPokemon(normal);
                }
                else if(type.equals("Electr")){
                    Electr electr = new Electr(name,weight,skill,cp);
                    pokemonFarm.addPokemon(electr);
                }

                setVisible(false);
                    
                }
            });
            CancelButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    setVisible(false);
                }
            });
            
            c.add(Typelabel);
            c.add(chooseType);
            c.add(Namelabel);
            c.add(NameTextField);
            c.add(WeightLabel);
            c.add(WeightTextField);
            c.add(SkillLabel);
            c.add(chooseSkll);
            c.add(CpLabel);
            c.add(CpTextField);
            c.add(EnterButton);
            c.add(CancelButton);
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(600,600);
            setVisible(true);
        }
}
