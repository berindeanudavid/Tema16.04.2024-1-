import java.util.ArrayList;

public class Tema1{
    public ArrayList<String> swapFirstLast(ArrayList<String> list){
        if(list.size()==0||list.size()==1){
            return list;
        }
        String aux=list.get(0);
        list.set(0,list.get(list.size()-1));
        list.set(list.size()-1,aux);
        return list;
    }
}