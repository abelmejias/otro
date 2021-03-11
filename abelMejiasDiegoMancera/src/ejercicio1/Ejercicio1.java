package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
		
	// Constantes
	private static final int EDAD_MAXIMA = 100;
	private static final int LIMITE_NINNO = 12;
	private static final int LIMITE_ADOLESCENTE = 17;
	private static final int LIMITE_JOVEN = 29;
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variables
		int edad;
		
		//Cambio del alumno 2 (Diego Mancera Rodríguez)
		
		//Cambio del alumno 1 (Nombre y Apellidoss)
		
		//Inicio
		System.out.println("Introduce la edad, máximo " + EDAD_MAXIMA);
		edad = Integer.parseInt(teclado.nextLine()); // leer numero
		
		
		if (edad < 0 || edad >= EDAD_MAXIMA){
			System.out.println("Edad incorrecta, no está en el rango indicado");
		}
		else{
			if (edad <= LIMITE_NINNO){
				System.out.println("Es un niño");
			}
			else{
				if (edad <= LIMITE_ADOLESCENTE){
					System.out.println("Es un adolescente");
				}
				else{
					if (edad <= LIMITE_JOVEN){
						System.out.println("Es un joven");
					}
					else{
						System.out.println("Es un adulto");
					}
				}
			}
		}
	}
}
