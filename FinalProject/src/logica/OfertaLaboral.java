package logica;

import interfaz.Validacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OfertaLaboral implements Validacion
{
	private String nombre,esp,reqsAd,empresa;
	private int id,plazas,cantannos; 
	private float salario;
	private NivelEscolaridad<String, Integer> nivelReq;//condicion
	private int cantCitas = 0;
	
	
	
	public OfertaLaboral(String nombre, String esp, String reqsAd,
			String empresa, int id, int plazas, int cantannos, float salario,
			NivelEscolaridad<String, Integer> nivelReq, int cantCitas) {
		super();
		this.nombre = nombre;
		this.esp = esp;
		this.reqsAd = reqsAd;
		this.empresa = empresa;
		this.id = id;
		this.plazas = plazas;
		this.cantannos = cantannos;
		this.salario = salario;
		this.nivelReq = nivelReq;
		this.cantCitas = cantCitas;
	}

	public OfertaLaboral(String nombre,String nivelReq,String esp,int ID,int plazas,float salario,int cantannos,Integer level, String reqsAd){
		setNombre(nombre);
		setEsp(esp);
		setID(ID);
		setPlazas(plazas);
		setSalario(salario);
		setCantannos(cantannos);
		setEmpresa(empresa);
		setReqsAd(reqsAd);
		this.nivelReq = new NivelEscolaridad<String, Integer>(nivelReq,level);
	}
	
	public String getNombre() {
		return nombre;
	}
	public boolean validarLetra(String nombre)
	{
		String regx = "[a-zA-Z]+\\.?";
		Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(nombre);
		return matcher.find();
	}	
	public void setNombre(String nombre) 
	    {
			boolean found = validarLetra(nombre);
			if (found == true)
				this.nombre = nombre;	
		}
	
	public String getEsp() {
		return esp;
	}
	public void setEsp(String esp) {
		this.esp = esp;
	}
	public int getID() {
		return id;
	}
	public void setID(int iD) {
		id = iD;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		if(salario > 0)
		this.salario = salario;
	}
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		if(plazas > 0)
		this.plazas = plazas;
	}
	public int getCantannos() {
		return cantannos;
	}
	public void setCantannos(int cantannos) {
		if(cantannos >= 0 && cantannos < 90)
		this.cantannos = cantannos;
	}
	public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(String empresa) 
	    {
			boolean found = validarLetra(empresa);
			if (found == true)
				this.empresa = empresa;	
		}
	public boolean validarLetra() {
		// TODO Auto-generated method stub
		return false;
	}
	public NivelEscolaridad<String,Integer> getNivelReq(){
		return nivelReq;
	}
	public int getCantCitas() {
		return cantCitas;
	}
	public void setCantCitas(int cantCitas) {
	
	}
	public String getReqsAd() {
		return reqsAd;
	}
	public void setReqsAd(String reqsAd) {
		this.reqsAd = reqsAd;
	}
	
}
