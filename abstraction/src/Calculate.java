import java.util.*;

public class Calculate {
    public static void main(  String args[] ){
        int arr[] = new int[5];
        int i;
        for(i= 0;i < 5;i++){
            arr[i]=i;
            System.out.println(arr[i]);
        }
        System.out.println();
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add("asd");
        System.out.println("al.size = "+al.size());
        System.out.println(new Integer(al.get(1)).intValue());
//        Iterator it = al.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next() + it.next());
//        }
    }
}
