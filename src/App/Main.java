package App;

import Model.*;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {// aquí probamos los objetos y ejecutamos el sistema
        //Nueva base de datos:
        BaseDeDatos baseDeDatos = new BaseDeDatos();


        //PARA AGREGAR Y MOSTRAR CLIENTES (USAREMOS 2 CLIENTES)
        Cliente cliente1 = new Cliente(
                "Valentina",
                "+569 76245263",
                "vale@poo.cl",
                35,
                false
        );
        Cliente cliente2 = new Cliente(
                "Danny",
                "+569 75635298",
                "danny@poo.cl",
                36,
                true
        );

        baseDeDatos.mostrarClientes();
        baseDeDatos.agregarCliente(cliente1);
        baseDeDatos.agregarCliente(cliente2);
        baseDeDatos.mostrarClientes();



        //PARA AGREGAR Y MOSTRAR A LOS GUÍAS (USAREMOS 1 GUÍA)
        Guia guia1 = new Guia(
                "Juan",
                "+569 88736255",
                "juan@poo.cl",
                false
        );

        baseDeDatos.mostrarGuias();
        baseDeDatos.agregarGuia(guia1);
        baseDeDatos.mostrarGuias();


        //PARA AGREGAR Y MOSTRAR A LOS ALOJAMIENTOS CON SUS RESPECTIVOS ANFITRIONES (USAREMOS 2))
        Alojamiento alojamiento1 = new Alojamiento (
                "Tiki Tiki",
                "Av. Siempre Viva 1234",
                "+569 83745245",
                "tikitiki@poo.cl",
                new AnfitrionAlojamiento(
                        "Esteban",
                        "+569 77645379",
                        "esteban@poo.cl",
                        true
                )
        );
        Alojamiento alojamiento2 = new Alojamiento(
                "Moai",
                "Av. Siempre Viva 1245",
                "+569 87243356",
                "moai@poo.cl",
                new AnfitrionAlojamiento(
                        "Tiare",
                        "+569 74625266",
                        "tiare@poo.cl",
                        true
                )
        );

        baseDeDatos.mostrarAlojamientos();
        baseDeDatos.agregarAlojamiento(alojamiento1);
        baseDeDatos.agregarAlojamiento(alojamiento2);
        baseDeDatos.mostrarAlojamientos();


        //PARA AGREGAR Y MOSTRAR LOS TRANSPORTES CON LOS QUE HAY CONVENIO (USAREMOS 1)
        Transporte transporte1 = new Transporte(
                "Taxis Vía Láctea",
                "+569 98474663",
                "taxisvialactea@poo.cl"
        );

        baseDeDatos.mostrarTransportes();
        baseDeDatos.agregarTransporte(transporte1);
        baseDeDatos.mostrarTransportes();


        //PARA AGREGAR Y MOSTRAR A LOS ANFITRIONES DE LOS ALOJAMIENTOS (USAREMOS 2 OBJETOS)
        AnfitrionAlojamiento anfitrionAlojamiento1 = new AnfitrionAlojamiento (
                "Esteban",
                "+569 74635353",
                "esteban@poo.cl",
                true
        );
        AnfitrionAlojamiento anfitrionAlojamiento2 = new AnfitrionAlojamiento (
                "Tiare",
                "+569 74625266",
                "tiare@poo.cl",
                true
        );

        baseDeDatos.mostrarAnfitriones();
        baseDeDatos.agregarAnfitrionAlojamiento(anfitrionAlojamiento1);
        baseDeDatos.agregarAnfitrionAlojamiento(anfitrionAlojamiento2);
        baseDeDatos.mostrarAnfitriones();

    }
}