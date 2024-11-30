package programs;

import java.util.Arrays;
import java.util.List;

public class Programa1 {

	public static void main(String[] args) {
		/* List<Object> não é o supertipo de qualquer tipo de lista:
			List<Object> myObjs = new ArrayList<Object>();
			List<Integer> myNumbers = new ArrayList<Integer>();
			myObjs = myNumbers; // erro de compilação
			
		   O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
			List<?> myObjs = new ArrayList<Object>();
			List<Integer> myNumbers = new ArrayList<Integer>();
			myObjs = myNumbers;*/
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}
			
	
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
