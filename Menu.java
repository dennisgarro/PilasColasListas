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
        boolean menu = true;
        while (menu) {
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

                case 3:
                    cadena = "Lista";
                    break;

                default:
                    System.out.println("Hasta Luego");
                    menu = false;
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
                        if ((!Pila.isEmpty() && choise == 1) || (!Cola.isEmpty() && choise == 2)
                                || (!Lista.isEmpty() && choise == 3)) {
                            if (choise == 1) {
                                m.MostrarPila(Pila);
                            } else if (choise == 2) {
                                m.MostrarCola(Cola);
                            } else {
                                m.MostrarLista(Lista);
                            }
                        } else {
                            System.out.println(" vacia compa");
                            switch (choise) {
                                case 1:
                                    Pila = m.LLenarPila(Pila, sc);
                                    break;
                                case 2:
                                    Cola = m.LLenarCola(Cola, sc);
                                    break;

                                default:
                                    Lista = m.LLenarLista(Lista, sc);
                                    break;
                            }

                        }

                        break;
                    case 3:
                        if ((!Pila.isEmpty() && choise == 1) || (!Cola.isEmpty() && choise == 2)
                                || (!Lista.isEmpty() && choise == 3)) {
                            if (choise == 1) {
                                opt = v.Pedirdato(1, sc);
                                Pila = m.ModificarPila(Pila, opt, sc);

                            } else if (choise == 2) {
                                opt = v.Pedirdato(1, sc);
                                Cola = m.ModificarCola(Cola, opt, sc);

                            } else {
                                opt = v.Pedirdato(1, sc);
                                Lista = m.Modificarlista(Lista, opt, sc);
                            }
                        } else {
                            System.out.println(" Vacia parce");
                            switch (choise) {
                                case 1:
                                    Pila = m.LLenarPila(Pila, sc);
                                    break;
                                case 2:
                                    Cola = m.LLenarCola(Cola, sc);
                                    break;

                                default:
                                    Lista = m.LLenarLista(Lista, sc);
                                    break;
                            }
                        }

                        break;
                    case 4:
                        if ((!Pila.isEmpty() && choise == 1) || (!Cola.isEmpty() && choise == 2)
                                || (!Lista.isEmpty() && choise == 3)) {
                            if (choise == 1) {
                                opt = v.Pedirdato(3, sc);
                                Pila = m.EliminarPila(Pila, opt);

                            } else if (choise == 2) {
                                opt = v.Pedirdato(3, sc);
                                Cola = m.EliminarCola(Cola, opt);

                            } else {
                                opt = v.Pedirdato(3, sc);
                                Lista = m.Eliminarlista(Lista, opt);
                            }
                        } else {
                            System.out.println("esta vacia");
                             switch (choise) {
                                case 1:
                                    Pila = m.LLenarPila(Pila, sc);
                                    break;
                                case 2:
                                    Cola = m.LLenarCola(Cola, sc);
                                    break;

                                default:
                                    Lista =  m.LLenarLista(Lista, sc);
                                    break;
                            }
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
}
