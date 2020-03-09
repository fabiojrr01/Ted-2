package Model;

import java.util.ArrayList;
import java.util.Collection;
import static java.time.Clock.system;

public class Cliente {
    private static final String Tipo = null;
	private String nome;
    
    public Cliente(String nome) {
    	this.nome=nome;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
	public void adicionaAluguel(Aluguel aluguel) {
        Fita.add(aluguel);
    }

    public String extrato(Iterable<Aluguel> Fita) {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

        for (Aluguel f : Fita) {

            double valorCorrente = 0.0;
            Aluguel cada = f;

            // determina valores para cada linha
            // switch com enum
            switch (cada.getFita().codigodePreco()) {
            case normal:
                valorCorrente += 2;
                if (cada.getDiasAlugada() > 2) {
                    valorCorrente += (cada.getDiasAlugada() - 2) * 1.5;
                }
                break;
            case lancamento:
                valorCorrente += cada.getDiasAlugada() * 3;
                break;
            case infantil:
                valorCorrente += 1.5;
                if (cada.getDiasAlugada()() > 3) {
                    valorCorrente += (cada.getDiasAlugada() - 3) * 1.5;
                }
                break;
            } // switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lançamento por pelo menos 2
            // dias
            if (cada.getFita().getcodigodePreco() == Tipo.lancamento && cada.getdiasAlugada()> 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este aluguel
            resultado += "\t" + cada.getFita().getTitulo() + "\t"
                         + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } // while
        // adiciona rodapé
        
        
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente";
        return resultado;
    }
    
}

}