package Adapter3;

import java.io.IOException;

public interface FileIO {
	public void readFromFile(String filename) throws IOException;
	public void writreFromFile(String filename) throws IOException;
	public void setValue(String key,String value);
	public void getValue(String key);

}
