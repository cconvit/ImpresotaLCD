package co.com.psl.LCDPrinter;

public class Operation {

	private String task;
	public Boolean exit;
	
	public Operation(String task) {
		
		this.task = task;
		this.exit = false;
	}
	
	/**
	Metodo para procesar la operacion del usuario y poder determinar las sub tareas
	@param 
	@throws
	**/
	
	public void process() {
		
		String[] commands = task.split(" ");
		
		//Iteramos sobre el task
		for(int i = 0; i < commands.length ; i ++) {
			
			//Verificamos que el comando tenga la minima longitud valida
			if(commands[i].length() > 2) {
				
				String command = commands[i];
				this.processCommand(command);
			}
		}
		
	}
	
	/**
	Metodo para procesar una subtarea (command)
	@param command
	@throws
	**/
	
	private void processCommand(String command) {
		
		try {
			String[] param = command.split(",");
			
			//Verificamos que el comando tenga solo 2 parametros
			if(param.length == 2) {
				
				int size = Integer.parseInt(param[0]);
				String seq = param[1];
				
				if ((size != 0) && (seq != "0")) {
					PrintNumbers printer = new PrintNumbers(seq,size);
					printer.print();
				}else {
					this.exit = true;
				}
			}
		}catch(NumberFormatException nfe) {
			
			//No se procesa el comando que no sea valido
		}
		
	}
}
