package inter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ConsoleLogger extends CreateMsg implements Inter{

	
	public ConsoleLogger(String user) {
		super(user);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void info(String message){
		// TODO Auto-generated method stub
		System.out.println(createMsg(message));
	}

	@Override
	public void error(String message){
		// TODO Auto-generated method stub
		System.err.println(createMsg(message));
	}
	
	
	public String getUserName() {
		return this.user;
	}



	
}
