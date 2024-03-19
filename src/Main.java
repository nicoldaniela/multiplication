import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("entre un numero: ");
        int n = scanner.nextInt();
        int i = 1;
        long sum = 0;
        int eleccion = scanner.nextInt();
        // Usando  a while bucle
        System.out.println("señor usuario ingrese con el numero un tipo de bucle");
        switch (eleccion) {

            case 1:
                while (i <= n) ;
                sum += i * i;

                System.out.println("Suma usando el bucle: " + sum);
                break;
            // Usando el  do-while bucle

            case 2:
                int sum_doMientras = 0;
                int iDoWhile = 1;
                do {
                    sum += i * i;
                    i++;
                } while (i <= n);
                System.out.println("Suma usando  do-while bucle: " + sum_doMientras);
                break;
            // usando  a for bucle
            case 3:
                int suma = 0;
                for (; i <= n; i++) {
                    suma += i * i;
                }
                System.out.println("Suma usando  for bucle: " + suma);
                break;
            default:
                System.out.println("el numero que digito no es valido");
        }
    }
}