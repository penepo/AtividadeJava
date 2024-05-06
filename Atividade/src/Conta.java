import java.util.Scanner;
import java.util.Date;
public class Conta {
	Scanner sc = new Scanner(System.in);
	
	
	int numero;
	Double saldo;
	Double juros;
	Date vencimento;
	
	
	public int getNumero() {
		return numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getJuros() {
		return juros;
	}

	public Date getVencimento() {
		return vencimento;
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setJuros(Double Juros, Double juros) {
		this.juros = juros;
	}
	
	public void setVencimento(Date vencimentos, Date vencimento) {
		this.vencimento = vencimento;
	}
	 
	public void debito(double valor) {
		this.saldo -= saldo;
	}
	
	public void credito(double valor) {
		this.saldo += valor;
	}
	
}
