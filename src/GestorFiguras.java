public class GestorFiguras {
    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5,3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new TriangleEq(120, 50);

        double res = suma(v);

        System.out.println("suma: "+res);

        print(v);

        sort(v);

        print(v);

    }
}
