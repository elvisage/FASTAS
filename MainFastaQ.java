package Taller1;
import java.io.*;
import java.util.*;

public class MainFastaQ {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		FastaQ f = new FastaQ();
		while( (linea=bf.readLine())!=null && !linea.equals("")){
			f.fas(linea);
		}
		System.out.println(f.getCadena());
		
	
	}

}
