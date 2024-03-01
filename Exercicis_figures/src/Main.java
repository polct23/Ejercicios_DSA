import java.util.Arrays;

public class Main {
    public static double suma(Figura[] v) {
        double res = 0;
        for (int i = 0; i < v.length; i++) {
            res += v[i].area();

        }
        return res;

    }

    public static void sort(Figura[] v) {
        Arrays.sort(v);

    }


    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new Cercle(120);

        double res = suma(v);

        System.out.println("suma: " + res);


    }
}

