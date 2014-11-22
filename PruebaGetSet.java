public class PruebaGetSet{
	
	//Declaración de atributos
	//Attributes deffinition
	
	private int valNum; //Representa un valor numérico
				//Represents a numeric value
				
	private String valText; //Representa un valor de texto
					//Represents a text value
	
	//Métodos|Methods Get & Set
	
	/*Nota: Para acceder a variables/atributos privados no podemos 
	 * usar constructores, es el momento de emplear métodos Get y Set*/
	/*Memo: To access to private var/attributes we can't use 
	 * constructors, it's time to implements Get & Set Methods*/
	
			//GETTERS
	 
	public int getValNum(){
		return this.valNum;
		}
	
	public String getValText(){
		return this.valText;
		}
	
			//SETTERS
	
	public void setValNum(int num){
		this.valNum = num;
		}
	
	public void setValText(String text){
		this.valText = text;
		}
	
	}
