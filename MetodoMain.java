import java.util.Scanner;

public class MetodoMain {
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        int opcion;

        FiguraGeometrica figura = new FiguraGeometrica();
        System.out.println("Ingrese el nombre de la figura");
        figura.setNombre(datos.nextLine());
        System.out.println("Ingrese el color de la figura");
        figura.setColor(datos.nextLine());
        System.out.println("Ingrese el tipo de figura");
        System.out.println("1) Circulo 2) Rectangulo 3) Triangulo ");
        opcion = datos.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el radio del circulo:");
                double radio = datos.nextDouble();
                ClaseCIrculo circulo = new ClaseCIrculo(figura.getNombre(), figura.getColor(), radio);  
                System.out.println("El area es: " + circulo.ObtenerArea(radio));
                System.out.println("El perimetro es: " + circulo.ObtenerPerimetro(radio));
                break;              
            case 2:
                double lado1, lado2;
                System.out.println("Ingrese el valor del lado1 del rectangulo");
                lado1 = datos.nextDouble();
                System.out.println("Ingrese el valor de lado 2 del rectangulo ");
                lado2 = datos.nextDouble();
                ClaseRectangulo rectangulo = new ClaseRectangulo(figura.getNombre(), figura.getColor(), lado1,lado2);
                System.out.println("El area es: " + rectangulo.ObtenerArea(lado1, lado2));
                System.out.println("El perimetro es: " + rectangulo.ObtenerPerimetro(lado1, lado2));
                break;
            case 3:
                double altura, base;
                System.out.println("Ingrese el valor de la Altura");
                altura = datos.nextDouble();
                System.out.println("Ingrese la base del triangulo");
                base = datos.nextDouble();
                ClaseTriangulo triangulo = new ClaseTriangulo(figura.getNombre(), figura.getColor(), altura, base);
                System.out.println("El area es: " + triangulo.ObtenerArea(base, altura));
                System.out.println("El area es: " + triangulo.ObtenerPerimetro(base, altura));
            default:
                break;
        }

    }

    
}
