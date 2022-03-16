public class PhoneBuilder
{
    
    private String nombre;
    private String os;
    private String memoria;

    public PhoneBuilder(String nombre)
    {
        super();
        this.nombre = nombre;
    }
    public PhoneBuilder setOS(String os)
    {
        this.os = os;
        return this;
    }
    public PhoneBuilder setMemoria(String memoria)
    {
        this.memoria = memoria;
        return this;
    }
    public Phone buildPhone()
    {
        return new Phone(this.nombre, this.os, this.memoria);
    }
}