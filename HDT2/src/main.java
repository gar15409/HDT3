

public class main {

	
	public static void main(String[] args) {
		
		Calculadora texto = new Calculadora();
		
		texto.Calcular(texto.LeerArchivo("C:\\Users\\usuario1\\git\\HDT2\\src\\ejemplo.txt"));
		
		System.out.println(texto.Calcular(texto.LeerArchivo("C:\\Users\\usuario1\\git\\HDT2\\src\\ejemplo.txt")));
		
	}
}
