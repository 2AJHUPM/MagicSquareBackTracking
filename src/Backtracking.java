/**
 * Created by Antonio on 12/11/2016.
 */
public class Backtracking {
    private int num;
    private Matriz matriz;
    private Booleano bool;
    private int [] array;
    private int constante;

    public Backtracking(int num){
        this.num=num;
        matriz=new Matriz(num);
        bool=new Booleano(false);
        array=new int[num*num];
        constante=num*(num*num+1)/2;
        for(int i=0; i<num*num; i++){
            array[i]=i+1;
        }
    }
    public void backtrack (Matriz matriz, int i, int j, Booleano exito){
        int k=0, candidato;
        do {
            candidato = array[k];
            if(aceptable(candidato, matriz, i, j)){
                matriz.matriz[i][j]=candidato;
                if(esSolucion(matriz)){
                    exito.setValor(true);
                } else {
                    if(j==matriz.matriz.length-1)
                        backtrack(matriz,i+1,0,exito);
                    else backtrack(matriz, i, j+1, exito);
                    if(!exito.getValor()){
                        matriz.matriz[i][j]=0;
                    }
                }

            }

            k++;
        }while((!exito.getValor())&&(k!=array.length));

    }
    public boolean aceptable(int candidato, Matriz m, int x, int y){
    	boolean resul=true;
        for(int i=0; i<m.matriz.length; i++){
            for(int j=0; j<m.matriz.length; j++){
                if(m.matriz[i][j]==candidato)
                    return false;
            }
        }
        if(y==m.matriz.length-1)
        	return (constante==m.sumaFila(x)+candidato);
        if(x==m.matriz.length-1)
        	return (constante==m.sumaColumna(y)+candidato);
        if(x==m.matriz.length-1&&y==0)
        	return (constante==m.sumaDiagonalA()+candidato);
        if(x==m.matriz.length-1&&y==m.matriz.length-1)
        	return (constante==m.sumaDiagonalA()+candidato);
        return resul;
    }
    boolean esSolucion(Matriz m){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<m.matriz.length;i++) {
            for (int j = 0; j < m.matriz.length; j++) {
                sum1 += m.matriz[i][j];
                sum2 +=m.matriz[j][i];
            }
            if(sum1!=constante||sum2!=constante)
                return false;
            sum1=0;
            sum2=0;
        }
        int n=m.matriz.length-1;
        for(int i=0;i<m.matriz.length;i++){
            sum1+=m.matriz[i][i];
            sum2+=m.matriz[n][i];
            n--;
        }
        if(sum1!=constante||sum2!=constante)
            return false;
        return true;
    }
    public void ejecutar(){
        backtrack(matriz, 0, 0, bool);
        matriz.mostrar();
    }

}
