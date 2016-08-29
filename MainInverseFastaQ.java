package Taller1;

import java.util.*;
import java.io.*;

public class MainInverseFastaQ {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		InverseFastaQ f = new InverseFastaQ();
		while( (linea=bf.readLine())!=null && !linea.equals("")){
			f.fas(linea);
		}
		System.out.println(f.getCadena());
	}

}
