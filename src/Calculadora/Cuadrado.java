package Calculadora;

import java.util.Scanner;

public abstract class Cuadrado implements FiguraGeometrica {
    @Override
    public double calcularArea(Scanner scanner) {
        System.out.print("\n\t\tIngresa la longitud del lado del cuadrado: ");
        double lado = scanner.nextDouble();
        return lado * lado;
    }

    @Override
    public double calcularPerimetro(Scanner scanner) {
        System.out.print("\n\t\tIngresa la longitud del lado del cuadrado: ");
        double lado = scanner.nextDouble();
        return 4 * lado;
    }

    @Override
    public String obtenerNombreOperacion() {
        return "Cuadrado";
    }
}