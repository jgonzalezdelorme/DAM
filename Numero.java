import java.util.Random;
public class Numero{
	//Atributos
	private int numero;
	
	public Numero(int n){
		this.numero=n;
	}
	
	public int numeroADescubrir(){
		int numeroADescubrir=0;
		for (int i=0; i<1000;i++){
			if (this.numero==i){
				numeroADescubrir=i;
				break;
			}
		System.out.println("Dentro del Bucle: "+i);
		}
		
		return numeroADescubrir;
	}
	
}
class TestNumeroAleatorio{
	public static void main(String[] args){
		 
		Random r1 = new Random();
		 
		Numero n1 = new Numero(5);
		 
		 int numero = r1.nextInt(1000);
		 int numeroADescubrir = n1.numeroADescubrir();
		 

		 
		 System.out.println("Numero Aleatorio: "+numero);
		 System.out.println("Numero a descubrir: "+numeroADescubrir);
		}
	}
	
	

