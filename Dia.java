public class Dia{
	
	//Definimos enum llamado Dias
	//Mayus porque el tratamiento es similar a una clase
	
	public enum Dias{
		//por convenio los valores se escriben en mayúsculas
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
		//no se pone ;
		//Ésto define una clase interna llamada  Dia$Dias.java
	}
	
	//Atributos
	private int horasTrabajar; //no lo vamos a usar
	private Dias dia; // definimos un atributo d etipo (enum) Dias
	
	//Constructor
	
	public Dia(Dias d){
		this.dia=d;
	}
	
	public void festivo(){
		switch(this.dia){
			case LUNES: case MARTES: case MIERCOLES: case JUEVES: case VIERNES:
				this.horasTrabajar=8;
				System.out.println(this.dia+" es un día completamente laborable, se trabajan "+horasTrabajar);
				break;
			case SABADO:
				this.horasTrabajar=5;
				System.out.println(this.dia+" es de media jornada se trabajan "+horasTrabajar);
				break;
			default:
				this.horasTrabajar=0;
				System.out.println(this.dia+" es un día festivo se trabajan "+horasTrabajar);
				break;
		}
		
	}
}
class TestDias{
	public static void main(String[] args){
		//creamos objetos
		Dia d1 = new Dia(Dia.Dias.DOMINGO); //domingo esta dentro de la clase interna Dias dentro de la clase Dia
		d1.festivo();
		Dia d2 = new Dia(Dia.Dias.MARTES); //domingo esta dentro de la clase interna Dias dentro de la clase Dia
		d2.festivo();
		Dia d3 = new Dia(Dia.Dias.VIERNES); //domingo esta dentro de la clase interna Dias dentro de la clase Dia
		d3.festivo();
		Dia d4 = new Dia(Dia.Dias.SABADO); //domingo esta dentro de la clase interna Dias dentro de la clase Dia
		d4.festivo();
		
	}
}
