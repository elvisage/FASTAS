package Taller1;

public class InverseFastaQ {
	public StringBuilder cadena= new StringBuilder();
	public StringBuilder calidad;
	public String linea,aux="";
	int cont=0;
	static int tam,tam2;
	public InverseFastaQ() {
		
	}

	public void fas(String linea){
		this.linea=linea;
		//System.out.println(cont);
		//System.out.println(linea);
		if(linea.charAt(0)=='@'){
			cont =0;
			tam=0;
			//System.out.println("con "+cont);
			cadena.append(linea.substring(1,linea.length())+"\n");
			
		
		}else{
			if(cont==5 || cont==6){
				//System.out.println("con entra"+cont);
				
			}else{
				for (int i = 0; i < linea.length(); i++) {
					
					aux+=invertir(linea.charAt(i));
					//System.out.println(aux);
				}
				//System.out.println(aux);
				cadena.append(aux+"\n");
				//cadena.append(linea+"\n");
			}
		}
		if(cont==5 || cont==6){
			//System.out.println("tam "+tam);
			//System.out.println("entra");
			String aux=linea;
			if (cont==5) {
				tam=aux.length();
			}
			
			if(tam==aux.length()){		
			/*System.out.println("aux "+aux);
			System.out.println("linea "+linea);*/
			for (int i = 0; i < aux.length(); i++) {
				int a = (int)aux.charAt(i);
				//cadena.append(a);
				if(a==10)
					cadena.append("\n");
				else
					cadena.append(i==(aux.length()-1)?a:a+",");
			}
			
			cadena.append("\n");
			
			
		}else{//System.out.println("cont "+ cont);
		System.out.println(""
				+ "\ntamanos no coinciden");
		System.exit(0);
		
	}
		}
		
		cont++;
		aux="";
		
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
