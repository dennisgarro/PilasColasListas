import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Validaciones v = new Validaciones();
        Stack<ObjDato> Pila = new Stack<>();
        Queue<ObjDato> Cola = new LinkedList<>();
        LinkedList<ObjDato> Lista = new LinkedList<>();
        System.out.println("Que desea llenar 1) pila, 2) cola , 3) lista");
        int choise = v.ValidarEntero(sc);
        choise = v.ValidarRango(1, 3, choise, sc);
        String cadena = "";
        switch (choise) {
            case 1:
                cadena = "Pila";
                break;
            case 2:
                cadena = "Cola";
                break;

            default:
                cadena = "Lista";
                break;
        }

        OpcionesMenu om = new OpcionesMenu();
        boolean seguir = true;
        int opt = 0;
        while (seguir) {
            opt = om.Menu(sc, cadena);
            switch (opt) {
                case 1:
                    if (choise == 1) {
                        Pila = m.LLenarPila(Pila, sc);
                    } else if (choise == 2) {
                        Cola = m.LLenarCola(Cola, sc);
                    } else {
                        Lista = m.LLenarLista(Lista, sc);
                    }
                    break;
                case 2:
                    if (choise == 1) {
                        m.MostrarPila(Pila);
                    } else if (choise == 2) {
                        m.MostrarCola(Cola);
                    } else {
                        m.MostrarLista(Lista);
                    }
                    break;
                case 3:
                    if (choise == 1) {

                    } else if (choise == 2) {

                    } else {

                    }
                    break;
                case 4:
                    if (choise == 1) {

                    } else if (choise == 2) {

                    } else {

                    }
                    break;
                case 5:
                    System.out.println("Gracias por venir ");
                    seguir = false;
                    break;

                default:
                    System.out.println("home de 1 a 5 no joda");
                    break;
            }

        }
    }
}
