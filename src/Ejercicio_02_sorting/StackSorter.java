package Ejercicio_02_sorting;

import java.util.Stack;

public class StackSorter {
    public static void ordenar(Stack<Integer> pila) {
        Stack<Integer> pilaAux = new Stack<>();
        while (!pila.isEmpty()) {
            int temp = pila.pop();
            while (!pilaAux.isEmpty() && pilaAux.peek() > temp) {
                pila.push(pilaAux.pop());
            }
            pilaAux.push(temp);
        }

        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        ordenar(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

