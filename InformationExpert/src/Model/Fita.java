package Model;

public class Fita{

static void add(Aluguel aluguel) {
    throw new UnsupportedOperationException("");}


 private String titulo;
 private String codigodePreco;


public Fita (String titulo ,String codigodePreco) {
	this.codigodePreco=codigodePreco;
	this.titulo=titulo;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getCodigodePreco() {
	return codigodePreco;
}

public void setCodigodePreco(String codigodePreco) {
	this.codigodePreco = codigodePreco;
}}

