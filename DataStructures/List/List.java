package DataStructures.List;

import java.util.concurrent.SynchronousQueue;

public class List {
    private int[] arr;
    public int length;
    public int capacity;
    // private boolean isSorted = true;

    public List() {
        arr = new int[this.capacity = 5]; // initializing the list with capa = 5
    }

    // it appends an element at the tail of the list
    public void append(int data) {
        if (this.length < this.capacity) {
            arr[length] = data;
        } else {
            int[] temp = this.arr;
            this.capacity = this.capacity * 2;
            this.arr = new int[this.capacity];

            for (int i = 0; i < this.size(); i++)
                this.arr[i] = temp[i];

            this.arr[length] = data; // Adding the element
        }
        ++this.length;
    }

    // it inserts the given element at a particular index
    public void insert(int value, int index) {
        if (index <= this.length && index >= 0) {
            if (this.length < this.capacity) {
                System.out.println("Hi there!");
                for (int i = this.length; i > index; i--) {
                    this.arr[i] = this.arr[i - 1];
                }
                this.arr[index] = value; // Adding the element
            } else {
                int[] temp = this.arr;
                this.capacity = this.capacity * 2;
                this.arr = new int[this.capacity];

                for (int i = 0; i < this.size() + 1; i++) {
                    if (i < index)
                        this.arr[i] = temp[i];
                    else if (i == index) {
                        this.arr[i] = value;
                    } else {
                        this.arr[i] = temp[i - 1];
                    }
                }
            }
            ++this.length;
        } else {
            System.out.println("Error: index should be 0 <= index <= " + this.length);
        }

    }

    // removing element by index
    public void remove(int index) {
        if (index >= 0 && index <= this.length - 1) {
            for (int i = index; i < this.length - 1; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            --this.length;
        } else {
            System.out.printf("Error: index %d not found\n", index);
        }
    }

    // searching (binary search) ## TODO
    // public int binarySearch(int value) {
    // if (isSotred)
    // return BinarySearch.binarySearch(this.arr, value);
    // }

    // searching (linear) # returns -1 if not found
    public int linearSearch(int value) {
        for (int i = 0; i < this.length; i++) {
            if (this.arr[i] == value)
                return i;
        }
        return -1;
    }

    // it reterns the appearing length of the array
    public int size() {
        return this.length;
    }

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < this.length; i++) {
            s = (i != this.length - 1) ? s + arr[i] + ", " : s + arr[i];
        }
        s = s.trim();
        return s + "]";
    }
}
