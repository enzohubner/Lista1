public class PesoIdeal {
    public static double altura;
    public static double peso;
    public static String sexo;

    public static void leDados() {
        altura = InOut3.leDouble("Digite a altura: ");
        peso = InOut3.leDouble("Digite o peso: ");
        sexo = InOut3.leString("Digite o sexo M ou F: ");
    }

    public static boolean verificaDados() {
        if (peso > 2 && peso < 200 && altura > 1.0 && altura < 2.5 && sexo == "M") {
            return true;
        } else {
            return false;
        }
    }

    public static void calculaPesoIdeal() {
        double pesoIdeal;
        if (sexo == "M") {
            pesoIdeal = (72.7 * altura) - 58;
            InOut3.MsgDeAviso("PESO IDEAL ", "Resultado: " + pesoIdeal);
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
            InOut3.MsgDeAviso("PESO IDEAL ", "Resultado: " + pesoIdeal);
        }
    }
}
