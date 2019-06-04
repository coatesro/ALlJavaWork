import static org.junit.Assert.*;

import org.junit.Test;

public class HospitalTest {

	// @Test
	// public void treatPatients() {
	//
	// Hospital hos = new Hospital();
	// assertEquals("treatment patient error", "treatment plan",hos.get );
	// }
	@Test
	public void promoteDoctor() {
		SeniorAdmin seniorAdmin = new SeniorAdmin();
		Doctor d = new Doctor();
		d.setGrade(2);
		seniorAdmin.promoteDoctor(d);
		assertEquals(3, d.getGrade());
	}

	// @Test
	// public void createTeam() {
	// Hospital hos = new Hospital();
	// assertEquals("team creation error","",hos.get);
	// }
	@Test
	public void showInfo() {
		Hospital hos = new Hospital();
		assertEquals("doctor information error", "doctor information displayed", hos.showInfo(""));
		// assertEquals("patient information error", "List of patients info", hos.get);
		// assertEquals("team information error", "List of teams info", hos.get);
	}

	@Test
	public void treatPatients() {
		Hospital hos = new Hospital();
		assertEquals("treatment failure", "treatment applied to patient", hos.treatPatients());
	}
	

}
