import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Validaciones v = new Validaciones();

    public Stack<ObjDato> LLenarPila(Stack<ObjDato> p, Scanner sc) {
        boolean pregutar = true;

        while (pregutar) {
            ObjDato o = new ObjDato();
            System.out.println("Digite el numero");
            int numero = v.ValidarEntero(sc);
            o.setNumero(numero);
            p.push(o);
            System.out.println("desea continuar 1) si , 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                pregutar = false;
            }
        }
        return p;
    }

    public Queue<ObjDato> LLenarCola(Queue<ObjDato> c, Scanner sc) {
        boolean pregutar = true;
        while (pregutar) {
            ObjDato o = new ObjDato();
            System.out.println("Digite el numero");
            int numero = v.ValidarEntero(sc);
            o.setNumero(numero);
            c.offer(o);
            System.out.println("desea continuar 1) si , 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                pregutar = false;
            }
        }
        return c;
    }

    public LinkedList<ObjDato> LLenarLista(LinkedList<ObjDato> l, Scanner sc) {
        boolean pregutar = true;
        while (pregutar) {
            ObjDato o = new ObjDato();
            System.out.println("Digite el numero");
            int numero = v.ValidarEntero(sc);
            o.setNumero(numero);
            l.add(o);
            System.out.println("desea continuar 1) si , 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                pregutar = false;
            }
        }
        return l;
    }

    public void MostrarPila(Stack<ObjDato> p) {
        for (ObjDato o : p) {
            System.out.print(" " + o.getNumero());
        }
        System.out.println();
    }

    public void MostrarCola(Queue<ObjDato> c) {
        for (ObjDato o : c) {
            System.out.print(" " + o.getNumero());
        }
        System.out.println();
    }

    public void MostrarLista(LinkedList<ObjDato> l) {
        for (ObjDato o : l) {
            System.out.print(" " + o.getNumero());
        }
        System.out.println();
    }

}
