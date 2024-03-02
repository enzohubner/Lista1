package exercicio4;

public class ImpostoRenda {
    public double valSalBruto;
    public double valSalLiquido;
    public double valDesconto;

    public void leDados() {
        System.out.println("Digite o salário bruto:");
        valSalBruto = InOut4.leDouble("Digite o salario: ");
    }

    public boolean verificaDados() {
        return valSalBruto > 0;
    }

    public void calculaImposto() {
        double imposto;

        if (valSalBruto <= 1903.98) {
            imposto = 0;
        } else if (valSalBruto <= 2826.65) {
            imposto = valSalBruto * 0.075 - 142.80;
        } else if (valSalBruto <= 3751.05) {
            imposto = valSalBruto * 0.15 - 354.80;
        } else if (valSalBruto <= 4664.68) {
            imposto = valSalBruto * 0.225 - 636.13;
        } else {
            imposto = valSalBruto * 0.275 - 869.36;
        }

        valDesconto = imposto;
        valSalLiquido = valSalBruto - valDesconto;
    }

    public void exibeResultado() {
        System.out.println("Salário Bruto: R$" + valSalBruto);
        System.out.println("Desconto de Imposto de Renda: R$" + valDesconto);
        System.out.println("Salário Líquido: R$" + valSalLiquido);
    }
}
