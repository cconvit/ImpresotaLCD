package co.com.psl.LCDPrinter;
import java.util.ArrayList;
import java.util.List;

/*
 * Clase que permite procesar una secuencia de numeros
 * 
 */
public class PrintNumbers {

	private List<PrintNumber> listNumbers;
	private String numbers;
	private int size;
	
	public PrintNumbers(String numbers,int size) {
		
		this.listNumbers = new ArrayList<PrintNumber>();
		this.numbers = numbers;
		this.size = size;
		this.processNumbers();
	}
	
	/**
	Metodo para procesar la cadena de caracteres numericos y convertilos en una lsita de objetos tipo PrintNumber
	@param 
	@throws
	**/
	
	private void processNumbers() {
		
		//Iterar sobre todos los numeros
		for (int i = 0;i < numbers.length(); i++){

			int value = Character.getNumericValue(numbers.charAt(i));
			PrintNumber number = new PrintNumber(value,this.size);
			this.listNumbers.add(number);
			
		}
		
	}
	
	/**
	Metodo para imprimir la secuencia de numeros
	@param
	@throws
	**/
	
	public void print() {
		
		String seg0Horizontal = "";
		String seg1Horizontal = "";
		String seg2Horizontal = "";
		String seg0Vertical = "";
		String seg1Vertical = "";
		
		//Genero el segmento0, 1 y 2 horizontales de la cadena de numeros
		for (int i = 0; i < this.listNumbers.size(); i++) {
			
			seg0Horizontal +=  this.listNumbers.get(i).getHorizontalSegment0For() + " ";
			seg1Horizontal +=  this.listNumbers.get(i).getHorizontalSegment1For() + " ";
			seg2Horizontal +=  this.listNumbers.get(i).getHorizontalSegment2For() + " ";
		
		}
		//Imprimimos el segmento 0
		System.out.println(seg0Horizontal);
		
		//Iteramos sobre el valor de size para generar los segmentos verticales entre cada pivote.
		for (int x = 0; x < this.size -1 ; x++) {
    	 		
			seg0Vertical = "";
			
			for (int i = 0; i < this.listNumbers.size(); i++) {
				
				seg0Vertical +=  this.listNumbers.get(i).getVerticalSegment0For() + " ";
			
			}
			
			//Imprimimos los segmentos verticales 0
			System.out.println(seg0Vertical);
				
    	 	}
		
		//Imprimimos el segmento 1
		System.out.println(seg1Horizontal);
			
		for (int x = 0; x < this.size -1 ; x++) {
	 		
			seg1Vertical = "";
			
			for (int i = 0; i < this.listNumbers.size(); i++) {
				
				seg1Vertical +=  this.listNumbers.get(i).getVerticalSegment1For() + " ";
			
			}
			//Imprimimos los segmentos verticales 1
			System.out.println(seg1Vertical);
				
    	 	}

		//Imprimimos el segmento 2
		System.out.println(seg2Horizontal);
		

	}

}