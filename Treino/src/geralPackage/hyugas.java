package geralPackage;

import java.util.Scanner;

public class hyugas extends Ninja {
    public hyugas(String nome) {
        super(nome, "hyuga");
    }

    @Override
    public void exibirHabilidades() {
        System.out.println(nome + ", você pertence ao clã Hyuga e domina o Byakugan!");
    }

    @Override
    public void mostrarAcoes() {
    	Scanner ler = new Scanner(System.in);
		System.out.println("Quanto de energia você tem?");
		int energia = ler.nextInt();
		for (int i = 0; i!=energia;) {
        System.out.println("Habilidades disponíveis:");
        System.out.println("1️⃣  Ativar Byakugan");
        System.out.println("2️⃣  Executar o Punho Gentil");
        System.out.println("3️⃣  Defender com o Oito Trigramas!");
        
        int hab = ler.nextInt();
        if (hab == 1) {
        	System.out.println("Byakugan ativado");
        	energia -= 1;
			System.out.println("Agora sua energia é: " + energia);
        }else if (hab == 2) {
        		System.out.println("Punho gentil foi executado");
        		energia -= 1;
    			System.out.println("Agora sua energia é: " + energia);
        		
        	}else { System.out.println("Oito trigramas utilizado!!");
        	energia -= 1;
			System.out.println("Agora sua energia é: " + energia);
        		
        	}
        }
    }

}