package Taller1;

public class InverseFasta {

	public StringBuilder cadena= new StringBuilder();
	String linea,aux="";
	public InverseFasta(){
		
	}
	public void fas(String linea){
		this.linea=linea;
		
		//System.out.println(linea);
		if(linea.charAt(0)=='>'){
			cadena.append(linea.substring(1,linea.length())+"\n");
		
		}else{
			for (int i = 0; i < linea.length(); i++) {
				
				aux+=invertir(linea.charAt(i));
				//System.out.println(aux);
			}
			//System.out.println(aux);
			cadena.append(aux+"\n");
		}
	}
	public String getCadena(){
		//System.out.println(cadena.substring(1,cadena.length()));
		return cadena.toString();
	}
	public char invertir(char c){
		if(c=='T' || c=='U')
			return 'A';
		else if (c=='A')
			return 'T';
		else if (c=='C')
			return 'G';
		else if (c=='G')
			return 'C';
		else
			return c;
	}
}
