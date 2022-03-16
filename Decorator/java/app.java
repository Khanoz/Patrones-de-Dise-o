public class app {
    public static void main(String[] args) {
        DecoratorBase mensaje1 = new SMSDecorator();
        mensaje1.mensaje("hola");
        DecoratorBase mensaje2 = new WhatsAppDecorator();
        mensaje2.mensaje("adios");
    }
}
