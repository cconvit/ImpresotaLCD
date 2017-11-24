package co.com.psl.LCDPrinter;

/*
 * Clase para obtener todos los segmentos tanto horizontales como verticales de un numero
 */

public class PrintNumber {

	private int number;
	private int size;
	
	public PrintNumber(int number,int size) {
		
		this.number = number;
		this.size = size;
	}
	
	/**
	Metodo para obtener la cadena de caracters para el segmento 0 Horizontal
	@return Segmento Horizontal
	@throws
	**/
	
	public String getHorizontalSegment0For() {
		
		if (this.number == 1) {
			
			return this.fillSegmentForNumberOne(" ");
		}

		String p00 = Pivot.getValueFor(PivotType.P00, this.number);
		String p01 = Pivot.getValueFor(PivotType.P01, this.number);
		String fillCharacter = Segment.getValueForHorizontal(SegmentType.Seg0, this.number);
		
		return this.fillSegment(p00, p01, fillCharacter);
	}
	
	/**
	Metodo para obtener la cadena de caracters para el segmento 1 Horizontal
	@return Segmento Horizontal
	@throws
	**/
	
	public String getHorizontalSegment1For() {
		
		if (this.number == 1) {
			
			return this.fillSegmentForNumberOne(Main.CARACTER_VERTICAL);
		}
		
		String p10 = Pivot.getValueFor(PivotType.P10, this.number);
		String p11 = Pivot.getValueFor(PivotType.P11, this.number);
		String fillCharacter = Segment.getValueForHorizontal(SegmentType.Seg1, this.number);
		
		return this.fillSegment(p10, p11, fillCharacter);
	}
	
	/**
	Metodo para obtener la cadena de caracters para el segmento 2 Horizontal
	@return Segmento Horizontal
	@throws
	**/
	
	public String getHorizontalSegment2For() {
		
		if (this.number == 1) {
			
			return this.fillSegmentForNumberOne(Main.CARACTER_VERTICAL);
		}

		String p20 = Pivot.getValueFor(PivotType.P20, this.number);
		String p21 = Pivot.getValueFor(PivotType.P21, this.number);
		String fillCharacter = Segment.getValueForHorizontal(SegmentType.Seg2, this.number);
		
		return this.fillSegment(p20, p21, fillCharacter);
	}

	/**
	Metodo para obtener la cadena de caracters para el segmento 0 Vertical
	@return Segmento Vertical
	@throws
	**/
	
	public String getVerticalSegment0For() {
		
		if (this.number == 1) {
			
			return this.fillSegmentForNumberOne(Main.CARACTER_VERTICAL);
		}

		String p10 = Pivot.getValueFor(PivotType.P10, this.number);
		String p11 = Pivot.getValueFor(PivotType.P11, this.number);
		String fillCharacter = " ";
		return this.fillSegment(p10, p11, fillCharacter);
	}
	
	/**
	Metodo para obtener la cadena de caracters para el segmento Vertical 
	@return Segmento Vertical
	@throws
	**/
	
	public String getVerticalSegment1For() {
		
		if (this.number == 1) {
			
			return this.fillSegmentForNumberOne(Main.CARACTER_VERTICAL);
		}

		String p20 = Pivot.getValueFor(PivotType.P20, this.number);
		String p21 = Pivot.getValueFor(PivotType.P21, this.number);
		String fillCharacter = " ";
		
		return this.fillSegment(p20, p21, fillCharacter);
	}
	
	/**
	Metodo para rellenar con el caracter especial de cada segmento
	@return Cadena de caracteres
	@throws
	**/
	
	private String fillSegment(String start,String end,String fillCharacter) {
		
		String value = start;
		
		for(int x = 0; x < this.size ; x++) {
			
			value += fillCharacter;
			
			if (x != this.size - 1) {
				value += " ";
			}

		}
		
		value += end;
		return value;
	}
	
	private String fillSegmentForNumberOne(String character) {
		
		String value = "";
		int characterPosition = (int) Math.ceil((double)this.size / 2);
		
		
		for(int x = 0; x < this.size + 2 ; x++) {
			
			if(x == characterPosition) {
				
				value += character;
			}else {
				value += " ";
			}
			
			if (x != this.size + 1) {
				value += " ";
			}

		}

		return value;
	}
	

	
	
	 
	
}
