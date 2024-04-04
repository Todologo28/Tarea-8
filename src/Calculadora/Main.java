package Calculadora;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipoFigura, operacion;
        boolean continuar = true;
        ArrayList<String> operacionesRealizadas = new ArrayList<>();
        ArrayList<Double> resultadosOperaciones = new ArrayList<>();

        while (continuar) {
            System.out.println("\n\n\t\t\tCalculadora Geométrica");
            System.out.println("\n\t\tOpciones de figuras geométricas: ");
            System.out.println("\n\t1. Círculo");
            System.out.println("\t2. Cuadrado");
            System.out.println("\t3. Triángulo");
            System.out.println("\t4. Rectángulo");
            System.out.println("\t5. Pentágono");
            System.out.println("\t6. Potencia");

            try {
                System.out.print("\n\n\tSeleccione el tipo de figura que desea calcular: ");
                tipoFigura = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\n\t\tOPCIÓN INVÁLIDA.");
                scanner.next(); // Limpia el búfer del scanner
                continue;
            }

            FiguraGeometrica figura = null;

            switch (tipoFigura) {
                case 1: // Circulo
                    System.out.print("\n\t\t¿Qué operación desea realizar? \n\n1. para medir Área \n2. para medir el perímetro\n ");
                    operacion = scanner.nextInt();

                    Circulo circulo = new Circulo() {
                        @Override
                        public double calcularPerimetro(double lado) {
                            return 0;
                        }
                    };
                    double resultadoCirculo = 0;
                    if (operacion == 1) {
                        resultadoCirculo = circulo.calcularArea(scanner);
                        operacionesRealizadas.add("\n\n\tÁrea de Círculo");
                    } else if (operacion == 2) {
                        resultadoCirculo = circulo.calcularPerimetro(scanner);
                        operacionesRealizadas.add("\n\n\tPerímetro de Círculo");
                    }
                    resultadosOperaciones.add(resultadoCirculo);
                    System.out.println("\tEl resultado es: " + resultadoCirculo);
                    break;


                case 2: //Cuadrado
                    System.out.print("\n\t\t¿Qué operación desea realizar? \n\n1. para medir Area \n2. para medir el perímetro\n ");
                    operacion = scanner.nextInt();
                    Cuadrado cuadrado = new Cuadrado() {
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
                        public double calcularPerimetro(double lado) {
                            return 0;
                        }

                        @Override
                        public String obtenerNombreOperacion() {
                            return "Cuadrado";
                        }

                        @Override
                        public double calcular(Scanner scanner) {
                            return 0;
                        }
                    };
                    double resultadoCuadrado = 0;
                    if (operacion == 1) {
                        operacionesRealizadas.add("\n\n\tÁrea de Cuadrado");
                        resultadoCuadrado = cuadrado.calcularArea(scanner);
                    } else if (operacion == 2) {
                        operacionesRealizadas.add("\n\n\tPerímetro de Cuadrado");
                        resultadoCuadrado = cuadrado.calcularPerimetro(scanner);
                    }
                    resultadosOperaciones.add(resultadoCuadrado);
                    System.out.println("\tEl resultado es: " + resultadoCuadrado);
                    break;

                case 3: //Triángulo
                    System.out.print("\n\t\t¿Qué operación desea realizar? \n\n1. para medir Área \n2. para medir el perímetro\n ");
                    operacion = scanner.nextInt();
                    int finalOperacionTriangulo = operacion;
                    Triangulo triangulo = new Triangulo() {
                        @Override
                        public double calcularArea(Scanner scanner) {
                            System.out.print("\n\t\tIngresa la base del triángulo: ");
                            double base = scanner.nextDouble();
                            System.out.print("\n\t\tIngresa la altura del triángulo: ");
                            double altura = scanner.nextDouble();
                            return (base * altura) / 2;
                        }

                        @Override
                        public double calcularPerimetro(Scanner scanner) {
                            System.out.print("\n\t\tIngresa la longitud de los tres lados del triángulo (separados por un espacio): ");
                            double lado1 = scanner.nextDouble();
                            double lado2 = scanner.nextDouble();
                            double lado3 = scanner.nextDouble();
                            return lado1 + lado2 + lado3;
                        }

                        @Override
                        public double calcularPerimetro(double lado) {
                            return 0;
                        }

                        @Override
                        public String obtenerNombreOperacion() {
                            return "Triángulo";
                        }

                        @Override
                        public double calcular(Scanner scanner) {
                            if (finalOperacionTriangulo == 1) {
                                return calcularArea(scanner);
                            } else if (finalOperacionTriangulo == 2) {
                                return calcularPerimetro(scanner);
                            } else {
                                // En caso de otra operación no definida
                                return 0.0;
                            }
                        }
                    };
                    double resultadoTriangulo = 0;
                    if (operacion == 1) {
                        operacionesRealizadas.add("\n\n\tÁrea de Triángulo");
                        resultadoTriangulo = triangulo.calcularArea(scanner);
                    } else if (operacion == 2) {
                        operacionesRealizadas.add("\n\n\tPerímetro de Triángulo");
                        resultadoTriangulo = triangulo.calcularPerimetro(scanner);
                    }
                    resultadosOperaciones.add(resultadoTriangulo);
                    System.out.println("\tEl resultado es: " + resultadoTriangulo);
                    break;

                case 4: //Rectángulo
                    System.out.print("\n\t\t¿Qué operación desea realizar? \n\n1. para medir Área \n2. para medir el perímetro\n ");
                    operacion = scanner.nextInt();
                    int finalOperacionRectangulo = operacion;
                    Rectangulo rectangulo = new Rectangulo() {
                        @Override
                        public double calcularArea(Scanner scanner) {
                            System.out.print("\n\t\tIngresa la base del rectángulo: ");
                            double base = scanner.nextDouble();
                            System.out.print("\n\t\tIngresa la altura del rectángulo: ");
                            double altura = scanner.nextDouble();
                            return base * altura;
                        }

                        @Override
                        public double calcularPerimetro(Scanner scanner) {
                            System.out.print("\n\t\tIngresa la base del rectángulo: ");
                            double base = scanner.nextDouble();
                            System.out.print("\n\t\tIngresa la altura del rectángulo: ");
                            double altura = scanner.nextDouble();
                            return 2 * (base + altura);
                        }

                        @Override
                        public double calcularPerimetro(double lado) {
                            return 0;
                        }

                        @Override
                        public String obtenerNombreOperacion() {
                            return "Rectángulo";
                        }

                        @Override
                        public double calcular(Scanner scanner) {
                            if (finalOperacionRectangulo == 1) {
                                return calcularArea(scanner);
                            } else if (finalOperacionRectangulo == 2) {
                                return calcularPerimetro(scanner);
                            } else {
                                // En caso de otra operación no definida
                                return 0.0;
                            }
                        }
                    };

                    double resultadoRectangulo = 0;
                    if (operacion == 1) {
                        operacionesRealizadas.add("Área de Rectángulo");
                        resultadoRectangulo = rectangulo.calcularArea(scanner);
                    } else if (operacion == 2) {
                        operacionesRealizadas.add("Perímetro de Rectángulo");
                        resultadoRectangulo = rectangulo.calcularPerimetro(scanner);
                    }
                    resultadosOperaciones.add(resultadoRectangulo);
                    System.out.println("El resultado es: " + resultadoRectangulo);
                    break;

                case 5: //Pentágono
                    System.out.print("\n\t\t¿Qué operación desea realizar? \n\n1. para medir Área \n2. para medir el perímetro\n ");
                    operacion = scanner.nextInt();
                    int finalOperacionPentagono = operacion;
                    Pentagono pentagono = new Pentagono() {
                        @Override
                        public double calcularArea(Scanner scanner) {
                            System.out.print("\n\t\tIngresa la longitud del lado del pentágono: ");
                            double lado = scanner.nextDouble();
                            System.out.print("\n\t\tIngresa la apotema del pentágono: ");
                            double apotema = scanner.nextDouble();
                            return (5.0 / 2.0) * lado * apotema;
                        }

                        @Override
                        public double calcularPerimetro(Scanner scanner) {
                            System.out.print("\n\t\tIngresa la longitud del lado del pentágono: ");
                            double lado = scanner.nextDouble();
                            return 5 * lado;
                        }

                        @Override
                        public double calcularPerimetro(double lado) {
                            return 0;
                        }

                        @Override
                        public String obtenerNombreOperacion() {
                            return "Pentágono";
                        }

                        @Override
                        public double calcular(Scanner scanner) {
                            if (finalOperacionPentagono == 1) {
                                return calcularArea(scanner);
                            } else if (finalOperacionPentagono == 2) {
                                return calcularPerimetro(scanner);
                            } else {
                                // En caso de otra operación no definida
                                return 0.0;
                            }
                        }
                    };

                    double resultadoPentagono = 0;
                    if (operacion == 1) {
                        operacionesRealizadas.add("\n\n\tÁrea de Pentágono");
                        resultadoPentagono = pentagono.calcularArea(scanner);
                    } else if (operacion == 2) {
                        operacionesRealizadas.add("\n\n\tPerímetro de Pentágono");
                        resultadoPentagono = pentagono.calcularPerimetro(scanner);
                    }
                    resultadosOperaciones.add(resultadoPentagono);
                    System.out.println("\tEl resultado es: " + resultadoPentagono);
                    break;

                case 6: // Potencia
                    System.out.print("\n\t\t¿Qué operación desea realizar? \n\n1. para calcular la potencia\n ");
                    operacion = scanner.nextInt();
                    Potencia potencia = new Potencia() {
                        @Override
                        public double calcularArea(Scanner scanner) {
                            return 0;
                        }

                        @Override
                        public double calcularPerimetro(Scanner scanner) {
                            System.out.print("\n\t\tIngresa la base: ");
                            double base = scanner.nextDouble();
                            System.out.print("\n\t\tIngresa la potencia: ");
                            double exponente = scanner.nextDouble();
                            return Math.pow(base, exponente);
                        }

                        @Override
                        public double calcularPerimetro(double lado) {
                            return 0;
                        }

                        @Override
                        public String obtenerNombreOperacion() {
                            return "Potencia";
                        }

                        @Override
                        public double calcular(Scanner scanner) {
                            return 0;
                        }
                    };
                    double resultadoPotencia = potencia.calcularPerimetro(scanner);
                    operacionesRealizadas.add("\n\n\tPotencia");
                    resultadosOperaciones.add(resultadoPotencia);
                    System.out.println("\tEl resultado de la potencia es: " + resultadoPotencia);
                    break;

                default:
                    System.out.println("\n\t\tOPCIÓN INVALIDA.");
                    continue;
            }

            if (figura != null) {
                double resultado = figura.calcularArea(scanner);
                resultadosOperaciones.add(resultado);
            }

            System.out.print("\n¿Desea realizar otra operación? (Si/No): ");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("No")) {
                continuar = false;
            }
        }

        // Imprimir operaciones realizadas al final
        System.out.println("\n\nOperaciones realizadas:");
        for (int i = 0; i < operacionesRealizadas.size(); i++) {
            System.out.println(operacionesRealizadas.get(i) + ": " + String.format("%.2f", resultadosOperaciones.get(i)));
        }
    }
}