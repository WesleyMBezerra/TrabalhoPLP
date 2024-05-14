package gambit;

import java.util.Random;

class Combate{

	public static void Duelo(String personagem1, String personagem2) {

		
	Random dano = new Random();
	Random defesa = new Random();
		
	int lifePersonagem1 = 15;
	int lifePersonagem2 = 15;
	
	int rodada = 1;
	
	System.out.println("O Combate entre: "+ personagem1+" e "+personagem2 + " vai começar");
	
	while(true) {
		
		
		int _dano = dano.nextInt(10);
		int _defesa = defesa.nextInt(10);
		
		System.out.println(personagem1 + " Vida: "+lifePersonagem1);
		System.out.println(personagem2 + " Vida: "+lifePersonagem2);
		
		System.out.println("\n__Rodada__ "+ rodada);
		
		rodada += 1;
		
		System.out.println("O "+personagem1+" causa "+_dano+" de dano de ataque! ");
		
		
		if(_dano <= _defesa) {
			
			System.out.println("O "+ personagem2+" bloqueia com "+_defesa + " de defesa o ataque e nada acontece");
			
		}else {
			
			System.out.println("O "+ personagem2+" com apenas "+_defesa+" de defesa não consegue bloquear e toma o ataque");
			
			lifePersonagem2 -= _dano;
			
		}
		
		if(lifePersonagem2 <= 0) {
			System.out.println("\n______WINS_________ ==> " + personagem1+"\n");
			
			System.out.println(personagem1 + " Vida: "+lifePersonagem1);
			System.out.println(personagem2 + " Vida: "+lifePersonagem2);
			
			break;}
		
		
		System.out.println("\n__invertendo o combate__");
		
		
		_dano = dano.nextInt(10);
		_defesa = defesa.nextInt(10);
		
		
		System.out.println("\nO "+personagem2+" causa "+_dano+" de dano de ataque! ");
		
		if(_dano <= _defesa) {
			
			System.out.println("O "+ personagem1+" bloqueia com "+_defesa + " de defesa o ataque e nada acontece");
			
		}else {
			
			System.out.println("O "+ personagem1+" com apenas "+_defesa+" de defesa não consegue bloquear e toma o ataque");
			
			lifePersonagem1 -= _dano;
			
		}
		
		if(lifePersonagem1 <= 0) {
			System.out.println("\n______WINS_________ \n ==> " + personagem2+"\n");
			
			System.out.println(personagem1 + " Vida: "+lifePersonagem1);
			System.out.println(personagem2 + " Vida: "+lifePersonagem2);
			
			break;
			}
	
		
		
		}
	
	}
}


public class Trabalho{
	
	
	public static void main(String[] args) {
		
		System.out.println("Lista de X-Mens: \n");	
		
		gambit Gambit = new gambit("Gambit", 22);

		Gambit.setPoder("Manipular energia cinetica");
			
		Gambit.descricao();
		
		wolverine Wolverine = new wolverine("Logan",9999);
		
		Wolverine.setPoder("Garras foda e Regeneração");
		
		Wolverine.descricao();
		
		System.out.println("Número de personagens: " + xmen.numeroPersonagens());
		
		Combate.Duelo(Gambit.getNome(), Wolverine.getNome());
		
		
	}
	
	
}


