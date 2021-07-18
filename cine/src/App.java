

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos al cine");
        System.out.println( );


        Cliente clienteUno = new Cliente();

        clienteUno.setCedula("1234567890");
        clienteUno.setNombre("juan");
        clienteUno.setid(1);
        clienteUno.mostrarDatos();
        clienteUno.generarSaludo();
        clienteUno.generarSaludo("Buenos Dias");
        float costo = clienteUno.calcularCosto(10000);
                System.out.println("CEDULA: "+ clienteUno.getCedula() + " \nNombre: "
                            + clienteUno.getNombre() + "\nID: " + clienteUno.getId()
                            + "\nCosto Tiquete: " + costo ); 

        System.out.println( );

        System.out.println( );
        System.out.println("Bienvenidos al cine");
        System.out.println( );

        ClientePremium clienteDos = new ClientePremium();

        clienteDos.setCedula("1324567870");
        clienteDos.setNombre("Maria");
        clienteDos.setNumeroTarjeta(100);
        clienteDos.mostrarDatos();
        clienteDos.generarSaludo();
        clienteDos.generarSaludo("Buenos Dias ");

        System.out.println( );
        float costoDos = clienteDos.calcularCosto(8000);

        System.out.println("CEDULA: "+ clienteDos.getCedula() + " \nNombre: "
                            + clienteDos.getNombre() + "\nNumero Tarjeta: " + clienteDos.getNumeroTarjeta()
                            + "\nCosto Tiquete: " + costoDos );
        // prueba de contenedores
        System.out.println();
        Prueba pruebaContenedor = new Prueba();
        pruebaContenedor.generarLista();






    }
}
