package co.com.psl.LCDPrinter;

/*
 * Esta clase permite generar los el caracter a usar para los segmentos horizontales de cada numero en base a los pivotes los pivotes
 * Seg0 = P00 to P01
 * Seg1 = P10 to P11
 * Seg2 = P20 to P21
 */
public final class Segment {

	/**
	Procesa la informacion del segmento en base al tipo y al numero
	@param type Tipo de Segmento
	@param number Numero que se va a procesar
	@return Caracter
	@throws 
	**/
	
	public static String getValueForHorizontal(SegmentType type, int number) {
		
		switch (type) {
		
			case Seg0:
				return Segment.getValueSeg0For(number);
			case Seg1:
				return Segment.getValueSeg1For(number);
			case Seg2:
				return Segment.getValueSeg2For(number);
			default:
				return "";
				
		}

	}

	/**
	Metodo para para obtener el valor para el segmento horizontal 0 en base al numero a procesar
	@param number   Numero a procesar
	@return Caracter
	@throws
	**/
	
	private static String getValueSeg0For(int number) {
		
		if ((number == 1) || (number == 4)){
			
			return " ";
		}else {
			
			return Main.CARACTER_HORIZONTAL;
		}
	
	}
	
	/**
	Metodo para para obtener el valor para el segmento horizontal 1 en base al numero a procesar
	@param number   Numero a procesar
	@return Caracter
	@throws
	**/
	
	private static String getValueSeg1For(int number) {
		
		if ((number == 0) || (number == 1) || (number == 7)){
			
			return " ";
		}else {
			
			return Main.CARACTER_HORIZONTAL;
		}
	
	}

	/**
	Metodo para para obtener el valor para el segmento horizontal 2 en base al numero a procesar
	@param number   Numero a procesar
	@return Caracter
	@throws
	**/
	
	private static String getValueSeg2For(int number) {
	
	if ((number == 1) || (number == 4) || (number == 7)){
		
		return " ";
	}else {
		
		return Main.CARACTER_HORIZONTAL;
	}

}
	

}
