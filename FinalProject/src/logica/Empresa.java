package logica;

public class Empresa {
	private int id;
	private String nombre;
	private int idSector;
	private String direccion;
	private String telefono;
	
	public Empresa() {
	} 
	
	public Empresa(int id, String nombre, String direccion, int idSector,
			String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.idSector = idSector;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getIdSector() {
		return idSector;
	}

	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	} 
	
	
	
	
	
	
	
	/*
	//, name, nameEmpresa, nameOferta;
	
	
	
	private int cantPlazas;
	private ArrayList<OfertaLaboral> ofertaLaboral = new ArrayList<OfertaLaboral>();
	private ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
	public Empresa(int id, String nombre,String direccion,String sector,String telefono){
		this.setId(id);
		setDireccion(direccion);
		setNombre(nombre);
		setSector(sector);
		setTelefono(telefono);
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	   
	  public void setOferta(String nombre,String nivelReq,String esp,int ID,int plazas,float salario,int cantannos,Integer level, String reqsAd)
	    {
			OfertaLaboral oferta = new OfertaLaboral(nombre,nivelReq,esp,ID,plazas,salario,cantannos,level,reqsAd);//poner los valores que se obtienen de la interfaz
			ofertaLaboral.add(oferta);
			
        }
	  public void quitarOferta(String name,String nameEmpresa)
	  {
		 for(int i=0;i<ofertaLaboral.size();i++) 
		 {
			OfertaLaboral o=ofertaLaboral.get(i);
			if(o.getNombre().equalsIgnoreCase(name) && o.getEmpresa().equalsIgnoreCase(nameEmpresa))
				ofertaLaboral.remove(o);
		 }
	  }
public void quitarPlazaOferta(String nameOferta,String nameEmpresa,int cantPlazas,ArrayList<Empresa>empresas)
{
	for(int i=0;i<empresas.size();i++)
	{
		Empresa e = empresas.get(i);
	 if(nameEmpresa.equalsIgnoreCase(e.getNombre()))
	  {
		for(int j=0;j<ofertaLaboral.size();j++) 
		{
			OfertaLaboral o = ofertaLaboral.get(j);
			if(nameOferta.equalsIgnoreCase(o.getNombre()))
			{
				int CantPlazasActual = o.getPlazas();
				o.setPlazas(CantPlazasActual-cantPlazas);//quitar una o varias plazas de la oferta de trabajo
			}
		}
	  }
	}
}
	
public void agregarPlazaOferta(String nameOferta,String nameEmpresa,int cantPlazas,ArrayList<Empresa>empresas)
{
	for(int i=0;i<empresas.size();i++)
	{
		Empresa e = empresas.get(i);
	 if(nameEmpresa.equalsIgnoreCase(e.getNombre()))
	  {
		for(int j=0;j<ofertaLaboral.size();j++) 
		{
			OfertaLaboral o = ofertaLaboral.get(j);
			if(nameOferta.equalsIgnoreCase(o.getNombre()))
			{
				int CantPlazasActual = o.getPlazas();
				o.setPlazas(CantPlazasActual+cantPlazas);//agregar una o varias plazas de la oferta de trabajo
			}
		}
	  }
	}
}
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameEmpresa() {
		return nameEmpresa;
	}

	public void setNameEmpresa(String nameEmpresa) {
		this.nameEmpresa = nameEmpresa;
	}

	public ArrayList<OfertaLaboral> getOfertaLaboral() {
		return ofertaLaboral;
	}

	public void setOfertaLaboral(ArrayList<OfertaLaboral> ofertaLaboral) {
		this.ofertaLaboral = ofertaLaboral;
	}

	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	public String getNameOferta() {
		return nameOferta;
	}

	public void setNameOferta(String nameOferta) {
		this.nameOferta = nameOferta;
	}

	public int getCantPlazas() {
		return cantPlazas;
	}

	public void setCantPlazas(int cantPlazas) {
		this.cantPlazas = cantPlazas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}*/
}
