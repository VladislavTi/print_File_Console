package main;

import java.io.FileNotFoundException;
import java.util.Scanner;

import inter.ConsoleLogger;
import inter.ConsolePlusFile;
import inter.CreateMsg;
import inter.FileLogger;
import inter.Inter;
import inter.InterFile;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String hello = "Hello, ";
		String start = "Enter user name";
		String showString = "Enter string";

		Scanner in = new Scanner(System.in);
		
		System.out.println(start);
		String user = in.nextLine();
		

		ConsolePlusFile all = new ConsolePlusFile(user);
		System.out.println(hello + user + "!");
		String switcher = "logged all";
		
	exit:	while(true) {
			System.out.println(showString);
			String enter = in.nextLine();
			
			switch(enter){
			case "exit":
				switchConsoleFile(all, switcher, enter);
				break exit;
			case "logged console error":
				switcher = enter;
				switchConsoleFile(all, switcher, enter);
				break;
			case "logged console info":
				switcher = enter;
				switchConsoleFile(all, switcher, enter);
				break;	
			case "logged file":
				switcher = enter;
				switchConsoleFile(all, switcher, enter);
				break;
			case "logged all":
				switcher = enter;
				switchConsoleFile(all, switcher, enter);
				break;
			default:
				switchConsoleFile(all, switcher, enter);
			}
		}	
	}

	
	
	public static void switchConsoleFile (ConsolePlusFile where, String flagWhere, String msg) throws FileNotFoundException {	
		String mes = ((CreateMsg) where.consoleLogger).createMsg(msg);
		switch (flagWhere){
		case "logged console error":
			console(where.consoleLogger, mes, flagWhere);
		break;
		case "logged console info":
			console(where.consoleLogger, mes, flagWhere);
		break;
		case "logged file":
			file(where.fileLogger,  mes);
		break;
		case "logged all":
			file(where.fileLogger,  mes);
			console(where.consoleLogger, mes, "logged console info");
		break;
		}
	}
	
	private static void console(Inter consoleLogger, String msg, String errInfo) {
		if (errInfo.equals("logged console error")) {
			consoleLogger.error(msg);
		} else if (errInfo.equals("logged console info")) {
			consoleLogger.info(msg);
		}
		
	}
	
	private static void file(InterFile fileLogger, String msg) throws FileNotFoundException {
		fileLogger.update(msg);
	}
	
	
}
