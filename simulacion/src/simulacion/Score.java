package simulacion;

public class Score {
	private Team team1;
	private Team team2;
	
	private Number team1Goals;
	private Number team2Goals;
	
	public Score(Team team1, Team team2) {
		this.team1 = team1;
		this.team2 = team2;
		this.team1Goals = 0;
		this.team2Goals = 0;
	}
	
	public void addGoal(Team team) {
		if (team == this.team1) {
			this.setTeam1Goals(this.getTeam1Goals().intValue() + 1);
		} else if (team == this.team2) {
			this.setTeam2Goals(this.getTeam2Goals().intValue() + 1);
		} else {
			System.out.println("ERROR ON TEAM");
		}
	}

	public Number getTeam1Goals() {
		return team1Goals;
	}

	public void setTeam1Goals(Number team1Goals) {
		this.team1Goals = team1Goals;
	}

	public Number getTeam2Goals() {
		return team2Goals;
	}

	public void setTeam2Goals(Number team2Goals) {
		this.team2Goals = team2Goals;
	}
}
