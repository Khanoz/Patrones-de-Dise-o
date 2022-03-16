public class PiedraFactory implements ItemFactory {
    @Override
    public Item CreateItem(){
        return new Piedra();
    }
}
