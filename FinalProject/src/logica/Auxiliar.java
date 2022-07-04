package logica;

public class Auxiliar {
private String empresa;
private float porCiento;

public  Auxiliar(String empresa, float porCiento)
{
	setEmpresa(empresa);
	setPorCiento(porCiento);
}
public String getEmpresa() {
	return empresa;
}
public void setEmpresa(String empresa) {
	this.empresa = empresa;
}
public float getPorCiento() {
	return porCiento;
}
public void setPorCiento(float porCiento) {
	this.porCiento = porCiento;
}
}
