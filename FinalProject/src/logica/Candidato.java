package logica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Candidato {
private String nombreyApellido,especializacion,CI;
private int annosexp;
private NivelEscolaridad<String, Integer> escolaridad;
private boolean datosAd;
private String registroDatosAD;
public Candidato(String nombreyApellido,String escolaridad,String especializacion,String CI,int annosexp,Integer level){
	setNombreyApellido(nombreyApellido);
	setEspecializacion(especializacion);
	setCI(CI);
	setAnnosexp(annosexp);
	setRegistroDatosAD(registroDatosAD);
	this.escolaridad = new NivelEscolaridad<String, Integer>(escolaridad,level);
}
public String getNombreyApellido() {
	return nombreyApellido;
}
public boolean validarLetra(String nombreyApellido1)
{
	String regx = "[a-zA-Z]+\\.?";
	Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	Matcher matcher = pattern.matcher(nombreyApellido1);
	return matcher.find();
}	
public void setNombreyApellido(String nombreyApellido) 
    {
		boolean found = validarLetra(nombreyApellido);
		if (found == true)
			this.nombreyApellido = nombreyApellido;	
	}

public String getEspecializacion() {
	return especializacion;
}
public void setEspecializacion(String especializacion) {
	this.especializacion = especializacion;
}
public int getAnnosexp() {
	return annosexp;
}
public void setAnnosexp(int annosexp) {
	if (annosexp > 0)
	this.annosexp = annosexp;
}
public String getCI() {
	return CI;
}
public void setCI(String cI2) {
	CI = cI2;
}
public NivelEscolaridad<String,Integer> getEscolaridad(){
	return escolaridad;
}

public boolean isDatosAd() {
	return datosAd;
}
public void setDatosAd(boolean datosAd) {
  this.datosAd = datosAd;
}
public String getRegistroDatosAD() {
	return registroDatosAD;
}
public void setRegistroDatosAD(String registroDatosAD) {
	this.registroDatosAD = registroDatosAD;
}
}
