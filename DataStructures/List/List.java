package DataStructures.List;

import Algorithms.BinarySearch.BinarySearch;

public class List {
    private int[] arr;
    public int length;
    public  int capacity;
    private int[] temp;
    // private boolean isSorted = true;

    public List() {
        arr = new int[this.capacity = 5]; // initializing the list with capa = 5
    }
    

    // it appends an element at the tail of the list
    public void append(int data) {
        if (this.length < this.capacity) {
            arr[length] = data;
        } else {
            this.temp = this.arr;
            this.capacity = this.capacity * 2;
            this.arr = new int[this.capacity];

            for (int i = 0; i < this.size(); i++)
                this.arr[i] = temp[i];

            this.arr[length] = data; // Adding the element
        }
        ++this.length;
    }

    // removing element by index
    public void remove(int index) {
        if (index >= 0 && index <= this.length - 1) {
            for (int i = index; i < this.length - 1; i++) {
                this.arr[i] = this.arr[i+1];
            }
            --this.length;
        } else {
            System.out.printf("Error: index %d not found\n", index);
        }
    }

    // searching (binary search)       ## TODO
    // public int binarySearch(int value) {
        // if (isSotred)
        //     return BinarySearch.binarySearch(this.arr, value);
    // }

    // searching (linear) # returns -1 if not found
    public int linearSearch(int value) {
        for (int i = 0; i < this.length; i++) {
            if (this.arr[i] == value) return i;
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
            s = (i!=this.length-1) ? s + arr[i] + ", " : s + arr[i];
        }
        s = s.trim();
        return s + "]";
    }
}