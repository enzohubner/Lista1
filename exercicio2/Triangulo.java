public class Triangulo {
    public static double ladoA;
    public static double ladoB;
    public static double ladoC;

    public static boolean verificaTriangulo() {
        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            calculaArea();
            return true;
        } else {
            return false;
        }
    }

    public static void leDados() {
        ladoA = InOut2.leDouble("Digite o lado A: ");
        ladoB = InOut2.leDouble("Digite o lado B: ");
        ladoC = InOut2.leDouble("Digite o lado C: ");
    }

    public static void calculaArea() {
        double s = (ladoA + ladoB + ladoC) / 2;
        double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
        InOut2.MsgDeInforma("Calculo de Area", "Area: " + area);

    }
}
