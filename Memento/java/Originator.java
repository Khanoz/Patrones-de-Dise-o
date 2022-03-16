public class Originator {
    private Jugador state;

    public void setState(Jugador state){
        this.state = state;
    }

    public Jugador getState() {
		return this.state;
	}

	public Memento Save() {
		return new Memento(this.state);
	}

	public void Restore(Memento m) {
		this.state = m.getState();
	}
}
