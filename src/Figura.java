public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void mostrar() {
        System.out.printf("\n Nombre:" + nombre);
        System.out.printf("Area:" + calcularArea());
        System.out.printf("Perimetro" + calcularPerimetro());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
