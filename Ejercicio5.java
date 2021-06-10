import java.util.*;
public class Ejercicio5{
	public static void main (String []args ){

		int mayoresM=0;
		int menoresH=0;
		int cantidad;
		int edad;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de edades");
		cantidad = entrada.nextInt();

		for (int i=0; i<cantidad ;i++ ) {
			System.out.print("Ingrese la edad "+(i+1)+" =");
			edad = entrada.nextInt();
			if (edad>=18) {
				mayoresM = mayoresM+1;
			}else {
				menoresH=menoresH+1;
			}
		}
		System.out.println("\nLas cantidad de mujeres mayores de edad: "+mayoresM);
		System.out.println("Las cantidad de hombres menores de edad: "+menoresH);
		
	}	
}
