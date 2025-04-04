import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int cantidad = 500;
    int suma = 0;
    double promedio;

    Random random = new Random();

    // Generar números aleatorios entre 10 y 1000
    for (int i = 0; i < cantidad; i++) {
      suma += random.nextInt(991) + 10;
    }

    // Calcular promedio
    promedio = (double) suma / cantidad;

    // Mostrar resultados
    System.out.println("Suma total: " + suma);
    System.out.println("Promedio: " + promedio);
  }
}