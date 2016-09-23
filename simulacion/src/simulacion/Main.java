package simulacion;

public class Main {
	public Main() {
		Player player1 = new Player(1,1);
		Player player2 = new Player(1,1);
		
		Team team1 = new Team();
		Team team2 = new Team();
		
		team1.addPlayer(player1);
		team2.addPlayer(player2);
		
		Match match = new Match(team1, team2);
		Score result = match.play();
		
		String resultString = result.getTeam1().toString() + " - " + result.getTeam2().toString();
		System.out.print("\n" + resultString);
	}
}
