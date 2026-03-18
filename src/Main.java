public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(2, "Circulo 1");
        Rectangulo cc = new Rectangulo(3,4,"Cuadrado 1");
        Triangulo t = new Triangulo(1, 2,3,"Triángulo 1");

        System.out.println(c.calcularPerimetro());
        System.out.println(c.calcularArea());
        c.dibujar();
        c.mostrarCirculo();

        System.out.println(cc.calcularPerimetro());
        System.out.println(cc.calcularArea());
        cc.dibujar();
        cc.mostrarCuadrado();

        System.out.println(t.calcularPerimetro());
        System.out.println(t.calcularArea());
        t.dibujar();
        t.mostrarTriangulo();

    }
}
