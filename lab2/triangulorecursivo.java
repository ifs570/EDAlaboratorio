public class triangulorecursivo{

	public static void main(String[] args) {
		TrianguloRecursivo(	5, "*");

	}
	
	public static void TrianguloRecursivo(int base, String cad) {
		
		if (base > 0) {
				System.out.println(cad);
				cad += "*";
				TrianguloRecursivo(base-1, cad);
		}
		
	}

}
