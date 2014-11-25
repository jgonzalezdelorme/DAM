import javax.swing.JOptionPane;
class TestPalindromo{
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, "Esto es un detector de paloíndromos, introduce la palabra en el cuadro de texto");
		String palabra = JOptionPane.showInputDialog("Introduce la palabra", "Introduce aquí la palabra");
		Palindromo pal = new Palindromo(palabra);
		pal.comprobarPalindromo();
	}
}
