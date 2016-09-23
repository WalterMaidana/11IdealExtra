package simulacion;

public class Match {
	private Score score;
	private Team team1;
	private Team team2;
	private Number position;
	
	public Match(Team team1, Team team2) {
		this.score = new Score();
		this.team1 = team1;
		this.team2 = team2;
		this.position = 0;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public Number getPosition() {
		return position;
	}

	public void setPosition(Number position) {
		this.position = position;
	}
	
	public Score play() {
		Player attack = this.team1.getPlayers().get(0);
		Player defense = this.team2.getPlayers().get(0);
		
		Number attackValue = attack.getAttr().intValue() * Math.random() * 100;
		Number defenseValue = defense.getAttr().intValue() * Math.random() * 100;
		
		System.out.print(attackValue + "\n");
		System.out.print(defenseValue);
		
		if (attackValue.intValue() > defenseValue.intValue()) {
			this.score.addGoal(1);
		} else {
			this.score.addGoal(2);
		}
		
		return this.score;
	}

}
