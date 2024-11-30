package banco;

public class ContaCorrente implements Banco{
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	
	public void sacar( ) {
		
	}
	
	public void depositar( ) {
			
	}
	
	public void transferir( ) {
		
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	


}
