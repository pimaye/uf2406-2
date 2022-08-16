package utilidades;

/**
 * Clase llamada Funciones d�nde son creadas estos dos m�todos:
 * 
 * 1.-devuelveCentral
 * 2.-esBisiesto
 * 
 * A continuaci�n, en cada uno de los m�todos se explicar� el prop�sito de cada funci�n.
 * 
 * @author Pilar MY
 *
 */


public class Funciones {
	
	
	/**
	 * M�todo llamado devuelveCentral, que entre tres n�meros que debemos introducir en el programa, 
	 * nos devuelve el n�mero que est� en medio num�ricamente.
	 * Aqu� os dejo dos ejemplos:
	 * Ejemplo 1, de los n�meros 5,9,1 devuelve el 5 porque est� entre 1 y 9.
	 * Ejemplo 2, de los n�meros 2,3,5 devuelve el 3 porque est� entre 2 y 5.
	 * @param num1: el primer n�mero que tenemos que introducir en el programa.
	 * @param num2: el segundo n�mero que tenemos que introducir en el programa.
	 * @param num3: el tercer n�mero que tenemos que introducir en el programa.
	 * @return: devuelve el n�mero que num�ricamente est� en medio.
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
	 * M�todo llamado esBisiesto, d�nde al introducir un a�o en el programa,
	 * nos dice si es bisiesto (el a�o tiene 366 d�as).
	 * @param anyo: el a�o que introducimos en el programa.
	 * @return: boolean true si el a�o es bisiesto y boolean false en caso contrario.
	 */

	public boolean esBisiesto(int anyo) {
		boolean bisiesto = false;
		if (anyo <1700 || anyo >2500) {
			throw new ArithmeticException("El a�o debe estar entre 1700 y 2500");
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
