public class App{
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
    
        jugador.experience += 1000;
        originator.setState(jugador);
        caretaker.addMemento(originator.Save());

        jugador = new Jugador();
        jugador.experience += 90000000;
        System.out.println(jugador);

        originator.Restore(caretaker.getMemento(0));
        jugador = originator.getState();
        System.out.println(jugador);

        jugador = new Jugador();
        jugador.experience += 1200;
        originator.setState(jugador);
        caretaker.addMemento(originator.Save());
        jugador = new Jugador();
        jugador.experience += 12050;
        originator.setState(jugador);
        caretaker.addMemento(originator.Save());

        System.out.println(caretaker);
    }
}
