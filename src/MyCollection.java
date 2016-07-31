/**
 * Created by Leonid on 31.07.2016.
 */
public interface MyCollection <T> {
    int push_back(T t);
    T pop_back();
    T remove(int index);
    boolean isEmpty();
    int getSize();
    Object[] toArray();
    T at(int index);
    void print();
}
