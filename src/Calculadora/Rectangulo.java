package Calculadora;

import java.util.Scanner;

public abstract class Rectangulo implements FiguraGeometrica {
    @Override
    public double calcularArea(Scanner scanner) {
        System.out.print("\n\t\tIngresa la longitud y el ancho del rectángulo (separados por un espacio): ");
        double longitud = scanner.nextDouble();
        double ancho = scanner.nextDouble();
        return longitud * ancho;
    }

    @Override
    public double calcularPerimetro(Scanner scanner) {
        System.out.print("\n\t\tIngresa la longitud y el ancho del rectángulo (separados por un espacio): ");
        double longitud = scanner.nextDouble();
        double ancho = scanner.nextDouble();
        return 2 * (longitud + ancho);
    }

    @Override
    public String obtenerNombreOperacion() {
        return "Rectángulo";
    }
}