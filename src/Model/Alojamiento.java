package Model;

public class Alojamiento {
    //clase que va a mostrar la composición de clases, es decir, va a usar otra clase como atributo,en este caso AnfitrionAlojamiento

    //definimos variables:
    private String nombreLocal;
    private String direccion;
    private String telefono;
    private String correo;
    private AnfitrionAlojamiento anfitrion; //la clase AA se convierte en variable, y anfitrion es el nombre de la nueva variable

    public Alojamiento(
            String nombreLocal,
            String direccion,
            String telefono,
            String correo,
            AnfitrionAlojamiento anfitrion
    ) {
        this.nombreLocal = nombreLocal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.anfitrion = anfitrion;
    }

    public Alojamiento() {
        this.nombreLocal = "";
        this.direccion = "";
        this.telefono = "";
        this.correo = "";
        this.anfitrion = null;
    }

    public String getNombreLocal(){
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String Telefono) {
        this.telefono = telefono;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public AnfitrionAlojamiento getAnfitrion(){
        return anfitrion;
    }

    public void setAnfitrion(AnfitrionAlojamiento anfitrion) {
        this.anfitrion = anfitrion;
    }

    @Override
    public String toString() {
        return "Nombre del local: " + nombreLocal +
                "\nDirección: " + direccion +
                "\nTelefono: " + telefono +
                "\nCorreo: " + correo +
                "\n" + anfitrion;
    }
}
