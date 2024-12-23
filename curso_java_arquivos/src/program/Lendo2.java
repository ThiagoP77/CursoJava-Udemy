package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lendo2 {

	public static void main(String[] args) {
			String path = "C:\\Users\\Thiag\\OneDrive\\Documentos\\BIO\\cu.txt";
			BufferedReader br = null;
			FileReader fr = null;
			try {
				fr = new FileReader(path);
				br = new BufferedReader(fr);
				String line = br.readLine();
				while (line != null) {
					System.out.println(line);
					line = br.readLine();
				}
			} 
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			} 
			finally {
				try {
					if (br != null)
						br.close();
					if (fr != null)
						fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

	}

}
