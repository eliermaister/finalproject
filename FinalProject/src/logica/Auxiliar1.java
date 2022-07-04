package logica;

public class Auxiliar1 {
	private int mayorTotal;
	private String oferta;
	private String empresa;

	public Auxiliar1(String empresa, int mayorTotal,String oferta)
	{
		setEmpresa(empresa);
		setMayorTotal(mayorTotal);
		setOferta(oferta);
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getOferta() {
		return oferta;
	}

	public void setOferta(String oferta) {
		this.oferta = oferta;
	}

	public int getMayorTotal() {
		return mayorTotal;
	}

	public void setMayorTotal(int mayorTotal) {
		this.mayorTotal = mayorTotal;
	}
	
}
