public class PanFactory implements ItemFactory {
    @Override
    public Item CreateItem(){
        return new Pan();
    }
}
