package GameVersion;

public class Game {
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		System.out.println("Setting the name to game object");
	} 
}
