import java.util.Scanner;

public class Horas {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
    double horas1,Resultado;
    

    
     System.out.println("Ingrese sus horas trabajadas semanales");

    horas1 = entrada.nextDouble();
    double salario = 39.38;
        System.out.println("TUS HORAS TRABAJADAS EN TOTAL FUERON: "+horas1 + " multiplicado con tu salario por hora de 39.38");

Resultado = horas1 * salario;

System.out.println("Tu salario semanal fue "+Resultado);



     








    }
}
