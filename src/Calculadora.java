public class Calculadora {
    /**
     <<<<<<< HEAD
     * Método suma
     * @param a El primer número a sumar.
     * @param b El segundo número a sumar.
     * @return La suma de los dos números.
     */
    public double sumar(double a, double b) {
        return (a + b);
    }
    /**
     * Método resta
     * @param a El primer número a sumar.
     * @param b El segundo número a sumar.
     * @return La resta de los dos números.
     */
    public double restar(double a, double b) {
        return (a - b);
    }
    /**
     * Método multiplicar
     * @param a El primer número a sumar.
     * @param b El segundo número a sumar.
     * @return La multiplicacion de los dos números.
     */
    public double multiplicar(double a, double b) {
        return (a * b);
    }
    /**
     * Método dividir
     * @param a El primer número a sumar.
     * @param b El segundo número a sumar.
     * @return La division de los dos números.
     */
    public double dividir(double a, double b) {
        if (b == 0) {//si el segundo número es 0 devuelve 0
            return 0;
        }
        return (a / b);
    }

}
