package org.cuatrovientos.dam.ed.ejemplomaven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Calculadora {
	private static Logger logger = LogManager.getLogger();

	private String operacionEnCurso;

	/**
	 * Metodo Main de ejecucion, escribe un log y hace una suma
	 * 
	 * @param args el nombre a pintar en el LOG, ojo que tiene que tener un solo
	 *             valor el array
	 */
	public static void main(String[] args) {

		System.out.println("Hello World!");

		logger.error("Otro Hello World 1DAM: " + args[0]);

		Calculadora miCalculadora = new Calculadora("empty");
		
		// Hago operaciones distintas segun el .. ponemos otros comentarios
		switch (args[0]) {
		case "sumar":
			int resultado = miCalculadora.sumar(args[1], args[2]);
			logger.error("Resultado es: " + resultado);
			break;
		case "restar":
			resultado = miCalculadora.restar(args[1], args[2]);
			logger.error("Resultado es: " + resultado);
			break;

		default:
			break;
		}

	}

	/**
	 * Metodo para sumar numeros
	 * 
	 * @param numero1 El Primer numero a sumar
	 * @param numero2 El segundo numero a sumar
	 * @return el numero sumado
	 * 
	 *         TODO me falta validar que numero1 y numero2 sean números
	 */
	public int sumar(String numero1, String numero2) {

		int numero1Int = Integer.valueOf(numero1); // FIXME da error cuando numero1 es una letra
		int numero2Int = Integer.valueOf(numero2); // Recuperamos el segundo numero y lo convertimos a Entero

		if (true) {
			logger.error("Aqui Entra");
		} else {
			logger.error("Aqui no entra");
		}

		return numero1Int + numero2Int;

	}
	
	public int restar(String numero1, String numero2) {

		int numero1Int = Integer.valueOf(numero1); // FIXME da error cuando numero1 es una letra
		int numero2Int = Integer.valueOf(numero2); // Recuperamos el segundo numero y lo convertimos a Entero


		return numero1Int - numero2Int;

	}

	/**
	 * @return the operacionEnCurso
	 */
	public String getOperacionEnCurso() {
		return operacionEnCurso;
	}

	/**
	 * @param operacionEnCurso the operacionEnCurso to set
	 */
	public void setOperacionEnCurso(String operacionEnCurso) {
		this.operacionEnCurso = operacionEnCurso;
	}

	public Calculadora(String operacionEnCurso) {
		super();
		this.operacionEnCurso = operacionEnCurso;
	}

}
