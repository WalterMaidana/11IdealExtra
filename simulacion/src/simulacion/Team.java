package simulacion;

import java.util.ArrayList;

public class Team {
	private ArrayList<ArrayList> players;
	private String status;
	
	public Team() {
		ArrayList<Player> keeper = new ArrayList<Player>();
		ArrayList<Player> defense = new ArrayList<Player>();
		ArrayList<Player> midfield = new ArrayList<Player>();
		ArrayList<Player> attack = new ArrayList<Player>();
		
		this.players = new ArrayList<ArrayList>();
		this.players.add(keeper);
		this.players.add(defense);
		this.players.add(midfield);
		this.players.add(attack);
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void addPlayer(Player player) {
		this.players.get(player.getPosition().intValue()).add(player);
	}
	
	public ArrayList<Player> getPlayersInPosition(Number position) {
		Number playersIndex = 0;
		
		if (position.intValue() == 0) {
			playersIndex = 2;
		} else if (position.intValue() == 1) {
			if (this.status == "attack") {
				playersIndex = 3;
			} else if (this.status == "defense") {
				playersIndex = 1;
			}
		}
		
		return this.players.get(playersIndex.intValue());
	}
	
	public Player getKeeper() {
		return this.getPlayersInPosition(2).get(0);
	}
}
