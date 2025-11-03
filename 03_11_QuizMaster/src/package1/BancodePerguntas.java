package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancodePerguntas {
    private List<Perguntas> perguntas;

    	public BancodePerguntas() {
        perguntas = new ArrayList<>();

        perguntas.add(new Perguntas("Qual é a capital da França?",
                new String[]{"A) Paris", "B) Londres", "C) Roma", "D) Madrid"}, 'A'));

        perguntas.add(new Perguntas("Qual é o maior planeta do sistema solar?",
                new String[]{"A) Marte", "B) Terra", "C) Júpiter", "D) Saturno"}, 'C'));

        perguntas.add(new Perguntas("Quem pintou a Mona Lisa?",
                new String[]{"A) Van Gogh", "B) Leonardo da Vinci", "C) Picasso", "D) Michelangelo"}, 'B'));

        perguntas.add(new Perguntas("Qual é o símbolo químico da água?",
                new String[]{"A) H2O", "B) O2", "C) CO2", "D) N2"}, 'A'));

        perguntas.add(new Perguntas("Em que ano o Brasil foi descoberto?",
                new String[]{"A) 1400", "B) 1492", "C) 1500", "D) 1600"}, 'C'));

        perguntas.add(new Perguntas("Quantos continentes existem?",
                new String[]{"A) 5", "B) 6", "C) 7", "D) 8"}, 'C'));

        perguntas.add(new Perguntas("Quem escreveu 'Dom Casmurro'?",
                new String[]{"A) Machado de Assis", "B) José de Alencar", "C) Jorge Amado", "D) Drummond"}, 'A'));

        perguntas.add(new Perguntas("Qual é o resultado de 8 x 7?",
                new String[]{"A) 54", "B) 56", "C) 64", "D) 58"}, 'B'));

        perguntas.add(new Perguntas("Qual animal é conhecido como 'rei da selva'?",
                new String[]{"A) Tigre", "B) Leão", "C) Elefante", "D) Urso"}, 'B'));

        perguntas.add(new Perguntas("Qual é o idioma oficial do Brasil?",
                new String[]{"A) Espanhol", "B) Francês", "C) Português", "D) Inglês"}, 'C'));
        
        java.util.Collections.shuffle(perguntas);
    }
        	       

	public List<Perguntas> gerarQuiz() {
		int limite = Math.min(5, perguntas.size());
		return perguntas.subList(0, limite);
	}
    			
}

