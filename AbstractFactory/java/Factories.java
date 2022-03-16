package java;

public class Factories {
    
    public static abstractFactPC getFactory(String type){
        if(type == "good")
            return new DesktopFactory();
        return new LaptopFactory();
    }
}
