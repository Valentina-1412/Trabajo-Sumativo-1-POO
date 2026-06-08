package Model;

public class AnfitrionAlojamiento extends Persona{//esta es mi clase hija, la cual va a heredar los 3 ATRIBUTOS de la clase persona
    private boolean hablaIngles;

    public AnfitrionAlojamiento(String nombre, String telefono, String correo, boolean hablaIngles) {
        super(nombre, telefono, correo);//estos son los atributos de la clase heredada
        this.hablaIngles = hablaIngles;//atributo propio de esta clase
    }

    public boolean getHablaIngles(){
        return hablaIngles;
    }

    public String getHablaInglesString(){//aquí está el manejo de la respuesta de la variable booleana
        if (hablaIngles){
            return "Sí";
        } else {
            return "No";
        }
    }

    public void setHablaIngles(boolean hablaIngles){
        this.hablaIngles = hablaIngles;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHabla inglés: " + hablaIngles;
    }
}
