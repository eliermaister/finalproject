package logica;

public class Auxiliar2 {
private String sector;
private String nombreEmpresa;
private int total;

public Auxiliar2(String sector,String nombreEmpresa, int total)
{
	setSector(sector);
	setNombreEmpresa(nombreEmpresa);
	setTotal(total);
}


public String getSector() {
	return sector;
}

public void setSector(String sector) {
	this.sector = sector;
}

public String getNombreEmpresa() {
	return nombreEmpresa;
}

public void setNombreEmpresa(String nombreEmpresa) {
	this.nombreEmpresa = nombreEmpresa;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}
}
