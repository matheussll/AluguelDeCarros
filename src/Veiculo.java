
public class Veiculo {
	protected String marca;
	protected String placa;
	protected String modelo;
	protected String cor;
	protected String ano;
	protected String filial;
	protected String km; 
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getFilial() {
		return filial;
	}
	public void setFilial(String filial) {
		this.filial = filial;
	}
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	
/*	Veiculo() {
		this.marca = null;
		this.placa = null;
		this.marca = null;
		this.marca = null;
		this.marca = null;
		this.marca = null;
		this.marca = null;
	}*/
	
	public Veiculo() {
		super();
	}
	
	public Veiculo(String marca, String placa, String modelo, String cor, String ano, String filial, String km) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.filial = filial;
		this.km = km;
	}	
	
}
