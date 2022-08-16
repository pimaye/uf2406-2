package utilidades;

/**
 * Clase llamada Funciones dónde son creadas estos dos métodos:
 * 
 * 1.-devuelveCentral
 * 2.-esBisiesto
 * 
 * A continuación, en cada uno de los métodos se explicará el propósito de cada función.
 * 
 * @author Pilar MY
 *
 */


public class Funciones {
	
	
	/**
	 * Método llamado devuelveCentral, que entre tres números que debemos introducir en el programa, 
	 * nos devuelve el número que está en medio numéricamente.
	 * Aquí os dejo dos ejemplos:
	 * Ejemplo 1, de los números 5,9,1 devuelve el 5 porque está entre 1 y 9.
	 * Ejemplo 2, de los números 2,3,5 devuelve el 3 porque está entre 2 y 5.
	 * @param num1: el primer número que tenemos que introducir en el programa.
	 * @param num2: el segundo número que tenemos que introducir en el programa.
	 * @param num3: el tercer número que tenemos que introducir en el programa.
	 * @return: devuelve el número que numéricamente está en medio.
	 */
	
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ( ((num1>num2) && (num1<num3)) || ((num1>num3) && (num1<num2))) {
			enMedio=num1;
		}  else if  ( ((num2>num1) && (num2<num3)) || ((num2>num3) && (num2<num1)) ){
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	
	/**
	 * Método llamado esBisiesto, dónde al introducir un año en el programa,
	 * nos dice si es bisiesto (el año tiene 366 días).
	 * @param anyo: el año que introducimos en el programa.
	 * @return: boolean true si el año es bisiesto y boolean false en caso contrario.
	 */

	public boolean esBisiesto(int anyo) {
		boolean bisiesto = false;
		if (anyo <1700 || anyo >2500) {
			throw new ArithmeticException("El año debe estar entre 1700 y 2500");
		}
		if (anyo %4 == 0 ) {
			if (anyo%100==0 && anyo%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else  {
			bisiesto=false;
		}
		return bisiesto;
	}
	

	
	
}
