package Calculadora;

import java.util.Scanner;

public abstract class Potencia implements FiguraGeometrica {

    @Override
    public double calcularPerimetro(Scanner scanner) {
        System.out.print("\n\t\tIngresa la base: ");
        double base = scanner.nextDouble();
        System.out.print("\n\t\tIngresa la potencia: ");
        double exponente = scanner.nextDouble();
        return Math.pow(base, exponente);
    }

    @Override
    public String obtenerNombreOperacion() {
        return "Potencia";
    }
}
