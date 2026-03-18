public class Rectangulo extends Figura implements Dibujable{
    private int lado1;
    private int lado2;

    public Rectangulo(int lado1, int lado2, String nombre) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.nombre = nombre;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea(){
        return lado1 * lado2;
    }
    @Override
    public double calcularPerimetro(){
        double perimetro = 2*(lado1 + lado2);
        return perimetro;
    }
    @Override
    public void dibujar(){
        System.out.printf("Dibujando ...." + nombre);
    }
}