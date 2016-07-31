import java.util.Arrays;

/**
 * Created by Leonid on 31.07.2016.
 */
public class MyArrayList<T> implements MyCollection<T> {
    private Object[] data;
    private int size;
    private int capacity;

    public static final int DEFAULT_CAPACITY = 10;

    public MyArrayList(){
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
        capacity = DEFAULT_CAPACITY;
    }

    public MyArrayList(int capacity){
        data = new Object[capacity];
        size = this.capacity = capacity;
    }

    @Override
    public int push_back(T t) {
        if(size < capacity){
            data[size++] = t;
        }
        else{
            Object[] newData = new Object[size];
            for(int i = 0; i < size; i++){
                newData[i] = data[i];
            }
            data = new Object[size = ++capacity];
            for(int i = 0; i < size - 1; i++){
                data[i] = newData[i];
            }
            data[size] = t;
        }
        return 0;
    }

    @Override
    public T pop_back() {
        T returnValue = this.at(size - 1);
        this.remove(size - 1);
        return returnValue;
    }

    @Override
    public T remove(int index) {
        T returnValue = this.at(index);
        for(int i = index; i < size - 1; i++){
            data[i] = this.at(i + 1);
        }
        --size;
        return returnValue;
    }

    @Override
    public void print() {
        System.out.println("---------------");
        for(int i = 0; i < size; i++)
            System.out.println(data[i]);
    }

    @Override
    public boolean isEmpty() {
        if(size == 0)
            return true;
        else
            return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T at(int index) {
        if(index >= getSize() || this.isEmpty())
            throw new IndexOutOfBoundsException();
        return (T) data[index];
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(this.data, size);
    }
}
