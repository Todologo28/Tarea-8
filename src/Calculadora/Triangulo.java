package Calculadora;

import java.util.Scanner;

public abstract class Triangulo implements FiguraGeometrica {
    @Override
    public double calcularArea(Scanner scanner) {
        System.out.print("\n\t\tIngresa la base y la altura del triángulo (separados por un espacio): ");
        double base = scanner.nextDouble();
        double altura = scanner.nextDouble();
        return 0.5 * base * altura;
    }

    @Override
    public double calcularPerimetro(Scanner scanner) {
        System.out.print("\tIngresa la longitud de los tres lados del triángulo (separados por un espacio): ");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();
        return lado1 + lado2 + lado3;
    }

    @Override
    public String obtenerNombreOperacion() {
        return "Triángulo";
    }
}

