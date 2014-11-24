public class Vocales{
	
	public String palabra;
	
	public Vocales(String palabra){
		this.palabra = palabra;
		}
	
	
	public int numeroVocales(String palabra){
		int contador = 0;
		for (int i=0; i<palabra.length();i++){
			String letra = palabra.substring(i,i+1);
			if (!(letra.contains("a") || 
			letra.contains("e") || 
			letra.contains("i") || 
			letra.contains("o") || 
			letra.contains("u") )){
				continue;
			}
			contador++;
		}
		
		return contador;
	}
	
}
