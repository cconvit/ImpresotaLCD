package co.com.psl.LCDPrinter;
import java.util.Scanner;

public class Main {

	static final String CARACTER_VERTICAL = "|";
    static final String CARACTER_HORIZONTAL = "_";
	private static Scanner scanner;
    
    public static void main(String[] args) {
    	
    	scanner = new Scanner(System.in);
    	Boolean exit = false;
    	
    	do {
    		System.out.println("Introduce la operación a realizar: ");
    		String task = scanner.nextLine();//Leemos el task enviado por el usuario
    		Operation operation = new Operation(task);
    		operation.process();//Procesamos la  operacion
    		exit = operation.exit;
    		System.out.println("");
    	}while (!exit);
    		
    		System.out.println("Adios!");
  
    }

}
