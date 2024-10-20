public class ClaseTriangulo extends FiguraGeometrica {
    
    double base;
    double altura;

    public ClaseTriangulo() {
    }

    public ClaseTriangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public double ObtenerArea(double base, double altura){

        double resultado;
        resultado = base * altura/2;
        return resultado;
    }

    public double ObtenerPerimetro(double base, double altura){

        double resultado;
        double numero;
        resultado = base * base + altura * altura;
        double raiz = Math.sqrt(resultado);
        return resultado;

    }
    
}
