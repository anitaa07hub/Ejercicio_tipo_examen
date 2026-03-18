import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figura c = new Circulo(2, "Circulo 1");
        Figura r = new Rectangulo(3,4,"Cuadrado 1");
        Figura t = new Triangulo(1, 2,3,"Triángulo 1");


        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(c);
        figuras.add(r);
        figuras.add(t);

        for (Figura figura : figuras) {
            System.out.println(figura.calcularPerimetro());
            System.out.println(figura.calcularArea());
            figura.mostrar();
            ((Dibujable)figura).dibujar();
        }
    }
}
