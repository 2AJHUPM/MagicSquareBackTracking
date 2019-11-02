/**
 * Created by Antonio on 12/11/2016.
 */
public class Matriz {
    protected int [][] matriz;
    public Matriz (int n){
        matriz=new int [n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                matriz [i][j]=0;
    }
    public void mostrar(){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++)
                System.out.print("\t"+matriz[i][j]);
            System.out.print("\n");
        }
        System.out.println("");
    }
    public int sumaFila(int n){
    	int resul=0;
    	for(int i=0;i<matriz.length;i++)
    		resul=resul+matriz[n][i];
    	return resul;
    }
    public int sumaColumna(int n){
    	int resul=0;
    	for(int i=0;i<matriz.length;i++)
    		resul=resul+matriz[i][n];
    	return resul;
    }
    public int sumaDiagonalD(){
    	int resul=0;
    	for(int i=0;i<matriz.length;i++)
    		resul=resul+matriz[i][i];
    	return resul;
    }
    public int sumaDiagonalA(){
    	int resul=0;
    	for(int i=0,n=matriz.length;i<matriz.length;i++,n--)
    		resul=resul+matriz[n][i];
    	return resul;
    }
}
