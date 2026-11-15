package Ajuste_de_Funciones;

public class Main {

    public static void main(String[] args) {

        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 4, 5, 4, 5};

        double[] resultados = RegresionLineal.calcularMinimosCuadrados(x, y);

        double beta0 = resultados[0];
        double beta1 = resultados[1];

        double xValor = 6;

        double estimacion = RegresionLineal.predecir(beta0, beta1, xValor);

        System.out.printf("Prediccion para X=%.1f: %.4f%n",
                xValor, estimacion);
    }
}
