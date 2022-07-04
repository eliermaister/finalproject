package logica;

public class Usuario {
	private String usuario;
	private String contrasenia;
	
	public Usuario(String usuario, String contrasenia) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}
	
	public boolean login(String user, String contrasenia){
		boolean correcto = false;
			
		if(this.usuario.equals(user) && this.contrasenia.equals(contrasenia))
			correcto = true;
		
		return correcto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	

}
