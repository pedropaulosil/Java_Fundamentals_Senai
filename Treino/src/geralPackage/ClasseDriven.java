package geralPackage;

import java.util.Scanner;

public class ClasseDriven {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Bem vindo, insira seu nome de ninja: ");
		String nome = ler.nextLine();
		System.out.println("Seja bem vindo " + nome +".\n" +"Vamos iniciar nossa aventura, de qual clã você é? "+ "\n"+"Escolha entre Hyuga, Uzumaki ou Uchiha");
		String cla = ler.nextLine().trim().toLowerCase();

		Ninja ninja;

		switch (cla) {
		case "hyuga":
			ninja = new hyugas(nome);
			break;
		case "uzumaki":
			ninja = new uzumakis(nome, cla);
			break;
		case "uchiha":
			ninja = new uchihas(nome, cla);
			break;
		default:
			System.out.println("Clã inválido! Escolha entre Hyuga, Uzumaki ou Uchiha.");
			ler.close();
			return;	
		}
		ninja.exibirHabilidades();
		ninja.mostrarAcoes();
		
		ler.close();
	}
}
