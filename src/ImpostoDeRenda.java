
public class ImpostoDeRenda {

	public static void main(String[] args) {

		double salario = 2800.0;
		if (salario < 2500.0) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Voc� pode deduzir at� 350");

		} else if (salario >= 2500.0 && salario <= 3800.0) {
			System.out.println("Sua aliquota � de 18%");
			System.out.println("Voc� pode deduzir at� 500");
		} else {
			System.out.println("Sua aliquota � de 23%");
			System.out.println("Voc� pode deduzir at� 640");
		}
	}

}
