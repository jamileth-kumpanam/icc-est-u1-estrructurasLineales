import Materia.controllers.Cola;
import Materia.controllers.ColaG;
import Materia.controllers.Stack;
import Materia.controllers.StackG;
import Materia.models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        stack.printStack();
        stack.pop();
        stack.peek();
        stack.printStack();
        System.out.println("Tam = " + stack.size());
        stack.printStack();
        stack.pop();
        System.out.println("Tam = " + stack.size());

        StackG<Integer> stackGInt = new StackG<Integer>();
        stackGInt.push(1);
        stackGInt.push(4);
        stackGInt.printStack();

        StackG<String> stackGString = new StackG<String>();
        stackGString.push("Uno");
        stackGString.push("Cuatro");
        stackGString.printStack();

        Cola cola = new Cola ();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        cola.printCola();
        cola.remove();
        System.out.println("tam = " + cola.size);
        cola.printCola();

        Persona persona1 = new Persona("Pablo");
        Persona persona2 = new Persona("Juan");
        Persona persona3 = new Persona("María");

        ColaG<Persona> colaPersonas = new ColaG<Persona>();
        colaPersonas.add(persona1);
        colaPersonas.add(persona2);
        colaPersonas.add(persona3);
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("Atiene a la persona => " + colaPersonas.remove());
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();
    }

} 
