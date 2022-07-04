package logica;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;


public class Citas
{
private ChronoLocalDate fecha;
private Candidato c;//lo q devuelve la interfaz
private String nombreCandidato;
private String candidatoCI;
private String nombreOferta;
private String nombreEmpresa;

public Citas(ChronoLocalDate fecha,String NombreyApellido, String ci, String nombre, String empresa) 
{
	// TODO Auto-generated constructor stub
}

public void AsignarCita(ArrayList<OfertaLaboral> ofertaLaboral,Candidato c,ArrayList<Citas> citas,ArrayList<Empresa>empresas,ArrayList <Candidato> bolsa)
{
	boolean condicion = false;
   if(c instanceof Candidato)//si el objeto es instancia de Candidato(es un candidato)
	{
      for(int i=0;i < empresas.size();i++)
      {
	   for(int j=0;j < empresas.get(i).getOfertaLaboral().size();j++)//examinar las ofertas de cada empresa
	   {
		OfertaLaboral o = ofertaLaboral.get(j);
		if(c.getAnnosexp() >= o.getCantannos() && (c.getEscolaridad().getValue() >= o.getNivelReq().getValue())&& (o.getPlazas()!=0)&&(c.getEspecializacion().equalsIgnoreCase(o.getEsp())) && (c.isDatosAd() == true))//si el candidato cumple con los requisitos
		{
			nombreCandidato = c.getNombreyApellido();
			candidatoCI = c.getCI();
			nombreOferta = o.getNombre();
			nombreEmpresa = o.getEmpresa();
			Citas cita = new Citas(fecha,nombreCandidato,candidatoCI,nombreOferta,nombreEmpresa);//crear la cita
			int cant = o.getCantCitas();
			o.setCantCitas(cant ++);//aumentar la cant de citas concedidas para esa oferta
		    citas.add(cita);//guardar la cita en el ArrayList
		    condicion = true;
		}
	    }
	   if(condicion == true)
	    	  empresas.get(i).getCandidatos().add(c);
       }
     
      if(condicion == false) 
          bolsa.add(c);
		}
}


public void setFecha(ChronoLocalDate fecha,ArrayList<Citas> citas,Candidato c)
{
if(LocalDate.now().compareTo(fecha) >= 0)
{
	 for(int i=0;i<citas.size();i++)
	 {
		if(citas.get(i).getFecha().compareTo(fecha) !=0 || !(citas.get(i).c.getCI().equalsIgnoreCase(c.getCI())))//fechas diferentes o candidatos diferentes
	this.fecha = fecha;
	}
}
}
public String getNombreCandidato()
{
	return nombreCandidato;
}
public String getCandidatoCI()
{
	return candidatoCI;
}
public String getNombreOferta()
{
	return nombreOferta;
}public String getNombreEmpresa()
{
	return nombreEmpresa;
}
public ChronoLocalDate getFecha()
{
	return fecha;
}
}
