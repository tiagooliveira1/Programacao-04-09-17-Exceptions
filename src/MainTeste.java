import opet.aulatds171a.exceptions.SaldoInsuficienteException;
import opet.aulatds171a.objetos.ClasseA;

public class MainTeste {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		ClasseA classeATeste = new ClasseA();
		
		Double resultado = classeATeste.divisao(10,1);
		
		System.out.println("Resultado:" + resultado);
		
		// testa o sacar
		try {
			System.out.print(classeATeste.sacar(1000));
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
