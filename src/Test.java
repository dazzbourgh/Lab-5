import java.util.Collections;

/**
 * Created by Leonid on 31.07.2016.
 */
public class Test {
    public static void main(String[] args){
        MyCollection<Integer> list = new MyArrayList<>();
        list.push_back(11);
        list.push_back(3);
        list.push_back(7);
        list.push_back(2);
        list.print();
        list.remove(2);
        list.print();
        list.pop_back();
        list.print();
        //???
        //Integer[] arr = (Integer[])list.toArray();
        //System.out.println("----");
        //System.out.println(arr[0]);
    }
}
