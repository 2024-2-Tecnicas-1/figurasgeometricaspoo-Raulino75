public class ClaseRectangulo extends FiguraGeometrica {
    
    double lado1;
    double lado2;

    public ClaseRectangulo() {
    }

    public ClaseRectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double ObtenerArea(double lado1, double lado2){

        double resultado;
        resultado = lado1 * lado2;
        return resultado;
    }

    public double ObtenerPerimetro(double lado1, double lado2){

        double resultado;
        resultado = lado1 * 2 + lado2 * 2;
        return resultado;

    }
    
}
