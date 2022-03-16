public class Memento {
    private Jugador state;

	public Memento(Jugador state) {
		this.state = state;
	}

	public Jugador getState() {
		return this.state;
	}
}
