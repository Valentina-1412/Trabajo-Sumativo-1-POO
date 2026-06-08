package Model;

public class Cliente extends Persona{//clase hija, va a heredar los elementos de la clase Persona
    private int edad;
    private boolean esExtranjero;

    public Cliente(String nombre, String telefono, String correo, int edad, boolean esExtranjero) {
        super(nombre, telefono, correo);
        this.edad = edad;
        this.esExtranjero = esExtranjero;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public boolean getEsExtranjero(){
        return esExtranjero;
    }

    public String getEsExtranjeroString(){
        if (esExtranjero){
            return "Sí";
        } else {
            return "No";
        }
    }

    public void setEsExtranjero(boolean esExtranjero){
        this.esExtranjero = esExtranjero;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nEdad: " + edad +
                "\nEs extranjero: " + esExtranjero;

    }
}
