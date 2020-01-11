package Adapter3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class FileProperties extends Properties implements FileIO {

	@Override
	public void readFromFile(String filename) throws IOException{
		load(new FileInputStream(filename));

	}

	@Override
	public void writreFromFile(String filename) throws IOException{
		store(new FileOutputStream(filename), "writen by aaa");

	}

	@Override
	public void setValue(String key,String value){
		setProperty(key, value);

	}


	@Override
	public void getValue(String key){
		getProperty(key,"");

	}


}
