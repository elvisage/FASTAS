package Taller1;

public class Fasta {
	public StringBuilder cadena= new StringBuilder();
	String linea;
	public Fasta(){
		
		
	}
	public void fas(String linea){
		this.linea=linea;
		
		//System.out.println(linea);
		if(linea.charAt(0)=='>'){
			cadena.append(linea.substring(1,linea.length())+"\n");
		
		}else{
			cadena.append(linea+"\n");
		}
	}
	public String getCadena(){
		//System.out.println(cadena.substring(1,cadena.length()));
		return cadena.toString();
	}
}
