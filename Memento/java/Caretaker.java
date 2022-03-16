import java.util.ArrayList;

public class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

	public void addMemento(Memento m) {
		mementos.add(m);
	}

	public Memento getMemento(int index) {
		return mementos.get(index);
	}

	@Override
	public String toString(){
		int i;
		String s = "Mementos:\n";
		for(i=0;i<mementos.size();i++){
			s += mementos.get(i).getState().toString() + "\n";
		}
		return s;
	}
}
