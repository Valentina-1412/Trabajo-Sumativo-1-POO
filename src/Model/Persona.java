package Model;

public class Persona {
    //clase general, va a ser mi clase padre
    //lo primero son los atributos:
    private String nombre;
    private String telefono;
    private String correo;

    //constructor con parámetros que inician los atributos
    public Persona(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    //constructor sin parámetros, le vamos a colocar valores por defecto
    public Persona(){
        this.nombre = "";
        this.telefono = "";
        this.correo = "";
    }

    // vamos a implementar los setters y los getters para nombre, correo y telefono
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    //sobreescribir método toString para convertir al objeto en un texto legible y ordenado cuando haya que mostrarlo en la pantalla
    //el usar @override nos va a entregar un texto que contenga la información ordenada y bonita
    @Override
    public String toString(){
    return "Nombre: " + nombre +
            "\nTeléfono: " + telefono +
            "\nCorreo: " + correo;
    }
}
