import java.util.HashMap;

public class Doctor {

	private String name;
	private int dId;
	private String type;
	private int grade;
	private boolean partOfTeam;
	private int team;


	public Doctor(String name, int dId, String type, int grade, boolean partOfTeam, int team) {
		this.name = name;
		this.dId = dId;
		this.type = type;
		this.grade = grade;
		this.partOfTeam = partOfTeam;
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public int getDId() {
		return dId;
	}
	public String getType() {
		return type;
	}
	public int getGrade() {
		return grade;
	}
	public boolean getPartOfTeam() {
		return partOfTeam;
	}
	public int getTeam() {
		return team;
	}
	
}
