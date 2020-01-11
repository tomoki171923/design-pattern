package Adapter3;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("./src/Adapter3/file.txt");
			System.out.println(f);
			f.setValue("year", "2004");
			f.setValue("mounth", "4");
			f.setValue("day", "21");
			System.out.println(f);
			f.writreFromFile("./src/Adapter3//nextfile.txt");
		}catch (IOException e){
			e.printStackTrace();
		}

	}

}
