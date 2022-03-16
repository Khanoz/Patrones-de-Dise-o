public class Jugador {
    public int experience;

    public Jugador(){
        this.experience = 0;
    }
    @Override
    public String toString(){
        return "Experiencia: "+experience;
    }
}
