package fileio;

import java.io.FileInputStream;

public class DataStreamExample {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("E:\\eclips\\learning space\\DxC_Technical_Training\\src\\fileio\\testout.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}