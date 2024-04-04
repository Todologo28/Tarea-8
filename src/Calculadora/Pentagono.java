package Calculadora;

import java.util.Scanner;

public abstract class Pentagono implements FiguraGeometrica {
    @Override
    public double calcularArea(Scanner scanner) {
        System.out.print("\n\t\tIngresa la longitud de un lado del pentágono: ");
        double lado = scanner.nextDouble();
        return 0.5 * lado * lado * (2.2361 + 5) * 0.2;
    }

    @Override
    public double calcularPerimetro(Scanner scanner) {
        System.out.print("\tIngresa la longitud de un lado del pentágono: ");
        double lado = scanner.nextDouble();
        return 5 * lado;
    }

    @Override
    public String obtenerNombreOperacion() {
        return "Pentágono";
    }
}
