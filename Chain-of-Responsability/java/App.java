public class App {
    public static void main(String[] args) {
        IHandler cajero = new CajeroAutomatico();
        IHandler sucursal = new Sucursal();
        IHandler asesor = new AsesorFinanciero();
        cajero.setNext(sucursal);
        sucursal.setNext(asesor);
        System.out.println("Maximos:\nCajero: 9000\nSucursal: 50000\nAsesor:250000\n");

        int monto = 10000;
        System.out.println("Le pedimos al cajero retirar "+monto);
        cajero.handle(monto);

        monto = 200000;
        System.out.println("\nLe pedimos al cajero retirar "+monto);
        cajero.handle(monto);

        monto = 500;
        System.out.println("\nLe pedimos al cajero retirar "+monto);
        cajero.handle(monto);

        monto = 123456789;
        System.out.println("\nLe pedimos al cajero retirar "+monto);
        cajero.handle(monto);
    }
}
