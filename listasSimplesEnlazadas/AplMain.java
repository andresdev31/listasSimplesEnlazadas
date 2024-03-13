/**
 * AplMain
 */
public class AplMain {

    public static void main(String[] args) {
        
        ListaSimpleEnlazada listaTrabajadores = new ListaSimpleEnlazada();

        // Agregar empleados
        listaTrabajadores.agregarTrabajador("Juan", 180);
        listaTrabajadores.agregarTrabajador("Pedro", 150);
        listaTrabajadores.agregarTrabajador("María", 170);
        listaTrabajadores.agregarTrabajador("Ana", 190);
        listaTrabajadores.agregarTrabajador("Luis", 140);
        
        // Mostrar lista
        System.out.println("Lista de trabajadores:");
        listaTrabajadores.mostrarLista();
        System.out.println();

        // a) Cantidad de trabajadores que trabajaron más de 160 horas
        System.out.println("Cantidad de trabajadores que trabajaron más de 160 horas: " +
                           listaTrabajadores.trabajadoresMasDe160Horas());
        System.out.println();

        // b) Calcular el salario por trabajador
        System.out.println("Salario por trabajador:");
        listaTrabajadores.salarioPorTrabajador();
        System.out.println();

        // c) Eliminar los dos últimos trabajadores
        listaTrabajadores.eliminarUltimosDos();
        System.out.println("Lista de trabajadores después de eliminar los dos últimos:");
        listaTrabajadores.mostrarLista();
    }
}