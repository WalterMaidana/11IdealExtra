package simulacion;

public class Main {
	public Main() {
		//Jugadores -> esto vendría de la base de datos
		Player player1_1 = new Player(0,3);
		Player player1_2 = new Player(1,1);
		Player player1_3 = new Player(1,1);
		Player player1_4 = new Player(1,1);
		Player player1_5 = new Player(2,1);
		Player player1_6 = new Player(2,1);
		Player player1_7 = new Player(2,1);
		Player player1_8 = new Player(2,1);
		Player player1_9 = new Player(3,1);
		Player player1_10 = new Player(3,1);
		Player player1_11 = new Player(3,1);
		
		Player player2_1 = new Player(0,3);
		Player player2_2 = new Player(1,1);
		Player player2_3 = new Player(1,1);
		Player player2_4 = new Player(1,1);
		Player player2_5 = new Player(2,1);
		Player player2_6 = new Player(2,1);
		Player player2_7 = new Player(2,1);
		Player player2_8 = new Player(2,1);
		Player player2_9 = new Player(3,1);
		Player player2_10 = new Player(3,1);
		Player player2_11 = new Player(3,1);
		
		//Equipos -> esto vendría de la base de datos
		Team team1 = new Team();
		Team team2 = new Team();
		
		//Se agregan jugadores a los equipos -> Los equipos ya estarían armados en la base de datos
		team1.addPlayer(player1_1);
		team1.addPlayer(player1_2);
		team1.addPlayer(player1_3);
		team1.addPlayer(player1_4);
		team1.addPlayer(player1_5);
		team1.addPlayer(player1_6);
		team1.addPlayer(player1_7);
		team1.addPlayer(player1_8);
		team1.addPlayer(player1_9);
		team1.addPlayer(player1_10);
		team1.addPlayer(player1_11);
		
		team2.addPlayer(player2_1);
		team2.addPlayer(player2_2);
		team2.addPlayer(player2_3);
		team2.addPlayer(player2_4);
		team2.addPlayer(player2_5);
		team2.addPlayer(player2_6);
		team2.addPlayer(player2_7);
		team2.addPlayer(player2_8);
		team2.addPlayer(player2_9);
		team2.addPlayer(player2_10);
		team2.addPlayer(player2_11);
		
		//Se crea un nuevo partido, pasando los dos equipos
		Match match = new Match(team1, team2);
		Score result = match.play();
		
		//Mostrar el resultado
		String resultString = "Equipo 1: " + result.getTeam1Goals().toString() + " - Equipo 2: " + result.getTeam2Goals().toString();
		System.out.print("\n" + resultString);
		
		int winner = 0;
		if (result.getTeam1Goals().intValue() > result.getTeam2Goals().intValue()) {
			winner = 1;
		} else if (result.getTeam2Goals().intValue() > result.getTeam1Goals().intValue()) {
			winner = 2;
		}
		
		if (winner != 0) {
			System.out.print("\n" + "Equipo " + winner + " Gana!");
		} else {
			System.out.print("\n" + "Aburridísimo empate. Buuuuuu");
		}
	}
}
