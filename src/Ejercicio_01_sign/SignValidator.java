package Ejercicio_01_sign;

import java.util.Stack;

public class SignValidator {

    public boolean isValid(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else {
                if (pila.isEmpty()) {
                    return false;
                }
                char apertura = pila.pop();
                if ((c == ')' && apertura != '(') ||
                    (c == '}' && apertura != '{') ||
                    (c == ']' && apertura != '[')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {
        SignValidator validador = new SignValidator();

        String ejemplo1 = "([]){}";
        String ejemplo2 = "({)}";

        System.out.println(validador.isValid(ejemplo1)); 
        System.out.println(validador.isValid(ejemplo2)); 
    }
}


