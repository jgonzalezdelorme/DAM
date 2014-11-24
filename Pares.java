public class Pares{
	
	//Atributos (Privados)
	private int numero;
	
	/*	Constructor (Inicializa a n para
		tomar el valor parametrizado)
	*/
	Pares(int n){
		this.numero=n;
		}
	
	//Método booleano que comprueba la paridad
	public boolean esPar(){
		return this.numero % 2 == 0;
		}
	
	//Sobreescribe el método toString por que es nativo
	@Override
	public String toString(){
		return "El numero "+this.numero+
		" ¿es par? "+this.esPar();
		
		}
	
	}
	



/*	El Programa devolverá una cadena con los 
	valores booleanos puros implícita en ella
*/
