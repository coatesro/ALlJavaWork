
public class Patients {
	private String name;
	private int pId;
	private int ward;
	private int team;
	
	public Patients(String name ,int id, int ward, int team) {
		this.ward = ward;
		this.name = name;
		this.pId = id;
		this.team = team;
	}
	public int getWard() {
		return ward;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return pId;
	}
	public int getTeam() {
		return team;
	}

}
