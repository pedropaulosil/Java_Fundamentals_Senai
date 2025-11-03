package package1;

public class Perguntas {
    private String enunciado;
    private String[] alternativas;
    private char respostaCorreta;

    public Perguntas(String enunciado, String[] alternativas, char respostaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = Character.toUpperCase(respostaCorreta);
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public char getRespostaCorreta() {
        return respostaCorreta;
    }

    public boolean verificarResposta(char resposta) {
        return Character.toUpperCase(resposta) == respostaCorreta;
    }
}
