

public class ListaSimpleEnlazada {
    
    Trabajador inicio;


    public ListaSimpleEnlazada() {    
        this.inicio=null;
    }

    public void agregarTrabajador(String nombre, int horasTrabajadas) {
        Trabajador nuevoTrabajador = new Trabajador(nombre, horasTrabajadas);

        if (inicio == null) {
            inicio = nuevoTrabajador;
        } else {
            Trabajador actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoTrabajador;
        }
    }

    public int trabajadoresMasDe160Horas() {
        int contador = 0;
        Trabajador actual = inicio;
        while (actual != null) {
            if (actual.horasTrabajadas > 160) {
                contador++;
            }
            actual = actual.siguiente;
        }
        return contador;
    }
    
    public void salarioPorTrabajador() {
        Trabajador actual = inicio;
        int salario = 0;
        while (actual != null) {
            if (actual.horasTrabajadas < 160) {
                salario = actual.horasTrabajadas * 23500;
            }else{
                salario = actual.horasTrabajadas * 40000;
            }
            System.out.println("El salario de " + actual.nombre + " es: $" + salario);
            actual = actual.siguiente;
        }
    }

    public void eliminarUltimosDos() {
        if (inicio == null || inicio.siguiente == null) {
            return;
        }
        Trabajador anterior = null;
        Trabajador actual = inicio;

        while (actual.siguiente != null) {
            anterior = actual;
            actual = actual.siguiente;
        }
        anterior.siguiente = null;

        anterior = null;
        actual = inicio;

        while (actual.siguiente != null) {
            anterior = actual;
            actual = actual.siguiente;
        }
        anterior.siguiente = null;
    }

    public void mostrarLista() {
        Trabajador actual = inicio;
        while (actual != null) {
            System.out.println("Nombre: " + actual.nombre + ", Horas trabajadas: " + actual.horasTrabajadas);
            actual = actual.siguiente;
        }
    }

}
