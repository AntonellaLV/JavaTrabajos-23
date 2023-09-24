// 2. Descontador: Se le solicita que guarde un número en un espacio de memoria y
// discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría usar para hacerlo?


public class Descontador {
    public static void main(String[] args) {
        int numero = 100; // Inicializamos el número

        // Utilizamos la aritmética para disminuir el número 20 veces
        numero = numero - (1 * 20);
        
        // Mostramos el valor final del número
        System.out.println("El numero solicitado, decrementado 20 veces es: " + numero);
    }
}
