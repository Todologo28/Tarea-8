package Calculadora;
import java.util.Scanner;
public interface FiguraGeometrica {
    double calcularArea(Scanner scanner);
    double calcularPerimetro(Scanner scanner);

    double calcularPerimetro(double lado);

    String obtenerNombreOperacion();

    double calcular(Scanner scanner);
}