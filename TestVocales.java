public class TestVocales{
	public static void main(String[] args){
		Vocales v1 = new Vocales("murcielago");
		
		int numeroVocales = v1.numeroVocales("murcielago");
		System.out.println("La palabra "+v1.palabra+" contiene "+numeroVocales+" vocales");
	}
	
	//Nota: El uso de constructores no permite 
	//      la llamada de atributos privados.
	
	//De haber tenido que declarar palabra private
	//tendría que haver usado un guetter (GetPalabra)
	
	
}
