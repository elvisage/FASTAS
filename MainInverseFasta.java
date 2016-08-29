package Taller1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainInverseFasta {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		InverseFasta f = new InverseFasta();
		while( (linea=bf.readLine())!=null && !linea.equals("")){
			f.fas(linea);
		}
		System.out.println(f.getCadena());
		
	
		
	}

}
