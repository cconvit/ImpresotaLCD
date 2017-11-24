package co.com.psl.LCDPrinter;

/*
 *  Cualquier numero esta representado por seis pivotes
 *  P00        P01
 *  
 *  P10		   P11
 *  
 *  P20		   P21
 *  
 */

public final class Pivot {

	/**
	Metodo para obtener el valor del caracter en base al tipo de Pivote y el numero a procesar
	@param type   	Tipo de pivote a procesar
	@param number   Numero a procesar
	@return Caracter del pivote
	@throws
	**/
	
	public static String getValueFor(PivotType type, int number) {
		
		switch (type) {
		
			case P00:
				return " ";
			case P01:
				return " ";
			case P10:
				return Pivot.getValueP10For(number);
			case P11:
				return Pivot.getValueP11For(number);
			case P20:
				return Pivot.getValueP20For(number);
			case P21:
				return Pivot.getValueP21For(number);
			default:
				return "";
				
		}

	}

	/**
	Metodo para obtener el valor para el pivote P10 en base al numero a procesar
	@param number   Numero a procesar
	@return Caracter del pivote
	@throws
	**/
	
	private static String getValueP10For(int number) {
		
		if ((number == 2) || (number == 3) || (number == 7)) {
			
			return " ";
		}else {
			
			return Main.CARACTER_VERTICAL;
		}
	
	}
	
	/**
	Metodo para obtener el valor para el pivote P11 en base al numero a procesar
	@param number   Numero a procesar
	@return Caracter del pivote
	@throws
	**/
	
	private static String getValueP11For(int number) {
		
		if ((number == 1) || (number == 5) || (number == 6)) {
			
			return " ";
		}else {
			
			return Main.CARACTER_VERTICAL;
		}
	
	}
	
	/**
	Metodo para obtener el valor para el pivote P20 en base al numero a procesar
	@param number   Numero a procesar
	@return Caracter del pivote
	@throws
	**/
	
	private static String getValueP20For(int number) {
		
		if ((number == 0) || (number == 1) || (number == 2) || (number == 6) || (number == 8) ) {
			
			return Main.CARACTER_VERTICAL;
		}else {
			
			return " ";
		}
	
	}
	
	/**
	Metodo para obtener el valor para el pivote P21 en base al numero a procesar
	@param number   Numero a procesar
	@return Caracter del pivote
	@throws
	**/
	
	private  static String getValueP21For(int number) {
		
		if ((number == 1) || (number == 2)) {
			
			return " ";
		}else {
			
			return Main.CARACTER_VERTICAL;
		}
	
	}
}
