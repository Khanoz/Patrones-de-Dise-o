package java;

public class DesktopFactory implements abstractFactPC{
    
    @Override
    public PC createPC(){
        return new Desktop();
    }
}