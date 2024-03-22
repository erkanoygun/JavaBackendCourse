import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyGenericList<T> {
    private int _capacity;
    private T[] array;

    public MyGenericList() {
        this(10);
    }

    public MyGenericList(int capacity) {
        _capacity = capacity;
        array = (T[]) new Object[_capacity];
    }

    public int Size()
    {
        int counter = 0;
        for(var i : array){
            if(i != null)
                counter++;
            else
                break;
        }
        return counter;
    }

    public int getCapacity(){
        return _capacity;
    }

    public T getItem(int index){
        return array[index] != null ? array[index] : null;
    }

    public void add(T data){
        boolean isDataAdd = false;
        for(int i=0; i<_capacity; i++){
            if(array[i] == null){
                array[i] = data;
                isDataAdd = true;
                break;
            }
        }

        if(!isDataAdd){
            _capacity += 10;
            T[] newArray = Arrays.copyOf(array, _capacity);
            array = newArray;
            add(data);
        }
    }
}

