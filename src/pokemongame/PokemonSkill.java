package pokemongame;

public class PokemonSkill{
	private String name;
	private float damage;

	public PokemonSkill(String name, float damage){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(){
		return this.damage;
	}

	public static PokemonSkill getPokemonSkill(String name){
		PokemonSkill skill = null;
		switch(name){
			case "Flame burst":
				skill = new PokemonSkill("Flame burst", 90);
				break;
			case "thunderbolt":
				skill = new PokemonSkill("Thunderbolt", 120);
				break;
			case "tail whip":
				skill = new PokemonSkill("Tail Whip", 80);
				break;
			case "Water Pulse":
				skill = new PokemonSkill("Water Pulse", 100);
				break;
                        case "Tackle":
                                skill = new PokemonSkill("Tackle", 50);
				break;
		}
		return skill;
	}
}
