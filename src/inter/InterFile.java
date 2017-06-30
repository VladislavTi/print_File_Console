package inter;

import java.io.FileNotFoundException;

public interface InterFile {

	
	void write(String text);
	String read() throws FileNotFoundException;
	void update(String newText) throws FileNotFoundException;
	void exists() throws FileNotFoundException;
	
}
