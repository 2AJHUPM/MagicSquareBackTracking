import java.util.Scanner;

/**
 * Created by Antonio on 12/11/2016.
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduzca tamaño de la matriz: ");
        num=sc.nextInt();
        Backtracking back = new Backtracking(num);
        back.ejecutar();
    }
}
