import java.util.Arrays;

public class GestorFiguras {
    public static void sort(Figura[] v){
        Arrays.sort(v);
    }
    public static double suma(Figura[] v) {
        double result = 0;
        for (Figura f : v) {
            result += f.area();
        }
        return result;
    }
    public static void print(Figura[] v) {
        for (Figura figura : v) {
            System.out.println("La figura es: "+figura.toString()+", area: "+figura.area()+" m^2");
        }
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5,3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new TriangleEq(120, 50);

        double res = suma(v);

        System.out.println("Figures desordenades: ");
        print(v);

        sort(v);

        System.out.println("  ");
        System.out.println("Figures ordenades: ");
        print(v);

        System.out.println("  ");
        System.out.println("La suma de les figures es: "+res + " m^2");

    }
}
