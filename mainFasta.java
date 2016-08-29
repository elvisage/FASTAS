package Taller1;
import java.io.*;
public class mainFasta {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		Fasta f = new Fasta();
		while( (linea=bf.readLine())!=null && !linea.equals("")){
			f.fas(linea);
		}
		System.out.println(f.getCadena());
		
	
		
	}
	
	
	
}


