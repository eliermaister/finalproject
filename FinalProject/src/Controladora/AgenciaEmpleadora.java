package Controladora;

import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import Auxiliar.Inicializador;
import logica.Auxiliar;
import logica.Auxiliar1;
import logica.Auxiliar2;
import logica.Candidato;
import logica.Citas;
import logica.Empresa;
import logica.OfertaLaboral;
import logica.Sector;
import logica.Usuario;

public class AgenciaEmpleadora
{
	private static AgenciaEmpleadora agencia;
	
	private AgenciaEmpleadora(){
		usuario = Inicializador.inicializarUsuario();
		sectores = Inicializador.inicializarSectores();
		
		
	}
	
	public static AgenciaEmpleadora getAgenciaEmpleadora(){
		if(agencia == null){
			agencia = new AgenciaEmpleadora();
		}
		
		return agencia;
	}
	
	private Usuario usuario;
	
	private ChronoLocalDate fecha;
	private ArrayList<Citas> citas = new ArrayList<Citas>();
	private ArrayList<Sector> sectores = new ArrayList<Sector>();
	private ArrayList<Empresa> empresas = new ArrayList<Empresa>();
	private ArrayList<Object> registroMensual = new ArrayList<Object> ();//Crear una lista de listas que contenga la informacion de las clases oferta laboral y citas asociadas a cada oferta

	/*
	 * Get and Set
	 */
	
	
	
	
	public Usuario getUsuario() {
			return usuario;
		}

	public ArrayList<Sector> getSectores() {
		return sectores;
	}

