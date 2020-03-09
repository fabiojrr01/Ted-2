package Model;
public class tipo {
	private String Normal;
	private String lancamento ;
	private String infantil ;
	
  
public tipo (String Normal, String lancamento, String infantil) {
	this.Normal = Normal;
	this.lancamento=lancamento;
	this.infantil=infantil;
}


public String getNormal() {
	return Normal;
}


public void setNormal(String normal) {
	Normal = normal;
}


public String getLancamento() {
	return lancamento;
}


public void setLancamento(String lancamento) {
	this.lancamento = lancamento;
}


public String getInfantil() {
	return infantil;
}


public void setInfantil(String infantil) {
	this.infantil = infantil;
}
	
	
}
