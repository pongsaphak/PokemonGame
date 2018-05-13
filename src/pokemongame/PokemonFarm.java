/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
import java.util.*;
/**
 *
 * @author user
 */
public class PokemonFarm {
    

	private ArrayList<Pokemon> pokemons;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
                pokemons.add(new Electr("Pikachu", 20, "thunderbolt" , 780));
                pokemons.add(new Fire("Charmander", 30,"flame burst",800 ));
                
	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}


	public void list(){
		for(Pokemon pokemon: pokemons){
			pokemon.print();
		}
	}

	public void feed(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.eat();
			}
		}
                else {
                        for(Pokemon pokemon: pokemons){
                                if(pokemonName.equals(pokemon.getName())){
                                        pokemon.eat();
                                }          
                        }
                }
	
        }
        public int getPokemonAmount(){
                return pokemons.size();
        }
        public String getPokemon(int i){
                return pokemons.get(i).getName();
        }
        public Pokemon getPokemonName(String name){
                Pokemon now = null;
                for(Pokemon pokemon: pokemons){
                    if (pokemon.getName().equals(name)){
                        return pokemon;
                    }
                }
                return now;
        }
        public Pokemon getPokemonAttack(String name1 ,String name2){
                Pokemon now = null;
                PokemonSkill skill1 = null;
                PokemonSkill skill2 = null;
                
                for(Pokemon pokemon1 : pokemons ){
                    for(Pokemon pokemon2 : pokemons ){
                        
                        if (pokemon1.getName().equals(name1) && pokemon2.getName().equals(name2)){
                                skill1 = PokemonSkill.getPokemonSkill(pokemon1.getSkill());
                                skill2 = PokemonSkill.getPokemonSkill(pokemon2.getSkill());
                            
                                if(skill1.getDamage() - skill2.getDamage() > 0 ){
                                    pokemon2.Attack((skill1.getDamage() - skill2.getDamage()));
                                    return pokemon2;
                                }
                                else if(skill1.getDamage() - skill2.getDamage() < 0 ){
                                    pokemon1.Attack(pokemon2.getCp()- pokemon1.getCp());
                                    return pokemon2;
                                }  
                                else{
                                    return pokemon2;
                                }
                        }
                        
                    }
                }
                return now;
        }
}

