package inter;

public class ConsolePlusFile {
	
	public Inter consoleLogger;
	public InterFile fileLogger;

	public ConsolePlusFile(String user){
		
		this.consoleLogger = new ConsoleLogger(user);
		this.fileLogger =  new FileLogger(user);
		
	}

	

}
