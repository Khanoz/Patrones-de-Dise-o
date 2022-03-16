public interface IHandler{
    public void handle(int request);
    public void setNext(IHandler next);
}