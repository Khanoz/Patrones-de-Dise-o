public class Phone {
    private String nombre;
    private String os;
    private String memoria;

    public Phone(String nom, String os, String mem)
    {
        super();
        this.nombre = nom;
        this.os = os;
        this.memoria = mem;
    }
    public String getPhoneInfo()
    {
        return "Nombre: "+this.nombre + "\nOS: "+this.os + "\nMemoria: "+this.memoria;
    }
}
