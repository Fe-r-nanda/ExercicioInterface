package br.com.generation.interface1;

public class TestaAnimalInterface {

	public static void main(String[] args) {
	
		AnimalInterface a = new CachorroInterface();
		
		a.EmiteSom();
		
		 a = new CavaloInterface();
		a.EmiteSom();
		
		 a = new Preguica();
		a.EmiteSom();
		
		

	}

}
