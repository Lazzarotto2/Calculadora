


public class Main {
    public static void main(String[] args) {
        Op operacoes = new Op();
        Numerus analisarEcalcular = new Numerus(operacoes);
        Buton buton = new Buton(operacoes, analisarEcalcular);
        buton.criarJanela();

    }
}