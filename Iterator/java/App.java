public class App{
    public static void main(String[] args) {
        stringContainer container = new stringContainer();
        
        for(Iterator iter = container.getIterator(); iter.hasNext();){
            System.out.println((String)iter.next());
         } 	
    }
}