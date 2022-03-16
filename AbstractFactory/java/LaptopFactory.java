package java;

public class LaptopFactory implements abstractFactPC{
    
    @Override
    public PC createPC(){
        return new Laptop();
    }
}
