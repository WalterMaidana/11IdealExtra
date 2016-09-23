package simulacion;

import java.util.ArrayList;

public class Team {
	private ArrayList<Player> players;
	private String status;
	
	public Team() {
		this.players = new ArrayList<Player>();
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
	}
}
