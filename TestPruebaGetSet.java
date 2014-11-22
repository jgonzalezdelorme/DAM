public class TestPruebaGetSet{
	
	//Método Principal
	//Main Method
	public static void main(String[] args){
		
		//Creación de objetos
		//Objects Creation
		PruebaGetSet o1 = new PruebaGetSet();
		
		//Modificación de valores mediante Setters
		//Value modiffication using Setters Methods
		o1.setValText("Hola");
		o1.setValNum(999);
		
		//Impresión por pantalla de valores, accediendo a ellos con Getters
		//Value Screen impressing, accessing them whith Getters methods
		System.out.println("Número: "+o1.getValNum());
		System.out.println("Texto; "+o1.getValText());
		
		/*Salida Esperada:
		 * Número: 999
		 * Texto: Hola
		 */
		 
		 /*Speccted Screen Results:
		 * Número: 999
		 * Texto: Hola
		 */
		
	}
}
