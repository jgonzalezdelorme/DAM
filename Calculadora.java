public class Calculadora{
	
	private double numero1, numero2;
	private String operacion; //div, x, sum.
	private double result;
	/*
	//Getters
	
	public double getNumero1(){
		return this.numero1=num1;
	}
	
	public double getNumero2(){
		return this.numero2=num2;
	}
	
	public String getOperacion(){
		
	}
	 
	//Setters
	
	public void setNumero1(double){
		
		}
	
	*/
	
	public Calculadora(double n1, double n2, String op){
		this.numero1=n1;
		this.numero2=n2;
		this.operacion=op;
	}
	
	public void resultado(){
		switch(this.operacion){
			case "div":
				this.result=this.numero1/this.numero2;
				break;
				
			case "x":
				this.result=this.numero1*this.numero2;
				break;
			
			case "sum":
				this.result=this.numero1+this.numero2;
				break;
			
			case "men":
				this.result=this.numero1-this.numero2;
				break;
				
			case "mod":
				this.result=this.numero1%this.numero2;
				break;
			
			default :
				System.out.println("Las operaciones permitidas son: div, x, sum, men y mod");
				break;
		}
			//Getter para resultado
	}		
		public double getResult(){
			return this.result;
		}
	
}
class TestCalculadora{
	public static void main(String[] args){
		Calculadora c1 = new Calculadora(10, 2, "div");
		c1.resultado();
		System.out.println(+c1.getResult());
		Calculadora c2 = new Calculadora(10, 2, "x");
		c2.resultado();
		System.out.println(+c2.getResult());
		Calculadora c3 = new Calculadora(10, 2, "sum");
		c3.resultado();
		System.out.println(+c3.getResult());
		Calculadora c4 = new Calculadora(10, 2, "men");
		c4.resultado();
		System.out.println(+c4.getResult());
		Calculadora c5 = new Calculadora(10, 2, "mod");
		c5.resultado();
		System.out.println(+c5.getResult());
	}
}	

