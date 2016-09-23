package simulacion;

public class Player {
	private Number id;
	private Number position;
	private Number attr;
	
	public Player(Number id, Number attribute) {
		this.setId(id);
		this.attr = attribute;
	}

	public Number getAttr() {
		return attr;
	}

	public void setAttr(Number attr1) {
		this.attr = attr1;
	}

	public Number getPosition() {
		return position;
	}

	public void setPosition(Number position) {
		this.position = position;
	}

	public Number getId() {
		return id;
	}

	public void setId(Number id) {
		this.id = id;
	}
}
