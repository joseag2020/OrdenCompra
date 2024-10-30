public class Producto {

    private String fabricante;
    private String nombre;
    private int precio;

    //constructor de todos los atributos

    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Metodo getter de los atributo


    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
