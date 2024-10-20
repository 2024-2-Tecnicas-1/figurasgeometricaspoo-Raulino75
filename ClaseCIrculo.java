public class ClaseCIrculo extends FiguraGeometrica {
    
    double radio;

    public ClaseCIrculo (){

    }

    public ClaseCIrculo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }


    public double ObtenerArea(double radio){

        double resultado;
        double pi = 3.1415;
        resultado = pi * radio * radio;

        return resultado;
    }

    public double ObtenerPerimetro(double radio) {

        double resultado;
        double pi = 3.1415;
        resultado = 2 * pi * radio;

        return resultado;
    }
}   