	public void setSectores(ArrayList<Sector> sectores) {
		this.sectores = sectores;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static AgenciaEmpleadora getAgencia() {
		return agencia;
	}

	public static void setAgencia(AgenciaEmpleadora agencia) {
		AgenciaEmpleadora.agencia = agencia;
	}

	public ChronoLocalDate getFecha() {
		return fecha;
	}

	public void setFecha(ChronoLocalDate fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Citas> getCitas() {
		return citas;
	}

	public void setCitas(ArrayList<Citas> citas) {
		this.citas = citas;
	}

	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(ArrayList<Empresa> empresas) {
		this.empresas = empresas;
	}

	public ArrayList<Object> getRegistroMensual() {
		return registroMensual;
	}

	public void setRegistroMensual(ArrayList<Object> registroMensual) {
		this.registroMensual = registroMensual;
	}
	
	/*
	 * Function
	 */
	
	public boolean login(String user, String pass){
		return usuario.login(user, pass);
	}
	
	public boolean nuevoSector(String nuevo){
		boolean creado = false;
		boolean existe = false;
		
		Iterator<Sector> it = sectores.listIterator();
		
		int idUltimo = -1;
		
		while(!existe && it.hasNext()){
			Sector aux = it.next();
			idUltimo = aux.getId();
			if(aux.getSector().equals(nuevo)){
				existe = true;
			}
		}
		
		if(!existe){
			sectores.add(new Sector(idUltimo +1, nuevo));
			creado = true;
		}
		
		return creado;
	}
	
	
	
/*
public void revisarListaEspera(String nameEmpresa,ArrayList <Candidato> bolsa)//varios candidatos para una oferta
  {
	boolean found = false;
	for(int i=0;i<empresas.size() && !found ;i++)
	{
		Empresa e=empresas.get(i);
	    if(e.getName().equalsIgnoreCase(nameEmpresa))
	    {
	    	found = true;
	    	OfertaLaboral o = e.setOferta()//lo q obtengo de la interfaz;
	    	for(int j =0;j<bolsa.size();j++)
	    	{
	    		Candidato b= bolsa.get(j);
	    		if((b.getAnnosexp() >= o.getCantannos() && (b.getEscolaridad().getValue() >= o.getNivelReq().getValue())&& (o.getPlazas()!=0)&&(b.getEspecializacion().equalsIgnoreCase(o.getEsp()) && (b.isDatosAd() == true))))//si el candidato cumple con los requisitos
	    		{
	    		Citas cita = new Citas(fecha,b.getNombreyApellido(),b.getCI(),o.getNombre(),o.getEmpresa());//crear la cita
				int cant = o.getCantCitas();
				o.setCantCitas(cant ++);//aumentar la cant de citas concedidas para esa oferta
			    citas.add(cita);//guardar la cita en el ArrayList
	    		}
	    	}
	    }
	}
  }
public void aggEmpresa(String nombre,String direccion,String sector,String telefono,ArrayList<OfertaLaboral> ofertaLaboral,ArrayList<Candidato> candidatos)
{
	Empresa empresa = new Empresa();//poner los valores que se obtienen de la interfaz
	empresas.add(empresa);
	
}
public void quitarEmpresa(String nameEmpresa)
{
	 for(int i=0;i<empresas.size();i++) 
	 {
		Empresa e=empresas.get(i);
		if(e.getNombre().equalsIgnoreCase(nameEmpresa))
			empresas.remove(e);
	 }
}
//Reportes
//empresa que genero un mayor por ciento de ofertas o mayor cant de empleos(devolver por ciento y la empresa)
//ofertas mas solicitadas(ofertas con mayor cantidad de citas)
	public Auxiliar EmpresaMayorPorCientoOfertas(ArrayList <OfertaLaboral> ofertaLaboral)
	{
	 int total = empresas.get(0).getOfertaLaboral().size(), mayor = total;
	 String empresa = empresas.get(0).getNombre();
	for(int i=1;i < empresas.size();i++)
	{
	 total = empresas.get(i).getOfertaLaboral().size();//cant de ofertas de una empresa
	 if(mayor < total)
	 {
		 mayor = total;
		 empresa = empresas.get(i).getNombre();
	 }
	}
	  float porCiento = (mayor * 100) / total;
	  Auxiliar aux = new Auxiliar(empresa,porCiento);
	  return aux;
	}	
	
	public Auxiliar1 OfertaMasSolicitada(ArrayList <OfertaLaboral> ofertaLaboral)
	{
		int cant = 0;
		int mayor = 0;
		int mayorTotal = 0;
		String oferta= empresas.get(0).getOfertaLaboral().get(0).getNombre();
		String empresa;
		for(int i=0;i<empresas.size();i++)
		{
		 Empresa e = empresas.get(i); 
		  for(int j=0;j<e.getOfertaLaboral().size();j++)
		  {
			OfertaLaboral o = ofertaLaboral.get(i);
			if(mayor<o.getCantCitas())//oferta con mayor cantidad de citas de UNA empresa
			mayor = o.getCantCitas();
			if(mayorTotal < mayor)
			{
				mayorTotal = mayor;
			    oferta = o.getNombre();//oferta con mayor cantidad de citas de todas
			    empresa = o.getEmpresa();
			}
		  }
		}
		 Auxiliar1 aux1 = new Auxiliar1(empresa,mayorTotal,oferta);
		  return aux1;
	}

	public ArrayList<Auxiliar2> ListaDeListas1()
	{
		ArrayList <Auxiliar2> aux = new ArrayList <Auxiliar2> ();
		for(int i = 0;i < empresas.size();i++)
		{
			Empresa a = empresas.get(i);
			String sector = a.getSector();
			String nombreEmpresa = a.getNombre();
			int total = a.getOfertaLaboral().size();
			Auxiliar2 auxi= new Auxiliar2(sector,nombreEmpresa,total);
			aux.add(auxi);
		}
		return aux;
		
	}
	public ArrayList<Auxiliar2> ListaDeListas2()
	{
		ArrayList <Auxiliar2> aux = new ArrayList <Auxiliar2> ();
		for(int i = 0;i < empresas.size();i++)
		{
			Empresa a = empresas.get(i);
			String sector = a.getSector();
			String nombreEmpresa = a.getNombre();
			int total = a.getCandidatos().size();
			Auxiliar2 auxi= new Auxiliar2(sector,nombreEmpresa,total);
			aux.add(auxi);
		}
		
		return aux;
		
	}
	
	*/
}

