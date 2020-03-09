package Model;

public class Aluguel {
	
	private String fita;
    private int diasAlugada;

    public Aluguel(String fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

	public String getFita() {
		return fita;
	}

	public void setFita(String fita) {
		this.fita = fita;
	}

	public int getDiasAlugada() {
		return diasAlugada;
	}

	public void setDiasAlugada(int diasAlugada) {
		this.diasAlugada = diasAlugada;
	}

    
}
