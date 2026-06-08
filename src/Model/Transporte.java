package Model;

public class Transporte {
    //clase general, va a ser mi clase padre
    //lo primero son los atributos:
    private String nombre;
    private String telefono;
    private String correo;

    //constructor con parámetros que inician los atributos
    public Transporte(String nombre, String telefono, String mail) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    //constructor sin parámetros, le vamos a colocar valores por defecto
    public Transporte(){
        this.nombre = "";
        this.telefono = "";
        this.correo = "";
    }

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

    @Override
    public String toString(){
        return "Nombre de la agencia " + nombre +
                "\nTeléfono de contacto: " + telefono +
                "\nCorreo: " + correo;
    }
}
