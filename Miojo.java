import java.util.Scanner;


public class Miojo {

	/**
	 * @param args
	 * @return 
	 */
	
	public static void main(String[] args) {
		
		String c = "S";
		
		while (c.equals("S")){
			System.out.println("===========================================================================");
			Miojo mj = new Miojo();
			Scanner ler = new Scanner(System.in);
			int m, a1, a2;
			
			System.out.printf("Informe o tempo do Miojo: ");
			m = ler.nextInt();
			System.out.printf("Informe o tempo da Ampulheta 1: ");
			a1 = ler.nextInt();
			System.out.printf("Informe o tempo da Ampulheta 2: ");
			a2 = ler.nextInt();
			if (mj.verificaTempo(m, a1, a2) == true){
				mj.verificaResultado(m, a1, a2);
			}
			System.out.printf("Digite S para repetir e qualquer tecla para sair: ");
			c = ler.next().toUpperCase();
			System.out.println();
		}
		System.out.println("Encerrado !");
	}

	
	public boolean verificaTempo(int m, int a1, int a2){
		boolean result = true;
		if (a1 <= m || a2 <= m) {
			System.out.println("Negado ! O tempo da ampulheta 1 e/ou 2 deve ser maior igual que a do Miojo");
			result = false;
		}
		return result;
	}

	private void verificaResultado(int m, int a1, int a2) {
				
		int prep = 0;
		int tira = 0;
		int total = 0;
		
		 //============ Primeira tentativa começando pela Ampulheta 1
		
			if (a1 > a2){
				prep = a1-a2;
			}else{
				prep = a2-a1;
			}
			tira = a1- prep;
			total = a1+prep+tira;
			
			System.out.println("[Tentativa 1] Tempo total de preparos: " + total);
			System.out.println("Tempo de cozimento: " + tira);
			if (tira==m){
				System.out.println("Parabéns !!! O tempo de preparo coincide com o tempo do miojo");
			}else{
				
				//============ Segunda tentativa começando pela Ampulheta 2

				tira = a2-prep;
				total = a2+prep+tira;
				
				System.out.println("[Tentativa 2] Tempo total de preparos: " + total);
				System.out.println("Tempo de cozimento: " + tira);
				
				if (tira == m){
					System.out.println("Parabéns !!! O tempo de preparo coincide com o tempo do cozimento do miojo");
				}else{
					System.out.println("Não é possivel obter o tempo de cozimento exato com as ampulhetas informadas!");
				}
			}		
	}

}
