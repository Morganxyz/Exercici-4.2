import java.util.Scanner;

public class M4Ex2_DanielAmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables:
		int edat = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quina és la teva edat?: ");
		edat = entrada.nextInt();
		
		if (edat <= 5) {
			System.out.println("Preescolar");
		}
		else if (edat >= 5 && edat <=11) {
			System.out.println("Primària");
		}
		else if (edat >= 12 && edat <=15) {
			System.out.println("ESO");
		}
		else if (edat >= 16 && edat <=17) {
			System.out.println("Batxillerat");
		}
		else if (edat >= 18) {
			System.out.println("FP o Universitat");
		}
		
	}

}
