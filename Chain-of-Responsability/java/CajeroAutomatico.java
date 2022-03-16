public class CajeroAutomatico extends BaseHandler{
    
    public CajeroAutomatico(){
        super();
        this.maxRequest = 9000;
    }
    @Override
    public String toString(){
        return "Cajero automatico";
    }
}