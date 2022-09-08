public class Ejercicio {

    public static void main(String[] args) {
        
        sumar(5, 5, 5);

        System.out.println();

        Coche c = new Coche();

        c.incrementarPuerta();
        c.incrementarPuerta();
        c.incrementarPuerta();

        System.out.println("Número de puertas: " + c.verPuertas());
    }

    public static void sumar(int num1, int num2, int num3){
        int resultado = num1 + num2 + num3;
        System.out.println("Resultado de la suma: " + resultado);
        
    }
    
}


