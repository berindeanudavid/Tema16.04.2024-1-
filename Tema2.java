import java.util.Scanner;
import java.util.HashSet;

public class Tema2 {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        s.close();
//Write your code here
       HashSet<String>set=new HashSet<String>();
        String aux=pair_left[0]+","+pair_right[0];
        int count=1;
        set.add(aux);
        System.out.println(count);
        for(int i=1; i<t;i++){
            aux=pair_left[i]+","+pair_right[i];
            if(!set.contains(aux)){
                set.add(aux);
                count++;
            }
            System.out.println(count);
        }
    }
}
