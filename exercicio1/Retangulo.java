
public class Retangulo {
    public static double altura;
    public static double base;

    public static void leDados() {
        altura = InOut.leDouble("Digite a altura: ");
        base = InOut.leDouble("Digite a base: ");
    }

    public static boolean verificaRetangulo() {
        if (altura == base) {
            InOut.MsgDeErro("ERRO", "A figura nao foi classificada como um retangulo");
            return false;
        } else {
            calculaArea();
            calculaPerimetro();
            return true;

        }
    }

    public static void calculaArea() {
        double area = base * altura;
        InOut.MsgDeInforma("Area do retangulo: ", " " + area);

    }

    public static void calculaPerimetro() {
        double perimetro = 2 * (base + altura);
        InOut.MsgDeInforma("Area do retangulo: ", " " + perimetro);

    }
}
