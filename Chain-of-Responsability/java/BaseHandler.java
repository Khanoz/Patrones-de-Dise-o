public class BaseHandler implements IHandler{
    protected IHandler next;
    protected int maxRequest;

    public void handle(int request){
        if(canHandle(request)){
            System.out.println("Se entregan: " + request);
        }
        else if(next != null){
            System.out.println("Se pasa al siguiente en la cadena: "+this.next);
            next.handle(request);
        }
        else{
            System.out.println("Lo sentimos pero excedio el limite de retiro");
        }
    }

    public void setNext(IHandler next){
        this.next = next;
    }

    public boolean canHandle(int request){
        return request <= maxRequest;
    }
}