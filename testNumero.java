class testNumero{
	//Método principal
	public static void main(String[] args){
		
		//Creación de objetos
		Pares p1 = new Pares(7);
		Pares p2 = new Pares(70);
		
		
		//Impresión por pantalla de llamadas
		System.out.println("b1: "+p1);
		System.out.println("b2: "+p2);
		
		//Duda: ¿Por qué no hay llamadas a métodos?
		//Respuesta: Por que llama al método to String que es nativo de java al imprimir por pantalla y ha sido anteriormente sobreescrito
		
		}
	
	}
