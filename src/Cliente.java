public class Cliente {

    private String nombre;
    private String apellido;

    //Constructor de los atributos
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //metodos getter de los atributos
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
