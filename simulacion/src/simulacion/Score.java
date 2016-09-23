package simulacion;

public class Score {
	private Number team1;
	private Number team2;
	
	public Score() {
		this.team1 = 0;
		this.team2 = 0;
	}
	
	public Number getTeam1() {
		return team1;
	}
	public void setTeam1(Number team1) {
		this.team1 = team1;
	}
	public Number getTeam2() {
		return team2;
	}
	public void setTeam2(Number team2) {
		this.team2 = team2;
	}
	
	public void addGoal(Number team) {
		if (team.intValue() == 1) {
			this.setTeam1(getTeam1().intValue() + 1);
		} else {
			this.setTeam2(getTeam2().intValue() + 1);
		}
	}
}
