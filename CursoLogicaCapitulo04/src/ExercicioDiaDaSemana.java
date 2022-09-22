import java.util.Scanner;

public class ExercicioDiaDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número referente ao dia da semana: ");
		Integer diaDaSemana = scanner.nextInt();
		
		String dia;
		
		switch (diaDaSemana ) {
		case 1: dia = "domingo";
			break;
		case 2: dia = "segunda";
			break;
		case 3: dia = "terça";
			break;
		case 4: dia = "quarta";
			break;
		case 5: dia = "quinta";
			break;
		case 6: dia = "sexta";
			break;
		case 7: dia = "sabado";
			break;
			default: dia = "INVÁLIDO";
		}
		
		System.out.println("O dia escolhido foi: " + dia);
		
		scanner.close();
		

	}

}
