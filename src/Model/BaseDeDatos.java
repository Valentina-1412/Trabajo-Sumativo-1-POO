package Model;

import java.util.ArrayList;

public class BaseDeDatos {
    private ArrayList<Cliente> clientes;
    private ArrayList<Guia> guias;
    private ArrayList<Alojamiento> alojamientos;
    private ArrayList<AnfitrionAlojamiento> anfitriones;
    private ArrayList<Transporte> transportes;

    //constructor con parámetros que inician los atributos
    public BaseDeDatos(
            ArrayList<Cliente> clientes,
            ArrayList<Guia> guias,
            ArrayList<Alojamiento> alojamientos,
            ArrayList<AnfitrionAlojamiento> anfitriones,
            ArrayList<Transporte> transportes
    ) {
        this.clientes = clientes;
        this.guias = guias;
        this.alojamientos = alojamientos;
        this.anfitriones = anfitriones;
        this.transportes = transportes;
    }

    //constructor sin parámetros, le vamos a colocar valores por defecto
    public BaseDeDatos() {
        this.clientes = new ArrayList<Cliente>();
        this.guias = new ArrayList<Guia>();
        this.alojamientos = new ArrayList<Alojamiento>();
        this.anfitriones = new ArrayList<AnfitrionAlojamiento>();
        this.transportes = new ArrayList<Transporte>();
    }

    //CLIENTES
    //ahora vamos a agregar a los clientes:
    public boolean agregarCliente(Cliente cliente) {
        for (Cliente clienteActual : clientes) {
            if (clienteActual.getNombre().equals(cliente.getNombre())) {
                System.out.println("El cliente ya existe.");
                return false;
            }
        }

        clientes.add(cliente);
        System.out.println("Cliente agregado con éxito.");
        return true;
    }

    //ahora vamos a mostrara a los clientes
    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes");
            return;
        }
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.println(clientes.get(i).toString());
        }
    }

    //GUÍAS
    //ahora vamos a mostrar a los guias
    public void mostrarGuias() {
        if (guias.isEmpty()) {
            System.out.println("No hay guías");
            return;
        }
        for (int i = 0; i < guias.size(); i++) {
            System.out.println("Guia " + (i + 1) + ":");
            System.out.println(guias.get(i).toString());
        }
    }

    //ahora vamos a agregar a los guías
    public boolean agregarGuia(Guia guia) {
        for (Guia guiaActual : guias) {
            if (guiaActual.getNombre().equals(guia.getNombre())) {
                System.out.println("El guía ya existe.");
                return false;
            }
        }

        guias.add(guia);
        System.out.println("Guía agregado con éxito.");
        return true;
    }

    //ALOJAMIENTOS
    public void mostrarAlojamientos() {
        if (alojamientos.isEmpty()) {
            System.out.println("No hay alojamientos disponibles");
            return;
        }
        for (int i = 0; i < alojamientos.size(); i++) {
            System.out.println("Alojamiento " + (i + 1) + ":");
            System.out.println(alojamientos.get(i).toString());
        }
    }

    public boolean agregarAlojamiento(Alojamiento alojamiento) {
        for (Alojamiento alojamientoActual : alojamientos) {
            if (alojamientoActual.getNombreLocal().equals(alojamiento.getNombreLocal())) {
                System.out.println("El alojamiento ya existe.");
                return false;
            }
        }

        alojamientos.add(alojamiento);
        System.out.println("Alojamiento agregado con éxito");
        return true;
    }


    //TRANSPORTE
    public void mostrarTransportes() {
        if (transportes.isEmpty()) {
            System.out.println("No hay vehículos disponibles");
            return;
        }
        for (int i = 0; i < transportes.size(); i++) {
            System.out.println("Transporte " + (i + 1) + ":");
            System.out.println(alojamientos.get(i).toString());
        }
    }

    public boolean agregarTransporte(Transporte transporte) {
        for (Transporte transporteActual : transportes) {
            if (transporteActual.getNombre().equals(transporte.getNombre())) {
                System.out.println("El transporte ya existe.");
                return false;
            }
        }

        transportes.add(transporte);
        System.out.println("Transporte agregado con éxito.");
        return true;
    }


    //ANFITRIONES DE LOS ALOJAMIENTOS
    public void mostrarAnfitriones() {
        if (anfitriones.isEmpty()) {
            System.out.println("No hay anfitriones");
            return;
        }
        for (int i = 0; i < anfitriones.size(); i++) {
            System.out.println("Anfitrión " + (i + 1) + ":");
            System.out.println(anfitriones.get(i).toString());
        }
    }

    public boolean agregarAnfitrionAlojamiento(AnfitrionAlojamiento anfitrion) {
        for (AnfitrionAlojamiento anfitrionActual : anfitriones) {
            if (anfitrionActual.getNombre().equals(anfitrion.getNombre())) {
                System.out.println("El anfitrión ya existe.");
                return false;
            }
        }

        anfitriones.add(anfitrion);
        System.out.println("Anfitrión agregado con éxito");
        return true;
    }
}






