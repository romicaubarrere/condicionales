package uy.edu.utec.principal;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		//Imprimo menu
		System.out.println("**** MENU ****");
		System.out.println("1. Ingresar 2 números enteros diferentes y visualizar el mayor de ellos");
		System.out.println("2. Pedir un número entre 0 y 99999 y decir cuantas cifras tiene.");
		System.out.println("3. Realizar un programa que simule un inicio de sesión solicitando el nombre de usuario y contraseña, y mostrar un mensaje en pantalla, inicio de sesión correcto/ nombre de usuario incorrecto");
		System.out.println("4. Determinar si un número es múltiplo de 10.");
		System.out.println("Seleccione la opción deseada");

		int opcion = entrada.nextInt();
		
		switch(opcion) {
		case 1: 
		
			// Parte 1
			System.out.println("Ingrese el primer numero: ");
			int num1=entrada.nextInt();
			System.out.println("Ingrese el segundo numero");
			int num2=entrada.nextInt();
	
			if(num1>num2){
				System.out.println("El número mayor es: " + num1);
			} else{
				System.out.println("El número mayor es: " + num2);
			}
			break;

		case 2:
			// Parte 2
			System.out.print("Digite un numero: "); 
			int numero=entrada.nextInt();
	
			if(numero < 10){
				System.out.println("El numero "+numero+" tiene 1 cifra");
			} else if(numero<100){
				System.out.println("El numero "+numero+" tiene 2 cifras");
			} else if(numero < 1000){
				System.out.println("El numero "+numero+" tiene 3 cifras");
			} else if(numero < 10000){
				System.out.println("El numero "+numero+" tiene 4 cifras");
			} else if(numero < 100000){
				System.out.println("El numero "+numero+" tiene 5 cifras");
			}
			break;

		case 3: 
			//Parte 3
			System.out.print("Ingrese Nombre de usuario: ");
			String nombre = entrada.next();
			System.out.print("Ingrese Clave de usuario: ");
			String clave = entrada.next();
	
			if(nombre.equals("juan") && clave.equals("123456")){
				System.out.println("Bienvenido al Sistema");
			} else{
				System.out.println("Nombre de Usuario o contraseña Incorrecto");
			}
	        break;

		case 4:
			//Parte 4
	        System.out.println("Ingrese un numero: ");
	        int multiplo=entrada.nextInt();
	
	        if(multiplo%10==0){
	            System.out.println("Es multiplo de 10");
	        } else{
	            System.out.println("No es multiplo de 10");
	        }
	        break;
		}
		System.exit(1);
	} 
}
