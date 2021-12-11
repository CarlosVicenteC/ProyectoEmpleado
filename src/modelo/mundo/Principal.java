package modelo.mundo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    Empleado empleado1=null;
	String nombreEmpleados;
	String apellidoEmpleados;
	String genero;
	double salario;
	int dia=0, mes=0,anio=0;
	int opcion=0;
	Scanner ingreso = new Scanner (System.in);
	Fecha fechaNacimiento;
	Fecha fechaIngresos;
   //Opciones del Empleado
	boolean salir = false;
 
    while(!salir) {
   
    System.out.println("MENU DE OPCIONES");
	System.out.println("1.Ingresar datos del empleado");
	System.out.println("2. Calcular la edad del empleado");
	System.out.println("3.Calcular la antiguedad del empleado en la empresa");
	System.out.println("4.Calcular las prestaciones del empleado");
	System.out.println("5.Mostrar la informacion del empleado");
	System.out.println("6 Salir");
	System.out.println("Opcion:");
	opcion=ingreso.nextInt();
	switch(opcion) {
	
	
	case 1:
		System.out.println("Ingrese los datos del Empleado");
		System.out.println("Nombre: ");
		nombreEmpleados= ingreso.next();
		System.out.println("Apellido: ");
		apellidoEmpleados=ingreso.next();
		
			
			System.out.println("Género (Masculino,Femenino)");
			genero=ingreso.next();
			 System.out.println("Fecha de Nacimiento del Empleado ");
			do {
				try {
					System.out.println("Ingrese su dia de Nacimiento: ");
					dia=ingreso.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("No puede ingresar numeros negativos o letras: ");
					dia=0;
					ingreso.nextLine();
				}
				
			}while(dia<0);
			
			      
			    	   System.out.println("Ingrese su mes de Nacimiento: ");
						mes=ingreso.nextInt();
			    
		
				System.out.println("Ingrese su anio de Nacimiento: ");
				anio=ingreso.nextInt();
				fechaNacimiento=new Fecha (dia,mes,anio);
				System.out.println("Salario: ");
				salario=ingreso.nextDouble();
				System.out.println("Fecha de Ingreso: ");
				
				System.out.println("Ingrese su dia de Ingreso: ");
				dia=ingreso.nextInt();
				System.out.println("Ingrese su mes de Ingreso: ");
				mes=ingreso.nextInt();
				System.out.println("Ingrese su anio de Ingreso: ");
				anio=ingreso.nextInt();
				fechaIngresos=new Fecha (dia,mes,anio);
				empleado1=new Empleado(nombreEmpleados, apellidoEmpleados, genero,"", salario,fechaIngresos,fechaNacimiento);
		//Carlos Calapucha
		break;
	case 2:
		System.out.println("La edad del empleado es:");
	
		fechaNacimiento=new Fecha (dia,mes,anio);
		
		System.out.println(empleado1.calcularEdad());
		break;
	case 3:
		System.out.println("La antiguedad del empleado es:");
		//fechaIngreso=new Fecha (dia,mes,anio);
		System.out.println(empleado1.calcularAntiguedad());
		break;
	case 4:
		System.out.println("Usted ha escogido la opción 4");
		//y {
			System.out.println(empleado1.calcularPrestaciones());
		//}catch () {
			
		//
		
		break;
	case 5:
		System.out.println("Ustedd ha escogido la opción 5");
		empleado1.mostrarInformacion();
		break;
	case 6: 
		System.out.println("Gracias por su ingreso");
		salir=true;
	default:
		System.out.println(":)");
	}
	
  }
	
}
}
