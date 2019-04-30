package com.epam.park.dop;

import java.util.Arrays;

public class DynamicArray<T> {

    private static final int CAPACITY = 10;
    private Object[] array;
    private int size;

    public DynamicArray() {
        array = new Object[10];
    }

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            array = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Wrong capacity");
        }
    }

    public void add(T value) {
        if (size > CAPACITY) {
            increaseArray();
        }
        array[size++] = value;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    public void remove(T element) {
        int elementIndex = indexOf(element);
        if (elementIndex >= 0) {
            remove(elementIndex);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            result.append(array[i] + ", ");
        }
        result.append(array[size - 1] + "]");
        return result.toString();
    }

    private void increaseArray() {
        int newCapacity = Math.round(array.length * 1.5F);
        array = Arrays.copyOf(array, newCapacity);
    }

    private void checkIndex(int index) {
        if (index >= array.length - 1) {
            throw new IndexOutOfBoundsException(String.format("There is no element with %d index", index));
        }
    }

    private int indexOf(T element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
