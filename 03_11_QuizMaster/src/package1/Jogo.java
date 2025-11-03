package package1;
import javax.swing.JOptionPane;
import java.util.List;

public class Jogo {
    public static void main(String[] args) {
        BancodePerguntas banco = new BancodePerguntas();
        List<Perguntas> quiz = banco.gerarQuiz();
        int pontuacao = 0;

        JOptionPane.showMessageDialog(null, 
            "Bem-vindo ao Puzzle de Perguntas!\nVocê responderá 10 perguntas aleatórias.\nBoa sorte!");

        for (int i = 0; i < quiz.size(); i++) {
            Perguntas p = quiz.get(i);

            String titulo = "Pergunta " + (i + 1);
            String perguntaTexto = p.getEnunciado() + "\n\n";
            for (String alt : p.getAlternativas()) {
                perguntaTexto += alt + "\n";
            }

            Object resposta = JOptionPane.showInputDialog(
                    null,
                    perguntaTexto,
                    titulo,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"A", "B", "C", "D"},
                    "A"
            );

            if (resposta == null) {
                JOptionPane.showMessageDialog(null, "Jogo encerrado!");
                System.exit(0);
            }

            char respostaChar = resposta.toString().toUpperCase().charAt(0);
            if (p.verificarResposta(respostaChar)) {
                pontuacao++;
                JOptionPane.showMessageDialog(null, "Correto!");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Errado!\nResposta correta: " + p.getRespostaCorreta());
            }
        }

        JOptionPane.showMessageDialog(null,
                "Fim do jogo!\nVocê acertou " + pontuacao + " de " + quiz.size() + " perguntas!");
    }
}
