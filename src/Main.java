public class Main {
    public static void main(String[] args) {

        int precio = Precio(5000);
        System.out.println("precio = " + precio);

        double iva = Iva(0.18);
        System.out.println("iva = " + iva);

        double ivb = Precio(500) + (Iva(0.18)*Precio(500));
        System.out.println("Precio Iva incluido = " + ivb);

    }

    private static double Iva(double iva) {
        return iva;
    }

    private static int Precio(int precio) {
        return precio;
    }

}
