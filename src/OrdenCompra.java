import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private float granTotal=0;

    private int agregoProductos;
    //Constructor de descripcion
    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    //metodos Getter para todos los atributos
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    //metodos setter para los atributos cliente y fecha


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //metodo agregar producto
    public void addProducto(Producto producto){

        this.productos = new Producto[4];
        if (agregoProductos < this.productos.length){
            this.productos[agregoProductos++] = producto;
        }
    }



    //metodo que devuevle el gran total, Sumando los precios de los productos
    /*public  float calcularTotal(float granTotal){
        return (granTotal = granTotal + );

        //return km/(estanque.getCapacidad()*porcentajeBencina);

    }*/
}
