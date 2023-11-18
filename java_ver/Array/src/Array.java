public class Array {
    private int[] data;
    private int size;


    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int e) {
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }

    public void add(int index, int e) {
        if(size == data.length)
            throw new IllegalArgumentException("method add field. Array is full.");
        if(index < 0 || index > size)
            throw new IllegalArgumentException("method add field. Require index >0 and < size");
        for(int i = size - 1; i >= index; i --) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size ++;

    }

    int get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed.Index is illegal");
        return data[index];
    }

    void set(int index, int e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed.Index is illegal");
        data[index] = e;
    }

    public boolean contains(int e){
        for(int i = 0; i < size; i ++){
            if(data[i] == e)
                return true;
        }
        return false;
    }

    public int find(int e){
        for(int i = 0; i < size; i ++){
            if(data[i] == e)
                return i;
        }
        return -1;
    }

    // 删除指定位置元素
    public int remove(int index){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("method add field. Require index >0 and < size");
        int removeValue = data[index];
        for(int i = index + 1; i < size; i ++){
            data[i - 1] = data[i];
        }
        size --;

        return removeValue;
    }

    public int removeFirst(){
        return remove(0);
    }

    public int removeLast(){
        return remove(size - 1);
    }

    public void removeElement(int e){
        int index = find(e);
        if(index != -1)
            remove(index);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0; i < size; i ++) {
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append("]");
        return res.toString();
    }
}
