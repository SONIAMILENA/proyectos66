import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al cine");

        // Cliente Uno

        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese su cedula: ");
        String cedula = sca.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre = sca.nextLine();

        Cliente clienteUno = new Cliente();
        clienteUno.setCedula(cedula);
        clienteUno.setNombre(nombre);
        clienteUno.setId(1);
        clienteUno.generarSaludo();
        clienteUno.generarSaludo("Buenos dias");
        clienteUno.mostrarDatos();
        float costo = clienteUno.calcularCosto(8000);

        System.out.println("Cedula: " + clienteUno.getCedula() + "\nNombre: "
                            + clienteUno.getNombre() + "\nID: " + clienteUno.getId()
                            + "\nCosto tiquete: " + costo);

        // Cliente Dos

        ClientePremium clienteDos = new ClientePremium();
        clienteDos.setCedula("11657777");
        clienteDos.setNombre("Jose");
        clienteDos.setNumeroTarjeta(100);
        clienteDos.mostrarDatos();

        System.out.println();
        float costoDos = clienteDos.calcularCosto(8000);

        System.out.println("Cedula: " + clienteDos.getCedula() + "\nNombre: "
                            + clienteDos.getNombre() + "\nNumero tarjeta: "
                            + clienteDos.getNumeroTarjeta()
                            + "\nCosto tiquete: " + costoDos);


        // Prueba de contenedores
        System.out.println();
        Prueba pruebaContenedor = new Prueba();
        pruebaContenedor.generarLista();


        // Lista de objetos
        System.out.println("CREACION DE CLIENTES");
        String opcion = "S";
        while (opcion.equalsIgnoreCase("S")) { // Ignora mayúsculas
            // Ingresa datos por teclado
            System.out.println("Ingrese su cedula:");
            cedula = sca.next(); // Uso de next
            sca.nextLine();
            System.out.println("Ingrese su nombre:");
            nombre = sca.nextLine();
            System.out.println("Ingrese su ID:");
            int id = sca.nextInt();

            // Crea objeto cliente
            /*Cliente nuevoCliente = new Cliente();
            nuevoCliente.setCedula(cedula);
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setId(id);*/
            Cliente nuevoCliente = new Cliente(cedula, nombre, id);

            // Agregar cliente a la lista
            pruebaContenedor.agregarCliente(nuevoCliente);

            // Preguntar nuevo cliente
            System.out.println("Desea agregar otro cliente? (s / n):");
            opcion = sca.next();
            sca.nextLine();
        }

        pruebaContenedor.mostrarNombreClientes();
        pruebaContenedor.mostrarDatosClientes();


        /*
        ** Estructura Try - Catch
        try {
            // Algoritmo
        } catch(Exception e){
            // Proceso realizado si ocurre un eror
        }
        */
    }
}
