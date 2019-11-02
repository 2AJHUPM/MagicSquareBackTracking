/**
 * Created by bm0587 on 19/09/2016.
 */
public class Booleano {
    private boolean bool;
    public Booleano (boolean v){
        bool=v;
    }
    public Booleano(){

    }
    public void setValor(boolean v){
        bool=v;
    }
    public boolean getValor(){
        return bool;
    }
    @Override
    public String toString(){
        return (""+bool);
    }
}
