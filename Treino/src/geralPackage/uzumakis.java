package geralPackage;

import java.util.Scanner;

public class uzumakis extends Ninja{

	public uzumakis(String nome,String cla) {
		super(nome,"Uzumaki");		
	}
	@Override
	public void exibirHabilidades() {
		System.out.println(nome+", você é do clã " + cla + " e tem a passiva " + "chacra infinito.");
	}
	public void mostrarAcoes() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Quanto de energia você tem?");
		int energia = ler.nextInt();
		for (int i = 0; i!=energia;) {
		System.out.println("Habilidades disponíveis:");
        System.out.println("1️⃣  Criar selo de contenção");
        System.out.println("2️⃣  Invocar o Rasengan");
        System.out.println("3️⃣  Ativar modo sábio!");
       
        int hab = ler.nextInt();
		if (hab == 1) {
			System.out.println("Selo de contenção foi criado");
			energia -= 1;
			System.out.println("Agora sua energia é: " + energia);
		} else if (hab == 2) {
			System.out.println("Rasengan utilizado");
			energia -= 1;
			System.out.println("Agora sua energia é: " + energia);
		} else {
			System.out.println("Você ativou o modo sábio!!");
			energia -= 1;
			System.out.println("Agora sua energia é: " + energia);

        	}
        }
	}
}

