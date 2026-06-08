package Model;

public class Guia extends Persona{
    private boolean hablaIngles;

    public Guia(String nombre, String telefono, String correo, boolean hablaIngles) {
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
