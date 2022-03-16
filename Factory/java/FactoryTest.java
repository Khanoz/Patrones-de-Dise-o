public class FactoryTest{
    public static void main(String[] args) {
        ItemFactory panFact = new PanFactory();
        ItemFactory piedraFact = new PiedraFactory();

        panFact.CreateItem().Place();
        piedraFact.CreateItem().Place();
    }
} 