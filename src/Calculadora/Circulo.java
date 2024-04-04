package Calculadora;

import java.util.Scanner;

public abstract class Circulo implements FiguraGeometrica {
    private static final double PI = 3.1416;

    @Override
    public double calcularArea(Scanner scanner) {
        System.out.print("\n\t\tIngresa el radio del círculo: ");
        double radio = scanner.nextDouble();
        return PI * radio * radio;
    }

    @Override
    public double calcularPerimetro(Scanner scanner) {
        System.out.print("\n\t\tIngresa el radio del círculo: ");
        double radio = scanner.nextDouble();
        return 2 * PI * radio;
    }

    @Override
    public String obtenerNombreOperacion() {
        return "Círculo";
    }

    @Override
    public double calcular(Scanner scanner) {
        return 0;
    }
}