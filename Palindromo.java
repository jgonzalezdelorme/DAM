public class Palindromo{
	
	//Atributos
	
	private String palabra1;
	//Constructor
	
	public Palindromo(String p1){
		this.palabra1=p1;
	}
	
	//Métodos
	
	public void comprobarPalindromo(){
		//Lo primero es quitar los espacios iniciales y al final de la cadena
		this.palabra1=palabra1.trim();
		//Despues los intermedios
		this.palabra1=palabra1.replace(" ","");
		//Defino una variable de método inicializada palabra invertida
		//Nota: Las variables de método no son compatibles con this.
		String palabraInvertida = "";
		//Creo bucle for que construirá palabrainvertida caracter a caracter
		for(int i = palabra1.length()-1; i>=0; i--){
			palabraInvertida=palabraInvertida+this.palabra1.charAt(i);
		}
		//Declaro otra variable de método booleana para comprobar
		// ignorando las mayúsculas si coinciden ambas palabras
		boolean respuesta=this.palabra1.equalsIgnoreCase(palabraInvertida);
		//Creo una estructura condiconal que evalue por pantalla lo anterior
		if(respuesta){
			System.out.println(this.palabra1+" es un palíndromo");
		}else{
			System.out.println(this.palabra1+" no es un palíndromo");
		}
	}
	
	
	
}

