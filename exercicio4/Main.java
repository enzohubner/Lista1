package exercicio4;

public class Main {
    public static void main(String[] args) {
        ImpostoRenda meuPeso = new ImpostoRenda();

        meuPeso.leDados();

        if (meuPeso.verificaDados()) {
            meuPeso.calculaImposto();
            meuPeso.exibeResultado();
        } else {
            InOut4.MsgDeErro("ERRO", "O valor do salário Bruto não é válido!");
        }
    }
}
