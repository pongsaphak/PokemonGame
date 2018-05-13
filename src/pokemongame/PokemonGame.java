package pokemongame;

import java.util.*;


public class PokemonGame{
//	public static void printPokemons(ArrayList<Pokemon> pokemons){
//		System.out.println("===== Pokemon List =====");
//		for(Pokemon pokemon: pokemons){
//			System.out.println("Pokemon "+pokemon.getName()+" health: "+pokemon.getHealth()+"/"+pokemon.maxHealth);
//		}
//	}
         
	public static void main(String args[]){
                PokemonFarm pokemonFarm = new PokemonFarm();
                new Gui(pokemonFarm); 
                
//		ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
//		for(int i=0; i<5; ++i){
//			pokemons.add(new Pikachu());
//		}
//                for(int i=0; i<5; ++i){
//			pokemons.add(new Squirtle());
//		}
//
//		printPokemons(pokemons);
//		System.out.println("\nPokemon Exercies ... ");
//		for(Pokemon pokemon: pokemons)
//			pokemon.move();
//
//		System.out.println("\nPokemon List After Exercies ... ");
//		printPokemons(pokemons);
//
//		System.out.println("\nPokemon Battle ... ");
//		Pokemon pokemon1 = pokemons.get(0);
//		Pokemon pokemon2 = pokemons.get(1);
//		pokemon1.attack(pokemon2);
//
//		
//		System.out.println("\nPokemon List After Attack ... ");
//		printPokemons(pokemons);
//
//		System.out.println("\nPokemon Eat ... ");
//		Berry berry = new Berry(0);
//		for(Pokemon pokemon: pokemons)
//			pokemon.eat(berry);
//
//		System.out.println("\nPokemon List After Ate ... ");
//		printPokemons(pokemons);
	}
}
