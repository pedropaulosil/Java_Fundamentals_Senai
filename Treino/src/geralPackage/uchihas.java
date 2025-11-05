package geralPackage;

import java.util.Scanner;

public class uchihas extends Ninja{
	
		public uchihas(String nome, String cla) {
			super (nome, "Uchiha");
		}
		@Override
	public void exibirHabilidades(){
	System.out.println(nome + ", você é do clâ " + cla + " e tem a habilidade sharingan");
	}
		@Override
	public void mostrarAcoes() {
			Scanner ler = new Scanner(System.in);
			System.out.println("Quanto de energia você tem?");
			int energia = ler.nextInt();
			for (int i = 0; i!=energia;) {
			 System.out.println("Habilidades disponíveis:");
		        System.out.println("1️⃣  Ativar Sharingan");
		        System.out.println("2️⃣  Usar o Katon: Bola de Fogo Suprema");
		        System.out.println("3️⃣  Lançar o Amaterasu!");
		        
		        int hab = ler.nextInt();
		        if (hab == 1) {
		        	System.out.println("Sharingan ativado");
		        	energia -= 1;
					System.out.println("Agora sua energia é: " + energia);
		        }else if (hab == 2) {
		        		System.out.println("Katon utilizado!!");
		        		energia -= 1;
		    			System.out.println("Agora sua energia é: " + energia);
		        		
		        	}else { System.out.println("AMATERATSU!");
		        	energia -= 1;
					System.out.println("Agora sua energia é: " + energia);
		        		
		        	}
		        }
		}
}
