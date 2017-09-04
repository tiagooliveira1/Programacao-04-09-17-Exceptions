package opet.aulatds171a.objetos;

import opet.aulatds171a.exceptions.SaldoInsuficienteException;
import opet.aulatds171a.exceptions.SaldoInsuficientePoupancaException;

public class ClasseA {
	
	public double divisao(int i, int j) throws IllegalAccessException {
		if(j==0) 
		{
			throw new IllegalArgumentException("Não é permitido divisão por zero");
		}
		
		return i / j;
			
	}
	
	public double sacar(double valor) throws SaldoInsuficienteException {
		if(valor > 1000) 
		{
			throw new SaldoInsuficienteException();
		}
		
		return valor;
			
	}
	
	public double sacarPoupanca(double valor) throws SaldoInsuficientePoupancaException {
		if(valor > 1000) 
		{
			throw new SaldoInsuficientePoupancaException();
		}
		
		return valor;
			
	}
	

}
