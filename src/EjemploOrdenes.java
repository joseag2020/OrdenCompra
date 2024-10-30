import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenCompra orden = new OrdenCompra("Celular xiamoi 13 pro plus");
        orden.setFecha(new Date(2024-01-01));
        orden.setCliente(new Cliente("Felipe", "Gomez"));
        orden.addProducto(new Producto("Xiaomi","Xiaomi Corporation", 1500000));

        System.out.println(orden);
        for (int i = 0; i < orden.getId(); i++){
            System.out.println("orden = " + orden.getId());
        }

    }
}
