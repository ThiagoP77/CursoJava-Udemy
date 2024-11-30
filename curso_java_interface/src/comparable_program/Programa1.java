package comparable_program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = "C:\\Users\\Thiag\\OneDrive\\Documentos\\fds.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			
			Collections.sort(list);
			for (String s : list) {
				System.out.println(s);
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
