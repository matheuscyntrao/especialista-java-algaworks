public class Casting {

    public static void main(String[] args) {

        double peso1 = 20.5;

        float peso2 = (float) peso1;

        System.out.println(peso1);
        System.out.println(peso2);


        float taxa1 = 934.5f;
        // double taxa2 = taxa1;
        double taxa2 = (double) taxa1; // instrução de casting é opcional

        System.out.println(taxa1);
        System.out.println(taxa2);

        /**/

        double largura = 100.37;
        // int tamanho = largura; // não compila

        int tamanho = (int) largura; // isso compila

        System.out.println(tamanho);

        /**/

        int y = 102344;

        // long x = y;
        long x = (long) y; // instrução de casting é opcional

        System.out.println(y);
        System.out.println(x);

        /**/

        long x = 10;

        // int y = x; // não compila

        int y = (int) x;

        System.out.println(x);
        System.out.println(y);


        long a = 9300000035L;
        int b = (int) a;
        System.out.println(a);
        System.out.println(b);

    }

}
