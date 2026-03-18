public class Circulo extends Figura implements Dibujable {
    public int radio;

    public Circulo(int radio,String nombre) {
        super(nombre);
        this.nombre = nombre;
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        double s = Math.PI*radio*radio;
        return s;
    }
    @Override
    public double calcularPerimetro(){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }


    @Override
    public void dibujar(){
        System.out.printf("Dibujando ...." + nombre);
    }
}
