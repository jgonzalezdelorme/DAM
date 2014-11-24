public class BucleWhile{
	
	private int numero;
	
	public BucleWhile(int n){
		this.numero=n;
		}
	
	public int sumar(){
		int suma=0;
		int contador=1;
		while(contador <= this.numero){
			System.out.println("Suma vale: "+suma+"\t");
			suma=contador;
			contador++;
			}
		System.out.println("Fuera del bucle contador vale: "+contador+"\t+"+"suma vale: "+suma);
		return suma;
		}
	
	public int sumarDoWhile(){
		int suma=0;
		int contador=1;
		do{
			System.out.print("Suma vale: "+suma+"\t");
			System.out.print("Contador vale: "+contador+"\n");
			}while(contador<=this.numero);

		}
	class TestBucleWhile{
		public static void main(String[] args){

		BucleWhile b1 = new BucleWhile(3);
		int suma1=b1.sumar();
		System.out.println("la suma es: "+suma1);
		}
	}
}
