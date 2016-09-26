package simulacion;

import java.util.ArrayList;

public class Match {
	private Score score;
	private Team team1;
	private Team team2;
	private Number position;
	
	public Match(Team team1, Team team2) {
		this.score = new Score(team1, team2);
		this.team1 = team1;
		this.team2 = team2;
		this.position = 0;
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
	
	public Team getAttackerTeam() {
		if (this.team1.getStatus() == "attack") {
			return team1;
		} else {
			return team2;
		}
	}
	
	public Team getDefenseTeam() {
		if (this.team1.getStatus() == "defense") {
			return team1;
		} else {
			return team2;
		}
	}
	
	public Score play() {
		//Tirar la moneda y elegir quien comienza atacando
		Number coin = Math.random() * 2 + 1;
		
		if (coin.intValue() % 2 == 0) {
			this.team1.setStatus("attack");
			this.team2.setStatus("defense");
		} else {
			this.team1.setStatus("defense");
			this.team2.setStatus("attack");
		}
		
		//Jugar los turnos
		for (int i = 0; i <= 90; i++) {
			this.turn();
		}
		
		//Devuelve el resultado final
		return this.score;
	}

	private void turn() {
		//Agarrar a los jugadores que atacan y defienden de cada equipo
		ArrayList<Player> attackers = this.getAttackerTeam().getPlayersInPosition(this.position);
		ArrayList<Player> defenders = this.getDefenseTeam().getPlayersInPosition(this.position);
		
		//Contador de fallos de los atacantes
		int attackTries = 0;
		
		//Inicio del loop de ataque
		for (int i = 0; i < attackers.size(); i++) {
			//Contador de fallos de los defensores
			int defenseTries = 0;
			
			//Inicio del loop de defensa
			for (int j = 0; j < defenders.size(); j++) {
				//Comparación entre jugadores
				Number attackValue = attackers.get(i).getAttr().intValue() + Math.random() * 100;
				Number defenseValue = defenders.get(j).getAttr().intValue() + Math.random() * 100;
				
				//Si el atacante de le gana al defensor, ir por el siguiente defensor
				if (attackValue.intValue() > defenseValue.intValue()) {
					defenseTries++;
				//Si el defensor le gana al atacante, salir del loop de defensa para que intente otro atacante
				} else {
					attackTries++;
					break;
				}
			}
			
			//Si el atacante le ganó a la defensa, avanzar y salir del loop de ataque
			if (defenseTries == defenders.size()) {
				this.setPosition(this.getPosition().intValue() + 1);
				//Si llegó al arco, patear
				if(this.getPosition().intValue() == 2) {
					Number attackValue = attackers.get(i).getAttr().intValue() * Math.random() * 100;
					Number keeperValue = this.getDefenseTeam().getKeeper().getAttr().intValue() * Math.random() * 100;
					
					//Si el pateador le gana al arquero, marcar gol
					if (attackValue.intValue() > keeperValue.intValue()) {
						this.score.addGoal(this.getAttackerTeam());
					//Si le erra, la pelota vuelve a posición 0 y se invierten los papeles de ataque y defensa
					}
					
					//Volver a la posición 0 e invertir los papeles
					this.setPosition(0);
					Team originalAttacker = this.getAttackerTeam();
					Team originalDefender = this.getDefenseTeam();
					originalAttacker.setStatus("defense");
					originalDefender.setStatus("attack");
					//Salir del loop de ataque
					break;
				}
				break;
			}
			//Si no logró ganarle a la defensa, continúa con el loop de ataque para probar con otro atacante
		}
		
		//Si los defensores les ganaron a todos los delanteros, volver a posición 0 e invertir papeles
		if (attackTries == attackers.size()) {
			this.setPosition(0);
			Team originalAttacker = this.getAttackerTeam();
			Team originalDefender = this.getDefenseTeam();
			originalAttacker.setStatus("defense");
			originalDefender.setStatus("attack");
		}
	}
}
