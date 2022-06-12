import java.util.ArrayList;


public class Ciag {

    public static void main(String[] args){

        int n = 4;
        int j = 0;
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        liczby.add(1);
        liczby.add(1);

        Fib(liczby,n, j);

        System.out.println(liczby.get(n));

    }

    public static void Fib(ArrayList<Integer> liczby, int n, int j){
        int sum = liczby.get(j)+liczby.get(j+1);
        liczby.add(sum);
        j++;
        if (liczby.size()!=n+1){
                Fib(liczby, n, j);
        }
    }
}




