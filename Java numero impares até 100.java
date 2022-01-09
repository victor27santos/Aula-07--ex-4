class JavaExemplo {
   public static void main(String args[]) {
	int n = 100;
	System.out.print("Números ímpares de 1 a "+n+" são: ");
	for (int i = 1; i <= n; i++) {
	   if (i % 2 != 0) {
		System.out.print(i + " ");
	   }
	}
   }
}