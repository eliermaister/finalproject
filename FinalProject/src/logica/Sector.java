package logica;

public class Sector {
	private int id;
	private String sector;
	
	public Sector(int id, String sector) {
		this.id = id;
		this.sector = sector;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

}
